package com.example.improvement.aop.step2_bad_case1;

import java.util.Collection;

public interface CarService {
    void addCar(String carNo);
    void addCars(Collection<String> CarNumbers);
}
