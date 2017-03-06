package com.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by hpf on 2016/12/7.
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    private static Logger log= LoggerFactory.getLogger(DemoController.class);
//    private static Logger log= LoggerFactory.getLogger("DemoController");

    @RequestMapping("/2/{str}")
    @ResponseBody
    public ModelAndView getDemoStr(HttpServletRequest request, HttpServletResponse response, @PathVariable("str") String str){
        log.info("============》输出参数："+str);
//        return str;

        ModelAndView model=new ModelAndView("index");
        model.addObject("text",str);
//        model.
        return model;
    }

}
