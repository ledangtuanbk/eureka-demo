package com.ldt.musiccategoryservice.services;

import com.ldt.musiccategoryservice.models.MusicRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tledang
 */
@Service
public class RatingService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getMusicRatingFallback")
    public MusicRating getMusicRating(long id) {
        return restTemplate.getForObject("http://music-rating-service/rating/get/" + id, MusicRating.class);
    }

    public MusicRating getMusicRatingFallback(long id) {
        MusicRating musicRating = new MusicRating();
        musicRating.setId(id);
        musicRating.setValue(-1);
        return musicRating;
    }

}
