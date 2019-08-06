package com.itqf.pojo;

public class Lamp {
    private Integer lampid;

    private String lampimg;

    private String lamptype;

    private String lampstatus;

    private Integer roomid;

    private Integer toroom;

    private Integer sid;
    private  Room room;

    public Integer getLampid() {
        return lampid;
    }

    public void setLampid(Integer lampid) {
        this.lampid = lampid;
    }

    public String getLampimg() {
        return lampimg;
    }

    public void setLampimg(String lampimg) {
        this.lampimg = lampimg == null ? null : lampimg.trim();
    }

    public String getLamptype() {
        return lamptype;
    }

    public void setLamptype(String lamptype) {
        this.lamptype = lamptype == null ? null : lamptype.trim();
    }

    public String getLampstatus() {
        return lampstatus;
    }

    public void setLampstatus(String lampstatus) {
        this.lampstatus = lampstatus == null ? null : lampstatus.trim();
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