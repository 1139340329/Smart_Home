package com.itqf.pojo;

public class Socket {
    private Integer socketid;

    private String socketimg;

    private String soctetype;

    private String status;

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

    public Integer getSocketid() {
        return socketid;
    }

    public void setSocketid(Integer socketid) {
        this.socketid = socketid;
    }

    public String getSocketimg() {
        return socketimg;
    }

    public void setSocketimg(String socketimg) {
        this.socketimg = socketimg == null ? null : socketimg.trim();
    }

    public String getSoctetype() {
        return soctetype;
    }

    public void setSoctetype(String soctetype) {
        this.soctetype = soctetype == null ? null : soctetype.trim();
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