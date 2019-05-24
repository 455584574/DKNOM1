package com.qianfeng.springboot.controller.Lv.utill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Captcha")
@CrossOrigin
public class LvCaptchaId {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 获取验证码
     * @param yzmId
     * @return
     */
    @RequestMapping(value = "/CaptchaId/{yzmId}",method = RequestMethod.GET)
    private String findById(@PathVariable("yzmId") String yzmId){
        String s = stringRedisTemplate.boundValueOps(yzmId).get();
        return s;
    }

}
