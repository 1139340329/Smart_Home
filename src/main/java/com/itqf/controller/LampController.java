package com.itqf.controller;

import com.itqf.pojo.Lamp;
import com.itqf.service.LampMapperService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class LampController {
    @Resource
    private LampMapperService lampMapperService;

    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/lamp")
    public Map findalllamp(int roomid){
        List<Lamp> lamps = lampMapperService.findallLamp(roomid);
        Map map=new HashMap();
        map.put("data",lamps);
        return map;
    }
/**
 *  * 添加照明
 *  *
 * */
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/lamp/add")
   public Map addlamp(int lampid){
        Lamp lamp = lampMapperService.selectByPrimaryKey(lampid);
        Map map=new HashMap();
        if(lamp.getToroom()==0){
            int i = lampMapperService.addlamp(lampid);
            map.put("msg","成功");
            return map;
        }else {
            map.put("msg","当前不能添加该设备");
            return map;
        }

    }
}
