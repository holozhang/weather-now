package com.example.asus.weathernow.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/1/23.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
