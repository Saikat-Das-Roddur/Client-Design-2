package com.saikat.clientdesign2.Models;

public class Weather {

    String day,date,time,comment;
    int todayWeatherImage,oneHourIntervalWeatherImage,minTemperature,maxTemperature;

    public Weather(String day, String date, String time, String comment, int todayWeatherImage, int oneHourIntervalWeatherImage, int minTemperature, int maxTemperature) {
        this.day = day;
        this.date = date;
        this.time = time;
        this.comment = comment;
        this.todayWeatherImage = todayWeatherImage;
        this.oneHourIntervalWeatherImage = oneHourIntervalWeatherImage;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getTodayWeatherImage() {
        return todayWeatherImage;
    }

    public void setTodayWeatherImage(int todayWeatherImage) {
        this.todayWeatherImage = todayWeatherImage;
    }

    public int getOneHourIntervalWeatherImage() {
        return oneHourIntervalWeatherImage;
    }

    public void setOneHourIntervalWeatherImage(int oneHourIntervalWeatherImage) {
        this.oneHourIntervalWeatherImage = oneHourIntervalWeatherImage;
    }

    public int getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }
}
