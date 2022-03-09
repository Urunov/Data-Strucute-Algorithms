package com.example.ec.service;

import com.example.ec.domain.TourPackage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/*
 * Created by Mary Ellen Bowman
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class TourPackageServiceTest {
    @Autowired
    private TourPackageService service;

    @Test
    public void createNew() {
        long total = service.total();
        TourPackage tourPackage = service.createTourPackage("NP", "New Package");
        assertThat(tourPackage.getCode(), is("NP"));
        assertThat(tourPackage.getName(), is("New Package"));
        assertThat(service.total(), is(total + 1));
    }
}
