package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.bean.TbUser;
import com.qianfeng.springboot.service.ITbUserWServcie;
import com.qianfeng.springboot.vo.VO;
import com.zhenzi.sms.ZhenziSmsClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Random;

@CrossOrigin
@RestController
@RequestMapping("/zhuce")
public class ZhuCe {
  /*  private String code;*/
    VO vo = new VO();

    @Resource
    private ITbUserWServcie userWS;

    @RequestMapping(value = "/{name}/{passwosrd}",method = RequestMethod.GET)
    public String zuceming(@PathVariable("name") String name,@PathVariable("password") String password){
        vo.setUserAccount(name);
        vo.setUserPassword(password);
        try {
            List<TbUser> tbUsers = userWS.selectWName(vo);
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "用户名已存在，请更改！";
        }
    }

    @RequestMapping(value = "/wm/{phone}",method = RequestMethod.POST)
    @ResponseBody
    public String zuce(@PathVariable("phone") String phone){
        vo.setUserCellphone(phone);
        String code = String.valueOf(new Random().nextInt(899999) + 100000);
        ZhenziSmsClient zhenziSmsClient = new ZhenziSmsClient("https://sms_developer.zhenzikj.com", "101569", "292573e4-dd21-4a94-867a-fa7c65bd89b6");
        try {
            zhenziSmsClient.send(phone,"您的验证码为："+code);
            return code;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "手机号错误，请重新输入！";
    }
    @RequestMapping("w/{emil}/{nickName}")
    public String zhuceCode(@PathVariable("emil") String emil,@PathVariable("nickName") String nickName) {
        vo.setUserEmail(emil);
        vo.setUserNickname(nickName);
        try {
            userWS.insetWUser(vo);
            return "注册成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "邮箱或昵称格式错误,请从新输入!";
        }
    }
    }
