package com.example.machenike.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Suggestion {

    @SerializedName("comf")
    public Comfor comfor;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfor{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("tex")
        public String info;

    }

    public class CarWash{

        @SerializedName("text")
        public String info;
    }

}
