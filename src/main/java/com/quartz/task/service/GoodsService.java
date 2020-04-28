package com.quartz.task.service;

import org.springframework.stereotype.Service;

@Service
public class GoodsService {
    public void findAllGoods() {
        System.out.println("====任务1： 查询 商品 开始=====");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=======任务1: 查询商品结束 ==========");
    }
}
