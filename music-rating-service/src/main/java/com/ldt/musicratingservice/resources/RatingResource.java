package com.ldt.musicratingservice.resources;

import com.ldt.musicratingservice.models.Rating;
import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tledang
 */
@RestController
@RequestMapping(path = "/rating")
public class RatingResource {

    @GetMapping("/get/{id}")
    public Rating getRating(@PathVariable("id") long id){
         return new Rating(id, RandomUtils.nextInt(10));
    }

}
