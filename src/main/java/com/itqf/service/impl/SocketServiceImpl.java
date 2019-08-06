package com.itqf.service.impl;

import com.itqf.mapper.SocketMapper;
import com.itqf.pojo.Socket;
import com.itqf.service.SocketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class SocketServiceImpl implements SocketService {


    @Resource
    private SocketMapper socketMapper;


    @Override
    public int deleteByPrimaryKey(Integer socketid) {
        return 0;
    }

    @Override
    public int insert(Socket record) {
        return 0;
    }

    @Override
    public int insertSelective(Socket record) {
        return 0;
    }

    @Override
    public Socket selectByPrimaryKey(Integer socketid) {
        return socketMapper.selectByPrimaryKey(socketid);
    }

    @Override
    public int updateByPrimaryKeySelective(Socket record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Socket record) {
        return 0;
    }
}
