package com.ldt.musicratingservice.models;

/**
 * @author tledang
 */
public class Rating {
    private long id;
    private int value;

    public Rating(long id, int value) {
        this.id = id;
        this.value = value;
    }

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
