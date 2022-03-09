package com.example.ec.service;

import com.example.ec.domain.TourRating;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by Mary Ellen Bowman
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TourRatingServiceTest {
    @Autowired
    private TourRatingService service;

    @Test
    public void rateMany() {
        int ratings = service.lookupAll().size();
        Integer customers[] = {100, 101, 102};
        service.rateMany(1, 3, customers);
        assertThat(service.lookupAll().size() == (ratings + 3), is(true));
    }

    @Test(expected = DataIntegrityViolationException.class)
    public void rateManyProveRollback() {
        int ratings = service.lookupAll().size();
        Integer customers[] = {100, 101, 102};
        service.rateMany(1, 3, customers);
        service.rateMany(1, 3, customers);
    }

    @Test
    public void createNew() {
        service.createNew(1, 456, 2, "it was fair");
        assertThat(service.lookupAll().stream()
                .filter(tourRating -> tourRating.getTour().getId() == 1 && tourRating.getCustomerId() == 456)
                .findFirst().isPresent(), is(true));
    }

    @Test(expected = NoSuchElementException.class)
    public void createNewException() {
        service.createNew(123, 456, 2, "it was fair");
    }
    @Test
    public void update() {
        Integer tourId = 1;
        Integer customerId = 4;
        TourRating tourRating = service.update(tourId, customerId, 1, "one");
        assertThat(tourRating.getTour().getId(), is(tourId));
        assertThat(tourRating.getCustomerId(), is(customerId));
        assertThat(tourRating.getScore(), is(1));
        assertThat(tourRating.getComment(), is("one"));
    }

    @Test(expected = NoSuchElementException.class)
    public void updateException() throws Exception {
        service.update(1, 1, 1, "one");
    }

    @Test
    public void updateSome() {
        Integer tourId = 1;
        Integer customerId = 4;
        TourRating tourRating = service.updateSome(tourId, customerId, 1, "one");
        assertThat(tourRating.getTour().getId(), is(tourId));
        assertThat(tourRating.getCustomerId(), is(customerId));
        assertThat(tourRating.getScore(), is(1));
        assertThat(tourRating.getComment(), is("one"));
    }

    @Test(expected = NoSuchElementException.class)
    public void updateSomeException() throws Exception {
        service.update(1, 1, 1, "one");
    }

    @Test
    public void getAverageScore() {
        assertTrue(service.getAverageScore(1) == 4.0);
    }

    @Test(expected = NoSuchElementException.class)
    public void getAverageScoreException() {
        service.getAverageScore(1123); //That tour does not exist
    }

    @Test
    public void delete() {
        TourRating tourRating = service.lookupRatingById(1).get();
        service.delete(tourRating.getTour().getId(), tourRating.getCustomerId());
        assertThat(service.lookupRatingById(tourRating.getId()).isPresent(), is(false));
    }

    @Test(expected = NoSuchElementException.class)
    public void deleteException() {
        service.delete(1234, 1234);
    }
}