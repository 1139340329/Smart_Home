package com.itqf.service.impl;

import com.itqf.mapper.AirMapper;
import com.itqf.pojo.Air;
import com.itqf.service.AirService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 爱明天，更爱大佬
 */
@Service
public class AirServiceImpl implements AirService {


    @Resource
    private AirMapper airMapper;


    @Override
    public List<Air> findAl() {
        return airMapper.findAl();
    }


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Air record) {
        return 0;
    }

    @Override
    public int insertSelective(Air record) {
        return 0;
    }

    @Override
    public Air selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Air record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Air record) {
        return 0;
    }
}
