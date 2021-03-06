package com.example.asus.weathernow.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asus on 2017/1/23.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("tex")
        public String info;
    }
}
