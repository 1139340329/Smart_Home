package com.itqf.service.impl;

import com.itqf.mapper.SceneMapper;
import com.itqf.pojo.Scene;
import com.itqf.service.SceneService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * 爱明天，更爱大佬
 */
@Service
public class SceneServiceImpl implements SceneService {
    @Resource
    private SceneMapper sceneMapper;
    @Override
    public List<Scene> findByIfon() {
        return sceneMapper.findByIfon();
    }

    @Override
    public int deleteByPrimaryKey(Integer sceneid) {
        return 0;
    }

    @Override
    public int insert(Scene record) {
        return 0;
    }

    @Override
    public int insertSelective(Scene record) {
        return 0;
    }

    @Override
    public Scene selectByPrimaryKey(Integer sceneid) {
        return null;
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(Scene record) {
        record.setIfon("true");
        return sceneMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Scene record) {
        return 0;
    }
}
