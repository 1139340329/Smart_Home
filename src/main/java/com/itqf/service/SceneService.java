package com.itqf.service;

import com.itqf.pojo.Scene;

import java.util.List;

public interface SceneService {
    /**
     * 场景展示*/
    List<Scene> findallscene();

    List<Scene> findByIfon();
    int deleteByPrimaryKey(Integer sceneid);

    int insert(Scene record);

    int insertSelective(Scene record);

    Scene selectByPrimaryKey(Integer sceneid);

    int updateByPrimaryKeySelective(Scene record);

    int updateByPrimaryKey(Scene record);
}
