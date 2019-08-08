package com.itqf.controller;


import com.itqf.pojo.Robot;
import com.itqf.pojo.Socket;
import com.itqf.service.SocketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SocketController {

    @Resource
    private SocketService socketService;


    //主键查看
    @RequestMapping(method = RequestMethod.GET, value = "/smarthome/socket/show")
    public Map findbyid(int id) {

        Socket socket = socketService.selectByPrimaryKey(id);



        Map m = new HashMap();
        m.put("socketid", socket.getSocketid());
        m.put("socketimg", socket.getSocketimg());
        m.put("status", socket.getStatus());




        Map map = new HashMap();
        //map.put("data", m);

        return map;
    }

    //全查电源开关
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/socket2")

    public Map findsocket(int roomid){
        List<Socket> sockets = socketService.findsocket(roomid);
        Map map=  new HashMap();
        map.put("data",sockets);
        return map;
    }
    /**
     * 添加开关*/
    @RequestMapping(method = RequestMethod.GET, value = "/firstpage/equipment/socket/add")
    public Map addsocket(int socketid){
        Socket socket = socketService.selectByPrimaryKey(socketid);
        Map map=new HashMap();
        if(socket.getToroom()==0){
            int i =socketService.addsocket(socketid);
            map.put("msg","成功");
            return map;
        }else {
            map.put("msg","当前不能添加该设备");
            return map;
        }
    }



}
