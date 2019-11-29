package com.ldt.musicinfoservice;

import com.ldt.musicinfoservice.models.Music;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author tledang
 */
@RestController
@RequestMapping("/info")
public class MusicInfoController {

    @RequestMapping("/get/{id}")
    public Music getDetail(@PathVariable("id") int id) throws InterruptedException {
        return new Music(id, "music name");
    }
}
