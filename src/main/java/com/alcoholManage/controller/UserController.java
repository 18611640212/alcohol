package com.alcoholManage.controller;

import com.alcoholManage.dao.UserDao;
import com.alcoholManage.domain.User;
import com.alcoholManage.domain.permission.Role;
import com.alcoholManage.enums.LoginType;
import com.alcoholManage.utils.MenuManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by mac on 2017/3/18.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserDao userDao;

    @RequestMapping("/login/{loginType}")
    public ModelAndView login(HttpServletRequest request, @PathVariable("loginType") int loginType){

        ModelAndView view = new ModelAndView("/error");
        String viewName = "/index";
        String url = request .getParameter("refundURL");
        if(!url.trim().equals("")){
           viewName = url;
        }
        LoginType type = LoginType.getLoginTypeByCode(loginType);
        if(type==null){
            return view;
        }
        Role role = null;
        switch (type){
            case MERCHANT_USER_LOGIN:
                String userName = request.getAttribute("userName").toString();
                String password = request.getAttribute("password").toString();
                User user = userDao.getUserByPassword(userName,password);
                if(user == null){
                    return view;
                }
                role = MenuManage.getInit().getRoleById(user.getRoleId());
                view.addObject(role);
                view.setViewName(viewName);
                break;
            case NORMAL_USER_LOGIN:
//                String
                break;
            case POT_COMPANION_LOGIN:
                break;
        }
        return view;
    }


}
