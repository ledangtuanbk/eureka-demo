package com.ldt.musiccategoryservice.models;

/**
 * @author tledang
 */
public class Category {
    private MusicInfo musicInfo;
    private MusicRating musicRating;

    public MusicInfo getMusicInfo() {
        return musicInfo;
    }

    public void setMusicInfo(MusicInfo musicInfo) {
        this.musicInfo = musicInfo;
    }

    public MusicRating getMusicRating() {
        return musicRating;
    }

    public void setMusicRating(MusicRating musicRating) {
        this.musicRating = musicRating;
    }
}
