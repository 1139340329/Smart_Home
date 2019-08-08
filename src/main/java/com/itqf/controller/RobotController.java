package com.itqf.controller;

import com.itqf.pojo.Robot;
import com.itqf.pojo.Tablelamp;
import com.itqf.service.RobotService;
import com.itqf.service.TablelampService;
import com.itqf.util.DataView;
import org.springframework.http.HttpRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class RobotController {

    @Resource
    private RobotService robotService;

    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/smarthome/AI/show")
    public Map findbyid(int id) {

        Robot robot = robotService.selectByPrimaryKey(id);



        Map m = new HashMap();
        m.put("aiimg", robot.getAiimg());
        m.put("status", robot.getStatus());

        Map map = new HashMap();
        map.put("data", m);

        return map;
    }

/*
    //状态修改
    @RequestMapping(method = RequestMethod.GET, value = "/equipment/lamp/update")
    public DataView update(Tablelamp tablelamp) {
        int i = tablelampService.updateByPrimaryKeySelective(tablelamp);


        DataView<Tablelamp> dataView = new DataView<Tablelamp>();
        dataView.setMsg("成功");

        List<Tablelamp> t = new ArrayList();
        t.add(tablelamp);
        dataView.setData(t);

        return dataView;

    }*/

    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/life")
    public Map findallrobot(int roomid){
        List<Robot> robots = robotService.findallrobot(roomid);
        Map map= new HashMap();
        map.put("data",robots);
        return map;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/life/add")
    public Map addlamp(int robotid){
        Robot robot = robotService.selectByPrimaryKey(robotid);
        Map map=new HashMap();
        if(robot.getToroom()==0){
            int i =robotService.addlife(robotid);
            map.put("msg","成功");
            return map;
        }else {
            map.put("msg","当前不能添加该设备");
            return map;
        }
    }
}
