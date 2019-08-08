package com.itqf.pojo;

public class Robot {
    private Integer robotid;

    private String aiimg;

    private String rtype;

    private String status;

    private Integer roomid;

    private Integer toroom;

    private Integer sid;
    private Integer electricity;
    private  Room room;
    public Integer getElectricity() {
        return electricity;
    }

    public void setElectricity(Integer electricity) {
        this.electricity = electricity;
    }

    public Integer getRobotid() {
        return robotid;
    }

    public void setRobotid(Integer robotid) {
        this.robotid = robotid;
    }

    public String getAiimg() {
        return aiimg;
    }

    public void setAiimg(String aiimg) {
        this.aiimg = aiimg == null ? null : aiimg.trim();
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(String rtype) {
        this.rtype = rtype == null ? null : rtype.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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