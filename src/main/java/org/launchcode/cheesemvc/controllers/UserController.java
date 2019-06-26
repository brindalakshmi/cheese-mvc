package org.launchcode.cheesemvc.controllers;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping(value = "user/add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify);
        model.addAttribute;
        return "user/add";
}
