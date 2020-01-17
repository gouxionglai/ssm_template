package com.gxl.framework.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * @author weilai
 * @description
 * @since 2019/12/18
 */
@Controller
@RequestMapping("/demo")
public class DemoController implements Serializable {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/test")
    @ResponseBody
    public Object test(){
        System.out.println("hello world!!!");
        String message = "hello world!!!嘿嘿嘿";

        HashMap json=new HashMap();
        json.put("msg",message);
        json.put("code",200);
        return json;
        //未配置json的情况下自己转换成string
//        JSONObject object = JSONObject.
//        JSONObject jsonObject = new JSONObject(json);
//        logger.info(jsonObject.toString());
//        return jsonObject.toString();
    }


	@RequestMapping(value ="/test2",method = {RequestMethod.POST})
    public Object test2(Model model,Date date){
        String message = "hello world222!!!哈哈哈哈";
        System.out.println(message);
        model.addAttribute("message",message);
        model.addAttribute("current_time",date);
        //跳转到xx/welcome.jsp页面
        return "welcome";
    }
}
