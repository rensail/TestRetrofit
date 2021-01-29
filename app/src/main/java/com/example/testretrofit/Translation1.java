package com.example.testretrofit;


/**
 * {
 *    "success":"1",
 *
 * "result":{
 *    "weaid":"1",
 *    "days":"2021-01-29",
 *    "week":"星期五",
 *    "cityno":"beijing",
 *    "citynm":"北京",
 *    "cityid":"101010100",
 *    "temperature":"2℃/-7℃",
 *    "temperature_curr":"-8℃",
 *    "humidity":"34%",
 *    "aqi":"38",
 *    "weather":"晴",
 *    "weather_curr":"晴",
 *    "weather_icon":"http://api.k780.com/upload/weather/d/0.gif",
 *    "weather_icon1":"",
 *    "wind":"东北风",
 *    "winp":"2级",
 *    "temp_high":"2",
 *    "temp_low":"-7",
 *    "temp_curr":"-8",
 *    "humi_high":"0",
 *    "humi_low":"0",
 *    "weatid":"1",
 *    "weatid1":"",
 *    "windid":"1",
 *    "winpid":"2",
 *    "weather_iconid":"0"
 *    }
 * }
 */
public class Translation1 {

     private String success;
     private result result;

     private  class result{
         private  String weaid;
         private  String days;
         private  String week;
         private  String cityno;
         private  String citynm;
         private  String cityid;
         private  String temperature;
         private  String temperature_curr;
         private  String humidity;
         private  String aqi;
         private  String weather;
         private  String weather_curr;
         private  String weather_icon;
         private  String weather_icon1;
         private  String wind;
         private  String winp;
         private  String temp_high;
         private  String temp_low;
         private  String temp_curr;
         private  String humi_high;
         private  String humi_low;
         private  String weatid;
         private  String weatid1;
         private  String windid;
         private  String winpid;
         private  String weather_iconid;
     }

     public   void show(){
         System.out.println(success);
         System.out.println(result.weaid);
         System.out.println(result.days);
         System.out.println(result.week);
         System.out.println(result.cityno);
         System.out.println(result.citynm);
         System.out.println(result.cityid);
         System.out.println(result.temperature);
         System.out.println(result.temperature_curr);
         System.out.println(result.humidity);
         System.out.println(result.aqi);
         System.out.println(result.weather);
         System.out.println(result.weather_curr);
         System.out.println(result.weather_icon);
         System.out.println(result.weather_icon1);
         System.out.println(result.wind);
         System.out.println(result.winp);
         System.out.println(result.temp_high);
         System.out.println(result.temp_low);
         System.out.println(result.temp_curr);
         System.out.println(result.humi_high);
         System.out.println(result.humi_low);
         System.out.println(result.weatid);
         System.out.println(result.weatid1);
         System.out.println(result.windid);
         System.out.println(result.winpid);
         System.out.println(result.weather_iconid);

     }
}
