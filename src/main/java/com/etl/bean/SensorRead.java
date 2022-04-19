package com.etl.bean;


import java.util.Date;

public class SensorRead {
    private String id;
    private String date;
    private Double  temperature;

    public SensorRead() {
    }

    public SensorRead(String id, String date, Double temperature) {
        this.id = id;
        this.date = date;
        this.temperature = temperature;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void String(String date) {
        this.date = date;
    }

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "SensorRead{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", temperature=" + temperature +
                '}';
    }
}
