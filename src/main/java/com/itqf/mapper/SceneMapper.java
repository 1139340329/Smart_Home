package com.itqf.mapper;

import com.itqf.pojo.Scene;

import java.util.List;

public interface SceneMapper {


    List<Scene> findByIfon();

    int deleteByPrimaryKey(Integer sceneid);

    int insert(Scene record);

    int insertSelective(Scene record);

    Scene selectByPrimaryKey(Integer sceneid);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);
}