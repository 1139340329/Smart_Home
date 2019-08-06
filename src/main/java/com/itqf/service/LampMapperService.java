package com.itqf.service;

import com.itqf.pojo.Lamp;

import java.util.List;

public interface LampMapperService {
    //全查lamp
    List<Lamp> findallLamp(int roomid);
    int deleteByPrimaryKey(Integer lampid);

    int insert(Lamp record);

    int insertSelective(Lamp record);

    Lamp selectByPrimaryKey(Integer lampid);

    int updateByPrimaryKeySelective(Lamp record);

    int updateByPrimaryKey(Lamp record);
}