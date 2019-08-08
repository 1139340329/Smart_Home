package com.itqf.controller;

import com.itqf.pojo.Feedback;
import com.itqf.service.FeedbackService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.HashMap;
import java.util.Map;

/**
 * 爱明天，更爱大佬
 */
@Controller
public class FeedbackController {
    @Resource
    private FeedbackService feedbackService;

    /**
     * 提交反馈
     * @param feedback
     * @return
     */
    @RequestMapping(method = RequestMethod.POST,value = "mine/feedback/submit")
    @ResponseBody
    public Map save(Feedback feedback){
        int i = feedbackService.insertSelective(feedback);
       Map m = new HashMap();
       Map map=new HashMap();
        try {
            if (i>0){
                m.put("msg","成功");
                map.put("data",m);
                return map;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        m.put("msg","失败");
        map.put("data",m);
        return  map;
    }

}
