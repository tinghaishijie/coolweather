package com.te.zheng.coolweather.gson;

/**
 * Created by zheng on 2017/10/18.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public  String aqi;

        public String pm25;
    }
}
