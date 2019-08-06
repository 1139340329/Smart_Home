package com.itqf.mapper;

import com.itqf.pojo.Room;

public interface RoomMapper {
    int deleteByPrimaryKey(Integer rid);

    int insert(Room record);

    int insertSelective(Room record);

    Room selectByPrimaryKey(Integer rid);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}