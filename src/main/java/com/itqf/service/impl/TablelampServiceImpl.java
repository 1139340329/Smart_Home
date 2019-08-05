package com.itqf.service.impl;

import com.itqf.mapper.TablelampMapper;
import com.itqf.pojo.Tablelamp;
import com.itqf.service.TablelampService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class TablelampServiceImpl implements TablelampService {


    @Resource
    private TablelampMapper tablelampMapper;


    @Override
    public Tablelamp findbyid(int id) {
        return tablelampMapper.selectByPrimaryKey(id);
    }

    @Override
    public List findall() {

        List<Tablelamp> findall = tablelampMapper.findall();

        List  list = new ArrayList();

        for (Tablelamp tablelamp : findall) {
            Map map = new HashMap();
            map.put("lampimg", tablelamp.getUrl());
            map.put("lampid", tablelamp.getTablelampid());
            map.put("lamptype", tablelamp.getName());
            list.add(map);
        }

        return list;
    }

    @Override
    public int deleteByPrimaryKey(Integer tablelampid) {
        return 0;
    }

    @Override
    public int insert(Tablelamp record) {
        return 0;
    }

    @Override
    public int insertSelective(Tablelamp record) {
        return tablelampMapper.insertSelective(record);
    }


    @Override
    public Tablelamp selectByPrimaryKey(Integer tablelampid) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Tablelamp record) {
        return tablelampMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tablelamp record) {
        return 0;
    }
}
