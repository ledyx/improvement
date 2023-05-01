package com.example.improvement.aop.step2_bad_case1;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import java.util.Collection;

// 해결 방법
// 1. 자가 주입 (Spring 2.6부터는 순환 참조 문제로 방지되어 있음. spring.main.allow-circular-references=true 설정 필요)
// 2. ObjectProvider.getObject() 사용으로 지연 호출
// 3. 별도의 Component로 분리
@Service
@Slf4j
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    private final CarRepository repository;
    

    @Transactional
    @Override
    public void addCar(String carNo) {
        log.info("Tx is activated? {}", TransactionSynchronizationManager.isActualTransactionActive());

        Car car = new Car();
        car.setCarNo(carNo);
        repository.save(car);
    }

    // Spring Boot는 Proxy 생성시 Class 기반으로 생성하는 "CGLIB"가 기본 설정이므로 private, final 사용 금지
    @Override
    public void addCars(Collection<String> carNumbers) {
        for (String carNumber : carNumbers) {
            addCar(carNumber);
        }
    }
}
