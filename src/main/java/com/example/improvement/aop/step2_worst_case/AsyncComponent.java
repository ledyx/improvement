package com.example.improvement.aop.step2_worst_case;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AsyncComponent {
    private final AsyncService service;

    public void doSomething() {
        service.call();
    }
}
