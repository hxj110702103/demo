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

    @RequestMapping(value = "index")
    public String index(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/index";
    }

    @RequestMapping(value = "repair")
    public String repair(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/repair";
    }

    @RequestMapping(value = "voice")
    public String voice(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/voice";
    }
    @RequestMapping(value = "addAddress")
    public String addAddress(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/addAddress";
    }

    @RequestMapping(value = "address")
    public String address(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/address";
    }

    @RequestMapping(value = "myOrder")
    public String myOrder(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/myOrder";
    }

    @RequestMapping(value = "orderDetail")
    public String orderDetail(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/orderDetail";
    }

    @RequestMapping(value = "myself")
    public String myself(User user, ModelMap modelMap) {
        modelMap.addAttribute("user", user);
        System.out.println(1111111);
        return "wx/orderStatus";
    }
}
