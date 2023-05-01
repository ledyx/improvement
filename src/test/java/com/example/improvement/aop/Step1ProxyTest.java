package com.example.improvement.aop;

import com.example.improvement.aop.step1_proxy.Proxy;
import com.example.improvement.aop.step1_proxy.Subject;
import org.junit.jupiter.api.Test;

public class Step1ProxyTest {

    @Test
    void test() {
        Subject subject = new Proxy();
        subject.operation();
        subject.operation();
        subject.operation();
    }
}
