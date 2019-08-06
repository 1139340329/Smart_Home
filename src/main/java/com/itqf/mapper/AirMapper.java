package com.itqf.mapper;

import com.itqf.pojo.Air;

import java.util.List;

public interface AirMapper {

    List<Air> findAl();

    int deleteByPrimaryKey(Integer id);

    int insert(Air record);

    int insertSelective(Air record);

    Air selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Air record);

    int updateByPrimaryKey(Air record);
}