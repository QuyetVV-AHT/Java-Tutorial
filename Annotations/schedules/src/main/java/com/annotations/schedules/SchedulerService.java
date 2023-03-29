package com.annotations.schedules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerService {

    /** 特定のロガーの指定がないため、rootが適用される */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    // executes a task for every 1 sec gap
    @Scheduled(cron = "*/1 * * * * *")
    public void scheduledMethod() {
        logger.info("ログテスト");

    }
}
