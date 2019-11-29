package com.ldt.musiccategoryservice.resources;

import com.ldt.musiccategoryservice.models.Category;
import com.ldt.musiccategoryservice.models.MusicInfo;
import com.ldt.musiccategoryservice.models.MusicRating;
import com.ldt.musiccategoryservice.services.InfoServices;
import com.ldt.musiccategoryservice.services.RatingService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author tledang
 */
@RestController
@RequestMapping("/category")
public class CategoryResource {


    @Autowired
    RestTemplate restTemplate;

    @Autowired
    InfoServices infoServices;

    @Autowired
    RatingService ratingService;


    @GetMapping("/get/{id}")
//    @HystrixCommand(fallbackMethod = "getDetailFallback",
//            commandProperties = {
//                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "20000"),
//                    @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
//                    @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
//                    @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "40000")
//            },
//            threadPoolKey = "movieInfoPool",
//            threadPoolProperties = {
//                    @HystrixProperty(name = "coreSize", value = "10"),
//                    @HystrixProperty(name = "maxQueueSize", value = "5")
//            }
//    )
    public Category getDetail(@PathVariable("id") long id) {
        MusicInfo musicInfo = infoServices.getMusicInfo(id);
        MusicRating musicRating = ratingService.getMusicRating(id);
        Category category = new Category();
        category.setMusicInfo(musicInfo);
        category.setMusicRating(musicRating);
        return category;
    }
}
