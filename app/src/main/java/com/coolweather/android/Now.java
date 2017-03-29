package com.coolweather.android;

import com.google.gson.annotations.SerializedName;

/**
 * Created by YXF on 2017/3/28.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
