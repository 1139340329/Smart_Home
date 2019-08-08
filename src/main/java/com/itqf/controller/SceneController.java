package com.itqf.controller;

import com.itqf.pojo.Scene;
import com.itqf.service.SceneService;
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
public class SceneController {

    @Resource
    private SceneService sceneService;

    @RequestMapping(method = RequestMethod.GET,value = "/smarthome/scene/findall")
    @ResponseBody
    public Map show(){
        Map map=new HashMap();
        List<Scene> byIfon = sceneService.findByIfon();
        map.put("data",byIfon);
        return map;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/smarthome/scene/add")
    @ResponseBody
    public Map add(int sceneid){
        Map map=new HashMap();
        Scene scene = new Scene();
        scene.setSceneid(sceneid);
        int i = sceneService.updateByPrimaryKeySelective(scene);
        if (i>0){
            map.put("msg","成功");
            Map map1= new HashMap();
            map1  .put("data", map);
            return map1;
        }
        map.put("msg","失败");
        Map map1= new HashMap();
        map1  .put("data", map);
        return map1;
    }

}
