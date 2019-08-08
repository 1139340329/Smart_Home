package com.itqf.pojo;

public class Pm25 {
    private Integer pmid;

    private String imgurl;

    private String pm25;

    private String filterer;

    private Integer temperature;

    private Integer humidity;

    private Integer outdoorpm25;

    private Integer residualofe;

    private Integer comfortlevel;

    private String location;

    private Integer runconstant;

    private Integer airpq;

    private Integer function;

    private Integer state;

    private Integer electricity;

    private Integer hour;

    private Integer roomid;

    private Integer toroom;

    private Integer sid;
    private Room room;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Integer getPmid() {
        return pmid;
    }

    public void setPmid(Integer pmid) {
        this.pmid = pmid;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getPm25() {
        return pm25;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25 == null ? null : pm25.trim();
    }

    public String getFilterer() {
        return filterer;
    }

    public void setFilterer(String filterer) {
        this.filterer = filterer == null ? null : filterer.trim();
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

    public Integer getOutdoorpm25() {
        return outdoorpm25;
    }

    public void setOutdoorpm25(Integer outdoorpm25) {
        this.outdoorpm25 = outdoorpm25;
    }

    public Integer getResidualofe() {
        return residualofe;
    }

    public void setResidualofe(Integer residualofe) {
        this.residualofe = residualofe;
    }

    public Integer getComfortlevel() {
        return comfortlevel;
    }

    public void setComfortlevel(Integer comfortlevel) {
        this.comfortlevel = comfortlevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getRunconstant() {
        return runconstant;
    }

    public void setRunconstant(Integer runconstant) {
        this.runconstant = runconstant;
    }

    public Integer getAirpq() {
        return airpq;
    }

    public void setAirpq(Integer airpq) {
        this.airpq = airpq;
    }

    public Integer getFunction() {
        return function;
    }

    public void setFunction(Integer function) {
        this.function = function;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getToroom() {
        return toroom;
    }

    public void setToroom(Integer toroom) {
        this.toroom = toroom;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}