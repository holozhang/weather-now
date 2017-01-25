package com.example.asus.weathernow.gson;

/**
 * Created by asus on 2017/1/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
