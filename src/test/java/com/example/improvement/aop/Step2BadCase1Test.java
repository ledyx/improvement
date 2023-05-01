package com.example.improvement.aop;

import com.example.improvement.aop.step2_bad_case1.CarService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

@Slf4j
@SpringBootTest
public class Step2BadCase1Test {
    @Autowired
    private CarService service;

    @Test
    void testInstanceType() {
        // class com.example.improvement.aop.step2_worst_case1.CarServiceImpl$$EnhancerBySpringCGLIB$$79667f6e
        log.info("type? {}", service.getClass());
    }

    @Test
    void testAddCar() {
        service.addCar("11가1111");
    }

    @Test
    void testBadCase() {
        List<String> carNumbers = Arrays.asList("11가1111", "22나2222", "33다3333");
        service.addCars(carNumbers);
    }
}
