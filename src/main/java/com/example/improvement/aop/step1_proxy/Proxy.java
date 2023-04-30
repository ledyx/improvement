package com.example.improvement.aop.step1_proxy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Proxy implements Subject {

    private RealSubject real;

    @Override
    public void operation() {
        log.info("===== start");
        long start = System.currentTimeMillis();

        if (real == null) {
            log.info("> Create RealSubject!");
            real = new RealSubject();
        }

        real.operation();

        long duration = System.currentTimeMillis() - start;
        log.info("===== end : {}ms", duration);
    }
}
