package com.saikat.clientdesign2.Models;

public class Weather {

    String day,date, timeFormat,comment;
    int time,todayWeatherImage,oneHourIntervalWeatherImage,hourlyTemperature,minTemperature,maxTemperature;

    public Weather(String day, String date, String comment, int todayWeatherImage, int minTemperature, int maxTemperature) {
        this.day = day;
        this.date = date;
        this.comment = comment;
        this.todayWeatherImage = todayWeatherImage;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public Weather(int time,String timeFormat, int oneHourIntervalWeatherImage, int hourlyTemperature) {
        this.time = time;
        this.timeFormat = timeFormat;
        this.oneHourIntervalWeatherImage = oneHourIntervalWeatherImage;
        this.hourlyTemperature = hourlyTemperature;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHourlyTemperature() {
        return hourlyTemperature;
    }

    public void setHourlyTemperature(int hourlyTemperature) {
        this.hourlyTemperature = hourlyTemperature;
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

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
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
