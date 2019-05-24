package com.qianfeng.springboot.service.lv.Imp;

import com.github.bingoohuang.patchca.background.SingleColorBackgroundFactory;
import com.github.bingoohuang.patchca.color.SingleColorFactory;
import com.github.bingoohuang.patchca.filter.predefined.*;
import com.github.bingoohuang.patchca.font.RandomFontFactory;
import com.github.bingoohuang.patchca.service.AbstractCaptchaService;
import com.github.bingoohuang.patchca.text.renderer.BestFitTextRenderer;
import org.springframework.stereotype.Service;
import com.qianfeng.springboot.utill.CaptchaWordFactory;

import java.awt.*;
import java.util.Random;

@Service
public class LvCaptchaService extends AbstractCaptchaService {
    private static final Random random = new Random();

    /**
     * 不可定制的验证码 服务(默认)
     */
    public LvCaptchaService() {

        // 文本内容
        wordFactory = new CaptchaWordFactory();

        // 字体
        fontFactory = new RandomFontFactory();

        // 效果
        textRenderer = new BestFitTextRenderer();

        // 背景
        backgroundFactory = new SingleColorBackgroundFactory();

        // 字体颜色
        colorFactory = new SingleColorFactory(new Color(25, 60, 170));

        // 样式(曲线波纹加干扰线)
        //0到4 之间生产随机数
        int i = random.nextInt(5) ;
        switch (i) {
            case 0:
                filterFactory = new CurvesRippleFilterFactory(colorFactory);
                break;
            case 1:
                filterFactory = new DoubleRippleFilterFactory();
                break;
            case 2:
                filterFactory = new WobbleRippleFilterFactory();
                break;
            case 3:
                filterFactory = new DiffuseRippleFilterFactory();
                break;
            case 4:
                filterFactory = new MarbleRippleFilterFactory();
                break;
        }

        // 图片宽高
        width = 150;
        height = 50;
    }

    /**
     * 可以定制的验证码服务(宽度和高度)
     * @param width
     * @param height
     */
    public LvCaptchaService(int width, int height) {

        // 文本内容
        wordFactory = new CaptchaWordFactory();

        // 字体
        fontFactory = new RandomFontFactory();

        // 效果
        textRenderer = new BestFitTextRenderer();

        // 背景
        backgroundFactory = new SingleColorBackgroundFactory();

        // 字体颜色
        colorFactory = new SingleColorFactory(new Color(25, 60, 170));

        // 样式(曲线波纹加干扰线)
        filterFactory = new CurvesRippleFilterFactory(colorFactory);

        // 图片宽高
        this.width = width;
        this.height = height;
    }

    /**
     * 可以定制的验证码服务(默认值,宽度和高度)
     * @param defaultValue
     * @param width
     * @param height
     */
    public LvCaptchaService(String defaultValue, int width, int height) {

        // 文本内容
        wordFactory = new CaptchaWordFactory(defaultValue);

        // 字体
        fontFactory = new RandomFontFactory();

        // 效果
        textRenderer = new BestFitTextRenderer();

        // 背景
        backgroundFactory = new SingleColorBackgroundFactory();

        // 字体颜色
        colorFactory = new SingleColorFactory(new Color(25, 60, 170));

        // 样式(曲线波纹加干扰线)
        filterFactory = new CurvesRippleFilterFactory(colorFactory);

        // 图片宽高
        this.width = width;
        this.height = height;
    }
}
