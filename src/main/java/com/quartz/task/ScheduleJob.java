package com.quartz.task;

import com.quartz.task.service.BrandService;
import com.quartz.task.service.GoodsService;
import com.quartz.task.util.TaskUtil;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduleJob extends QuartzJobBean {
    // 创建线程池
    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        GoodsService goodsService = TaskUtil.getBean(GoodsService.class);
        BrandService brandService = TaskUtil.getBean(BrandService.class);
        executorService.execute(() -> {
            goodsService.findAllGoods();
        });
        executorService.execute(() ->{
            brandService.findAllBrand();
        });
    }
}
