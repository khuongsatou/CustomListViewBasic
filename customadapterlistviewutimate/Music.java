package com.example.customadapterlistviewutimate;

public class Music {
    private String name;
    private String time;

    public Music(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public Music() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
