package com.ldt.musiccategoryservice.services;

import com.ldt.musiccategoryservice.models.MusicInfo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tledang
 */
@Service
public class InfoServices {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getMusicInfoFallback")
    public MusicInfo getMusicInfo(long id) {
        return restTemplate.getForObject("http://music-info-service/info/get/" + id, MusicInfo.class);
    }

    public MusicInfo getMusicInfoFallback(long id) {
        MusicInfo musicInfo = new MusicInfo();
        musicInfo.setId(-1);
        musicInfo.setName("fallback name");
        return musicInfo;
    }
}
