package com.itqf.pojo;

import java.util.List;

public class Room {
    private Integer rid;

    private String roomname;

    private Integer light;

    public List<Air> getAirList() {
        return airList;
    }

    public void setAirList(List<Air> airList) {
        this.airList = airList;
    }

    private Integer temperature;

    private Integer humidity;
    private List<Air> airList;
    private List<Socket> socketList;
    private List<Lamp> lampList;
    private List<Robot> robotList;
    private List<Pm25> pm25List;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public List<Socket> getSocketList() {
        return socketList;
    }

    public void setSocketList(List<Socket> socketList) {
        this.socketList = socketList;
    }

    public List<Lamp> getLampList() {
        return lampList;
    }

    public void setLampList(List<Lamp> lampList) {
        this.lampList = lampList;
    }

    public List<Robot> getRobotList() {
        return robotList;
    }

    public void setRobotList(List<Robot> robotList) {
        this.robotList = robotList;
    }

    public List<Pm25> getPm25List() {
        return pm25List;
    }

    public void setPm25List(List<Pm25> pm25List) {
        this.pm25List = pm25List;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public Integer getLight() {
        return light;
    }

    public void setLight(Integer light) {
        this.light = light;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }
}