package com.example.improvement.aop.step2_worst_case;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@Service
public class AsyncServiceImpl implements AsyncService {

    @Override
    public void call() {
        log.info("This is not called..");
    }

    @Scheduled(cron = "*/1 * * * * *")
    void executeJob() {
        this.call();
        log.info("Run some scheduled job... {}", Instant.now());
    }
}
