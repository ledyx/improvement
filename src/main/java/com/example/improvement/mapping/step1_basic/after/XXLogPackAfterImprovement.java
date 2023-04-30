package com.example.improvement.mapping.step1_basic.after;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import scouter.lang.pack.XLogPack;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class XXLogPackAfterImprovement extends XLogPack {
    // 사용자 정의
    private String objectName;
    private String serviceName;
    private String threadName;
    private String stackTrace;
}
