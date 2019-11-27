package com.ldt.musiccategoryservice.models;

/**
 * @author tledang
 */
public class Category {
    private String name;
    private int type;

    public Category(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
