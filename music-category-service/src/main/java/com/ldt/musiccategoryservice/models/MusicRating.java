package com.ldt.musiccategoryservice.models;

/**
 * @author tledang
 */
public class MusicRating {
    private long id;
    private int value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
