package com.example.ec.web;

import com.example.ec.domain.Tour;
import com.example.ec.domain.TourRating;
import com.example.ec.service.TourRatingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Matchers.anyList;
import static org.mockito.Mockito.when;

/**
 * Created by Mary Ellen Bowman.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class RatingControllerTest {
    @MockBean
    private TourRatingService service;

    @Mock
    private TourRating tourRating;


    @Autowired
    private TestRestTemplate restTemplate;

    @Before
    public void setup() {
        when(tourRating.getComment()).thenReturn("comment");
        when(tourRating.getScore()).thenReturn(1);
        when(tourRating.getCustomerId()).thenReturn(3);
    }

    @Test
    public void getOne() throws Exception {
        when(service.lookupRatingById(1)).thenReturn(Optional.of(tourRating));

        ResponseEntity<RatingDto> response = restTemplate.getForEntity("/ratings/1", RatingDto.class);

        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        dtoTest(response.getBody());
    }

    @Test
    public void getRatings() throws Exception {
        when(service.lookupAll()).thenReturn(Arrays.asList(tourRating));

        ParameterizedTypeReference<List<RatingDto>> dtos = new ParameterizedTypeReference<List<RatingDto>>() {};
        ResponseEntity<List<RatingDto>> response = restTemplate.exchange("/ratings", HttpMethod.GET,null,dtos);

        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        List<RatingDto> results = (List<RatingDto>)response.getBody();
        dtoTest(results.get(0));
    }

    private void dtoTest(RatingDto dto){
        assertThat(dto.getComment(), is("comment"));
        assertThat(dto.getScore(), is(1));
        assertThat(dto.getCustomerId(), is(3));

    }

}