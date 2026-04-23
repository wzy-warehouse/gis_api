package com.gis.xian.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 初始化数据
 */
@Component
@Slf4j
public class InitializeData {


    @EventListener(ApplicationReadyEvent.class)
    @Async("xianPool")
    public void init() {
        log.info("开始初始化数据");


        log.info("初始化数据完成");
    }
}
