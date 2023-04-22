package com.example.improvement.mapping.advanced;

import com.example.improvement.mapping.basic.after.XXLogPackAfterImprovement;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public final class XIdGenerator {
    public int generate(XXLogPackAfterImprovement xxLogPack) {
        return Objects.hash(xxLogPack.getObjectName(), xxLogPack.getServiceName(), xxLogPack.getStackTrace());
    }
}
