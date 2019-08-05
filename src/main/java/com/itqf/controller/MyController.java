package com.itqf.controller;

import com.itqf.mapper.TablelampMapper;
import com.itqf.pojo.Air;
import com.itqf.pojo.Pm25;
import com.itqf.pojo.Robot;
import com.itqf.pojo.Tablelamp;
import com.itqf.service.AirService;
import com.itqf.service.Pm25Service;
import com.itqf.service.RobotService;
import com.itqf.service.TablelampService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 爱明天，更爱大佬
 */
@Controller
public class MyController {

    @Resource
    private TablelampMapper tablelampMapper;
    @Resource
    private Pm25Service pm25Service;
    @Resource
    private RobotService robotService;
    @Resource
    private AirService airService;

    /**
     * 展示我的习惯里的总电量
     * @return
     */
    @RequestMapping(method = RequestMethod.GET,value = "/mine/show")
    @ResponseBody
    public Map show(){
        List<Tablelamp> tablelamps = tablelampMapper.findall();
        List<Robot> robots = robotService.findAl();
        List<Air> airs = airService.findAl();
        List<Pm25> pm25s = pm25Service.findAl();
        int electricity=0;
        int electricity1=0;
        for (Tablelamp tablelamp : tablelamps) {
            electricity1=tablelamp.getElectricity()+electricity;
        }
        int electricity2=0;
        for (Robot robot : robots) {
            electricity2=robot.getElectricity()+electricity2;
        }
        int electricity3=0;
        for (Air air : airs) {
            electricity3=air.getElectricity()+electricity3;
        }
        int electricity4=0;
        for (Pm25 pm25 : pm25s) {
            electricity4=pm25.getElectricity()+electricity4;
        }
        electricity=electricity1+electricity2+electricity3+electricity4;

        Map<String,Integer> map = new HashMap<>();
        map.put("electricity",electricity);
        return map;
    }
}
