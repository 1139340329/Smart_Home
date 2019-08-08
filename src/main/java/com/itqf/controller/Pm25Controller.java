package com.itqf.controller;


import com.itqf.pojo.Pm25;
import com.itqf.pojo.Tablelamp;
import com.itqf.service.Pm25Service;
import com.itqf.service.TablelampService;
import com.itqf.util.DataView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class Pm25Controller {


    @Resource
    private Pm25Service pm25Service;


    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/pm25")
    public DataView findall(int id) {

        Pm25 pm25 = pm25Service.selectByPrimaryKey(id);

        DataView<Pm25> dataView = new DataView<Pm25>();


        List<Pm25> t = new ArrayList();
        t.add(pm25);
        dataView.setData(t);

        return dataView;
    }
    //pm25的全查
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/pm25s")
    public Map findallpm25(int roomid){
        List<Pm25> pm25s = pm25Service.findallPm25(roomid);
        Map map=new HashMap();
        map.put("data",pm25s);
        return map;
    }

    /**
     *  添加空气净化器
     *
     * */
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/pm25/add")
    public Map addpm25(int pmid ){
        Pm25 pm25 = pm25Service.selectByPrimaryKey(pmid);
        System.out.println(pm25);
        Map map=new HashMap();
        if(pm25.getToroom()==0){
            int i = pm25Service.addpm25(pmid);
            System.out.println(i+"--------");
            map.put("msg","成功");
            return map;
        }else{
            map.put("msg","当前不能添加该设备");
            return map;
        }
    }
}
