package com.toshevski.android.bands;

/**
 * Created by l3ft on 11/16/15.
 */
public class Song {
    private String name;
    private String description;
    private int duration;

    public Song(String name, int duration, String description) {
        this.name = name;
        this.duration = duration;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}
