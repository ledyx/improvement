package com.example.improvement.mapping.step2_advanced;

import com.example.improvement.mapping.step1_basic.after.XXLogPackAfter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public final class XIdGenerator {
    public int generate(XXLogPackAfter xxLogPack) {
        return Objects.hash(xxLogPack.getObjectName(), xxLogPack.getServiceName(), xxLogPack.getStackTrace());
    }
}
