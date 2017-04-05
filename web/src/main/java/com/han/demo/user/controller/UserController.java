package com.han.demo.user.controller;

import com.han.demo.user.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Amy on 2016/9/7.
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @RequestMapping(value = "login")
    public String login(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/profile";
    }
}
