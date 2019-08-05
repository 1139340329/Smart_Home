package com.itqf.pojo;

public class Air {
    private Integer id;

    private String name;

    private Integer temperature;

    private Integer airscene;

    private String status;

    private String windspeed;

    private Integer electricity;

    private Integer hour;

    private Integer roomid;

    private String airimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getAirscene() {
        return airscene;
    }

    public void setAirscene(Integer airscene) {
        this.airscene = airscene;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getWindspeed() {
        return windspeed;
    }

    public void setWindspeed(String windspeed) {
        this.windspeed = windspeed == null ? null : windspeed.trim();
    }

    public Integer getElectricity() {
        return electricity;
    }

    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getRoomid() {
        return roomid;
    }

    public void setRoomid(Integer roomid) {
        this.roomid = roomid;
    }

    public String getAirimg() {
        return airimg;
    }

    public void setAirimg(String airimg) {
        this.airimg = airimg == null ? null : airimg.trim();
    }
}