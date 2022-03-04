package com.cydeo.controler;

import org.springframework.web.bind.annotation.RequestMapping;

public class UserController {

    @RequestMapping ("/user")
    public String user(){
        return "/user/user.html";
    }
}
