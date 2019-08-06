package com.itqf.service;

import com.itqf.pojo.Air;

import java.util.List;

public interface AirMapperService {
    List<Air> findallair(int roomid);
    int deleteByPrimaryKey(Integer airid);

    int insert(Air record);

    int insertSelective(Air record);

    Air selectByPrimaryKey(Integer airid);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);
}