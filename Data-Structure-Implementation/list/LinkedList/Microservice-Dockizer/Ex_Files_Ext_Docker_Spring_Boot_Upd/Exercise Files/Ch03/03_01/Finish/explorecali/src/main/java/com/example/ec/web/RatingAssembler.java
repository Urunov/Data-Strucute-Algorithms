package com.example.ec.web;

import com.example.ec.domain.TourRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Rating Assembler, convert TourRating to a Hateoas Supported Rating class
 *
 * Created by maryellenbowman.
 */
@Component
public class RatingAssembler extends ResourceAssemblerSupport<TourRating,RatingDto> {
    private PagedResourcesAssembler<RatingDto> pagedAssembler;

    @Autowired
    public RatingAssembler(PagedResourcesAssembler pagedAssembler) {
        super(RatingController.class, RatingDto.class);
        this.pagedAssembler = pagedAssembler;
    }
    /**
     *  Generates "self" and "rating":{ "href": "/explorecali/ratings/id"}
     *
     * @param tourRating Tour Rating Entity
     * @return
     */
    @Override
    public RatingDto toResource(TourRating tourRating) {
        RatingDto rating = new RatingDto(tourRating.getScore(), tourRating.getComment(), tourRating.getCustomerId());
        int id = tourRating.getId();

        // "href" : "explorecali/ratings/id"
        ControllerLinkBuilder link = linkTo(methodOn(RatingController.class).getRating(id));

        //"self" : "href"
        rating.add(link.withSelfRel());

        //"rating" : "href"
        rating.add(link.withRel("rating"));

       return rating;
    }

}
