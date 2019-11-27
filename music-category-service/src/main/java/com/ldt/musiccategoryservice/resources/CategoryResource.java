package com.ldt.musiccategoryservice.resources;

import com.ldt.musiccategoryservice.models.Category;
import com.ldt.musiccategoryservice.models.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

/**
 * @author tledang
 */
@RestController
@RequestMapping("/category")
public class CategoryResource {


    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/get-all")
    public List<Category> getAll() {
        Music music = restTemplate.getForObject("http://music-info-service/music-info/detail/1" , Music.class);
        return Collections.singletonList(new Category(music.getName(), music.getId()));
    }
}
