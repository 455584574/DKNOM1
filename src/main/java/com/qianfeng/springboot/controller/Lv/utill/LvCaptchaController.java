package com.qianfeng.springboot.controller.Lv.utill;

import com.github.bingoohuang.patchca.service.CaptchaService;
import com.github.bingoohuang.patchca.utils.encoder.EncoderHelper;
import com.qianfeng.springboot.service.lv.Imp.LvCaptchaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;

@Controller
@CrossOrigin
@RequestMapping("/YZM")
public class LvCaptchaController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @RequestMapping("/generateCaptcha/{userId}")
    public void getCaptchaController(HttpServletRequest req, HttpServletResponse res,@PathVariable("userId") String userId){
        String captcha=null;
        try {
            // 设置两个响应头
            //返回值类型时 png格式的图片
            res.setContentType("image/png");
            //验证码不要进行缓存
            res.setHeader("cache", "no-cache");

            OutputStream os = res.getOutputStream();

            // 值随机,宽度110px,高度40px
            //可以根据需要修改 参数设置定制化的化的验证码
            CaptchaService captchaService = new LvCaptchaService(110, 40);

            //生产验证码图片  通过outputStream的方式进行发送
            captcha = EncoderHelper.getChallangeAndWriteImage(captchaService, "png", os);
            os.flush();
            if(os != null) {
                os.close();
                os = null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        //将图像的验证码存贮在redis中 在账号验证时对其进行验证，用户ID为唯一识别符
        stringRedisTemplate.boundValueOps("captcha"+userId).set(captcha);
        stringRedisTemplate.expire("captcha"+userId,60000, TimeUnit.MILLISECONDS);
    }
}
