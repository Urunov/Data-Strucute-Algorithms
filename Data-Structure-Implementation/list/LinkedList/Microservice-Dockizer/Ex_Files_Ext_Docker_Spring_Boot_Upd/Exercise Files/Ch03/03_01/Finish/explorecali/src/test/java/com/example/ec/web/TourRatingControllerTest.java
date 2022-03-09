package com.example.ec.web;

import com.example.ec.domain.TourRating;
import com.example.ec.service.TourRatingService;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by Mary Ellen Bowman.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TourRatingControllerTest {
    @MockBean
    private TourRatingService service;

    @Mock
    private TourRating tourRating;

    private String tourRatingJson =
            "      \"score\" : 1,\n" +
            "      \"comment\" : \"comment\",\n" +
            "      \"customerId\" : 3";

    private RatingDto ratingDto = new RatingDto(1, "comment",3);

    @Autowired
    private TestRestTemplate restTemplate;


    @Before
    public void setup() {
        when(tourRating.getComment()).thenReturn("comment");
        when(tourRating.getScore()).thenReturn(1);
        when(tourRating.getCustomerId()).thenReturn(3);
    }

    @Test
    public void createTourRating() throws Exception {
        restTemplate.postForEntity("/tours/1/ratings", ratingDto, Void.class);

        verify(this.service).createNew(1, 3, 1, "comment");
    }

    @Test
    public void createManyTourRatings() throws Exception {
        restTemplate.postForEntity("/tours/1/ratings/3?customers=1", ratingDto, Void.class);

        Integer [] customers = {1};
        verify(service).rateMany(1, 3, customers);
    }

    @Test
    public void getAllRatingsForTour() throws Exception {
        List<TourRating> listOfTourRatings = Arrays.asList(tourRating);
        Page<TourRating> page = new PageImpl(listOfTourRatings, new PageRequest(0,10),1);
        when(service.lookupRatings(anyInt(),any(Pageable.class))).thenReturn(page);

        ResponseEntity<String> response = restTemplate.getForEntity("/tours/1/ratings",String.class);

        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody().contains(tourRatingJson), is(true));
    }

    @Test
    public void getAverage() throws Exception {
        when(service.getAverageScore(1)).thenReturn(3.2);

        ResponseEntity<String> response = restTemplate.getForEntity("/tours/1/ratings/average", String.class);

        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody(), is("{\"average\":3.2}"));
    }

    @Test
    public void updateWithPut() throws Exception {
        when(service.update(1, 3, 1, "comment")).thenReturn(tourRating);

        restTemplate.put("/tours/1/ratings", ratingDto);

        verify(service).update(1, 3, 1, "comment");
    }


    /**
     *  RestTemplate Patch only works if it uses httpclient. Method will only work if:
     *  1. Include dependency
     *      <dependency>
     *            <groupId>org.apache.httpcomponents</groupId>
     *           <artifactId>httpclient</artifactId>
     *           <version>4.4.1</version>
     *       </dependency>
     *  2. Attach httpclient
     *      restTemplate.getRestTemplate().setRequestFactory(new HttpComponentsClientHttpRequestFactory());
     */
    @Test
    @Ignore
    public  void updateWithPatch() {

        when(service.updateSome(1, 3, 1, "comment")).thenReturn(tourRating);

        restTemplate.patchForObject("/tours/1/ratings", ratingDto, RatingDto.class);

        verify(service).updateSome(1, 3, 1, "comment");

    }

    @Test
    public void delete() throws Exception {
        restTemplate.delete("/tours/1/ratings/3");

        verify(service).delete(1, 3);
    }

}