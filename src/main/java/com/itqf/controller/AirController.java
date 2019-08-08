package com.itqf.controller;

import com.itqf.pojo.Air;
import com.itqf.service.AirService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class AirController {
    @Resource
    private AirService airService;

    /**
     * 添加页面展示air
     */
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/air")
    public Map findallair(int roomid) {
        List<Air> airs = airService.findallair(roomid);
        Map<String, Object> map = new HashMap();
        map.put("data", airs);
        return map;
    }

    /**
     * 添加空调
     */
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/air/add")
    public Map addlamp(int id) {
        Air air = airService.selectByPrimaryKey(id);
        Map map = new HashMap();
        if (air.getToroom() == 0) {
            int i = airService.addair(id);
            map.put("msg", "成功");
            return map;
        } else {
            map.put("msg", "当前不能添加该设备");
            return map;
        }
    }

    /**
     * 空调详情
     */
    @RequestMapping(method = RequestMethod.GET, value = "/smarthome/airconditioner/show")

    public Map findairbyid(Integer id) {
        Air air = airService.selectByPrimaryKey(id);
        Map map = new HashMap();
        map.put("data", air);
        return map;
    }
}