package com.ldt.musicinfoservice;

import com.ldt.musicinfoservice.models.Music;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tledang
 */
@RestController
@RequestMapping("/music-info")
public class MusicInfoController {

    @RequestMapping("/detail/{id}")
    public Music getDetail(@PathVariable("id") int id) {
        System.out.println("getDetail " + id);
        return new Music(id, "music name");
    }
}
