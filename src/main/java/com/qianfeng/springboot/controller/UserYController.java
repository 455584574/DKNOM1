package com.qianfeng.springboot.controller;


import com.qianfeng.springboot.service.IUserYService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserYController {

    @Autowired
    private IUserYService userYService;

    @RequestMapping(value = "/login/{username}/{password}",method = RequestMethod.POST)
    public String login(@PathVariable("username") String username,@PathVariable("password") String password){

        try {
            int userId = userYService.login(username, password);
            return String.valueOf(userId);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "no";
    }
}
