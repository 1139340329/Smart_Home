package com.itqf.service.impl;

import com.itqf.mapper.LampMapper;
import com.itqf.pojo.Lamp;
import com.itqf.service.LampMapperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class LampMapperServiceImpl implements LampMapperService {

    @Resource
    private LampMapper lampMapper;

    @Override
    public int addlamp(int lampid) {
        return lampMapper.addlamp(lampid);
    }

    @Override
    public List<Lamp> findallLamp(int roomid) {
        return lampMapper.findallLamp(roomid);
    }

    @Override
    public int deleteByPrimaryKey(Integer lampid) {
        return 0;
    }

    @Override
    public int insert(Lamp record) {
        return 0;
    }

    @Override
    public int insertSelective(Lamp record) {
        return 0;
    }

    @Override
    public Lamp selectByPrimaryKey(Integer lampid) {
        return lampMapper.selectByPrimaryKey(lampid);
    }

    @Override
    public int updateByPrimaryKeySelective(Lamp record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Lamp record) {
        return 0;
    }
}
