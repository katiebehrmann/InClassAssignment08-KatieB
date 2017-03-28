package com.example.android.inclassassignment08_katieb;

import java.io.Serializable;

/**
 * Created by katie on 3/27/17.
 */
public class RoadTrip implements Serializable {

    private String place;
    private int miles;
    private boolean beenThere;

    public RoadTrip(String place, int miles, boolean beenThere) {
        this.place = place;
        this.miles = miles;
        this.beenThere = beenThere;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getWeather() {
        return miles;
    }

    public void setWeather(int weather) {
        this.miles = weather;
    }

    public boolean isBeenThere() {
        return beenThere;
    }

    public void setBeenThere(boolean beenThere) {
        this.beenThere = beenThere;
    }

    @Override
    public String toString() {
        return "Place: " + place + '\n' +
                "Miles: " + miles + '\n' +
                "I have been there: " + beenThere + "\n" + "\n";
    }


}