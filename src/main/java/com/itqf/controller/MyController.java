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
import com.itqf.util.DataView;
import com.yunpian.sdk.YunpianClient;
import com.yunpian.sdk.model.Result;
import com.yunpian.sdk.model.SmsSingleSend;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
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

    //    POST /user/password/getcode
    @PostMapping("/user/password/getcode")
    @ResponseBody
    public DataView getCode(String phone, String validatecode){
        return null;
    }



    //登录后修改密码
    @PostMapping("/user/password/reset")
    @ResponseBody
    public DataView reset(String phone, String password){

        return null;
    }


    @PostMapping("/user/send-sms")
    @ResponseBody
    public DataView sendSMS(String phone, HttpSession session){
        //初始化clnt,使用单例方式
        YunpianClient clnt = new YunpianClient("bf4463a129d359b07d20130026da2d30").init();

        //发送短信API
        int randomCode = (int) ((Math.random() * 9 + 1) * 100000);
        Map<String, String> param = clnt.newParam(2);
        param.put(YunpianClient.MOBILE, phone);
        param.put(YunpianClient.TEXT, "【云片网】您的验证码是"+randomCode);
        Result<SmsSingleSend> r = clnt.sms().single_send(param);
        session.setAttribute("randomCode",randomCode);

//获取返回结果，返回码:r.getCode(),返回码描述:r.getMsg(),API结果:r.getData(),其他说明:r.getDetail(),调用异常:r.getThrowable()

//账户:clnt.user().* 签名:clnt.sign().* 模版:clnt.tpl().* 短信:clnt.sms().* 语音:clnt.voice().* 流量:clnt.flow().* 隐私通话:clnt.call().*

//释放clnt

        DataView dataView=new DataView();
        if(r.getCode()==0){
            dataView.setCode(2);
            dataView.setMsg("成功");
            dataView.setData(null);
        }else{

        }


        clnt.close();

        return dataView;
    }
}
