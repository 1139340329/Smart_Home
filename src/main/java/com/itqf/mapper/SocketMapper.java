package com.itqf.mapper;

import com.itqf.pojo.Socket;

import java.util.List;

public interface SocketMapper {
     /**
      * 全查开关*/
     List<Socket>  findsocket(int roomid);

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