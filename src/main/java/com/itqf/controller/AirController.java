package com.itqf.controller;

import com.itqf.pojo.Air;
import com.itqf.service.AirMapperService;
import org.springframework.web.bind.annotation.CrossOrigin;
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
    private AirMapperService airMapperService;
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/air")
    public Map findallair(int roomid){
        List<Air> airs = airMapperService.findallair(roomid);
        Map<String,Object>  map=new HashMap();
        map.put("data",airs);
        return map;
    }

}
