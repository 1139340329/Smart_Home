package com.itqf.service;

import com.itqf.pojo.Air;

import java.util.List;

public interface AirService {
    //添加空调（修改状态）
    int addair(int id);
    //添加页面全查
    List<Air> findallair(int roomid);
    List<Air> findAl();

    int deleteByPrimaryKey(Integer id);

    int insert(Air record);

    int insertSelective(Air record);

    Air selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);
}