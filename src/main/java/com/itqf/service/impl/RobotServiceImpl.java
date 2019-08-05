package com.itqf.service.impl;

import com.itqf.mapper.RobotMapper;
import com.itqf.pojo.Robot;
import com.itqf.service.RobotService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class RobotServiceImpl implements RobotService {

    @Resource
    private RobotMapper robotMapper;


    @Override
    public List<Robot> findAl() {
        return robotMapper.findAl();
    }

    @Override
    public int deleteByPrimaryKey(Integer robotid) {
        return 0;
    }

    @Override
    public int insert(Robot record) {
        return 0;
    }

    @Override
    public int insertSelective(Robot record) {
        return 0;
    }

    @Override
    public Robot selectByPrimaryKey(Integer robotid) {
        return robotMapper.selectByPrimaryKey(robotid);
    }

    @Override
    public int updateByPrimaryKeySelective(Robot record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Robot record) {
        return 0;
    }
}
