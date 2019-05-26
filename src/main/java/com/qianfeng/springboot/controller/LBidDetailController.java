package com.qianfeng.springboot.controller;

import com.qianfeng.springboot.dao.BidDetailMapper;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@ResponseBody
@RestController
@CrossOrigin
@RequestMapping("/bid")
public class LBidDetailController {
    @Resource
    private BidDetailMapper bidDetailMapper;

    @RequestMapping(value = "/user/{userId}",method = RequestMethod.PUT)
    public void updateBid(@PathVariable("userId") Integer userId){
        bidDetailMapper.updateBid(userId);

    }
}
