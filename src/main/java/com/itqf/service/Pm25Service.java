package com.itqf.service;

import com.itqf.pojo.Pm25;

import java.util.List;

public interface Pm25Service {
    List<Pm25> findallPm25(int roomid);

    List<Pm25> findAl();
    //添加pm25
    int addpm25(int pmid);
    int deleteByPrimaryKey(Integer pmid);

    int insert(Pm25 record);

    int insertSelective(Pm25 record);

    Pm25 selectByPrimaryKey(Integer pmid);

    int updateByPrimaryKeySelective(Pm25 record);

    int updateByPrimaryKey(Pm25 record);

}
