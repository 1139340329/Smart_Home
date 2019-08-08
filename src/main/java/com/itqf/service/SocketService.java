package com.itqf.service;

import com.itqf.pojo.Socket;

import java.util.List;

public interface SocketService {

    /**
     * 全查开关*/
    List<Socket> findsocket(int roomid);
    /**
     * 添加开关*/
    int addsocket(int socketid);
    int deleteByPrimaryKey(Integer socketid);

    int insert(Socket record);

    int insertSelective(Socket record);

    Socket selectByPrimaryKey(Integer socketid);

    int updateByPrimaryKeySelective(Socket record);

    int updateByPrimaryKey(Socket record);
}
