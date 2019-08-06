package com.itqf.mapper;


import com.itqf.pojo.Robot;

import java.util.List;

public interface RobotMapper {

    List<Robot> findAl();

    int deleteByPrimaryKey(Integer robotid);

    int insert(Robot record);

    int insertSelective(Robot record);

    Robot selectByPrimaryKey(Integer robotid);

    int updateByPrimaryKeySelective(Robot record);

    int updateByPrimaryKey(Robot record);
}