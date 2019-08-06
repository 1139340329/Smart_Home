package com.itqf.mapper;


import com.itqf.pojo.Pm25;

import java.util.List;

public interface Pm25Mapper {

    List<Pm25> findAl();

    int deleteByPrimaryKey(Integer pmid);

    int insert(Pm25 record);

    int insertSelective(Pm25 record);

    Pm25 selectByPrimaryKey(Integer pmid);

    int updateByPrimaryKeySelective(Pm25 record);

    int updateByPrimaryKey(Pm25 record);
}