package com.quartz.task.config;

import com.quartz.task.ScheduleJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaskConfig {
    /**
     *  创建 JobDetail 绑定任务1
     *
     */
    @Bean
    public JobDetail uploadTaskDetail() {
        return JobBuilder.newJob(ScheduleJob.class).withIdentity("helloTask").storeDurably().build();
    }


    /**
     * 创建触发器 1 并且与任务1绑定
     * @return
     */
    @Bean
    public Trigger updateTaskTrigger() {
        CronScheduleBuilder builder = CronScheduleBuilder.cronSchedule("*/10 * * * * ?");
        return TriggerBuilder.newTrigger().forJob(uploadTaskDetail()).withSchedule(builder).build();
    }

}
