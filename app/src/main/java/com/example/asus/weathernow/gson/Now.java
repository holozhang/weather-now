package com.example.asus.weathernow.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/1/23.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
