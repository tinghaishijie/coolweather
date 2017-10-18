package com.te.zheng.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zheng on 2017/10/18.
 */

public class Now {

    @SerializedName("tmp")
    public String temperatrure;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }
}
