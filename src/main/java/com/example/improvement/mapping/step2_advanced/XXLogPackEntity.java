package com.example.improvement.mapping.step2_advanced;

import lombok.Data;
import scouter.lang.pack.XLogPack;

@Data
public class XXLogPackEntity {
    // XXLogPack에는 존재하지 않는 필드
    private int xid;

    private String objectName;
    private String serviceName;
    private String threadName;
    private String stackTrace;

    // XXLogPack에 byte[] type. 변환 필요.
    private String ipaddr;

    // Polymorphism
    private XLogPack xlog;
}
