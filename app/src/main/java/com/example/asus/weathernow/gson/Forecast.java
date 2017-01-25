package com.example.asus.weathernow.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/1/23.
 */

public class Forecast {
    public String data;

    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }

    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
