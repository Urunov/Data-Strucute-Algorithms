package com.example.ec.web;

import com.example.ec.domain.TourRating;
import com.example.ec.service.TourRatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Mary Ellen Bowman
 */
@RestController
@RequestMapping(path = "/ratings")
public class RatingController {
    private TourRatingService tourRatingService;

    @Autowired
    public RatingController(TourRatingService tourRatingService) {
        this.tourRatingService = tourRatingService;
    }

    @GetMapping
    public List<TourRating> getAll() {
        return tourRatingService.lookupAll();
    }

    @GetMapping("/{id}")
    public TourRating getRating(@PathVariable("id") Integer id) {
        return tourRatingService.lookupRatingById(id)
                .orElseThrow(() -> new NoSuchElementException("Rating " + id + " not found")
                );
    }


    /**
     * Exception handler if NoSuchElementException is thrown in this Controller
     *
     * @param ex exception
     * @return Error message String.
     */
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoSuchElementException.class)
    public String return400(NoSuchElementException ex) {
        return ex.getMessage();
    }
}
