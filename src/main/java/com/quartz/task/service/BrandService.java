package com.quartz.task.service;

import org.springframework.stereotype.Service;

@Service
public class BrandService {
    public void findAllBrand() {
        System.out.println("====任务2： 查询 品牌 开始=====");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("=======任务2: 查询 品牌 结束 ==========");
    }
}
