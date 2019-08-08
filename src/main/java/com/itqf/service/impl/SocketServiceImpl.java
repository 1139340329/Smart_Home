package com.itqf.service.impl;

import com.itqf.mapper.SocketMapper;
import com.itqf.pojo.Socket;
import com.itqf.service.SocketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class SocketServiceImpl implements SocketService {


    @Resource
    private SocketMapper socketMapper;

    @Override
    public int addsocket(int socketid) {
        return socketMapper.addsocket(socketid);
    }

    /**
 * 全查开关*/
    @Override
    public List<Socket> findsocket(int roomid) {
        return socketMapper.findsocket(roomid);
    }

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
