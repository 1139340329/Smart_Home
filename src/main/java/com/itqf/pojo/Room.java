package com.itqf.pojo;

import java.util.List;

public class Room {

    private List equipments;

    private Integer id;

    private String roomname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname == null ? null : roomname.trim();
    }

    public List getEquipments() {
        return equipments;
    }

    public void setEquipments(List equipments) {
        this.equipments = equipments;
    }
}