package com.qianfeng.springboot.controller;


import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@CrossOrigin
@RestController
@RequestMapping("/zhuce")
public class RegisterController {
    @RequestMapping(value = "/{phone}",method = RequestMethod.POST)
    public String zhuce(@PathVariable("phone") String phone){
        String code = String.valueOf(new Random().nextInt(899999) + 100000);
        ZhenziSmsClient zhenziSmsClient = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", "101569", "292573e4-dd21-4a94-867a-fa7c65bd89b6");
        try {
            zhenziSmsClient.send(phone,"你的验证码为："+code);
            return "发送成功";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "发送失败";

    }

}
