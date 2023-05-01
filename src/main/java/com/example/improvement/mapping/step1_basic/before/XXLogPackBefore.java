package com.example.improvement.mapping.step1_basic.before;

import lombok.Builder;
import lombok.Data;
import scouter.lang.TextTypes;
import scouter.lang.pack.XLogPack;
import scouter.server.db.TextRD;
import scouter.util.DateUtil;

@Data
@Builder
public class XXLogPackBefore {

    private long endTime;
    /**
     * Object ID
     */
    private int objHash;
    /**
     * Transaction name Hash
     */
    private int service;
    /**
     * Transaction ID
     */
    private long txid;
    /**
     * thread name hash
     */
    private int threadNameHash;
    /**
     * Cpu time(ms)
     */
    private int cpu;
    /**
     * Remote ip address
     */
    private byte[] ipaddr;
    /**
     * Allocated memory(kilo byte)
     */
    private int kbytes;

    // 사용자 정의
    private String objectName;
    private String serviceName;
    private String threadName;
    private String stackTrace;

    public XXLogPackBefore from(XLogPack pack) {
        XXLogPackBefore xxLogPack = XXLogPackBefore.builder()
                .endTime(pack.endTime)
                .objHash(pack.objHash)
                .service(pack.service)
                .txid(pack.txid)
                .cpu(pack.cpu)
                .kbytes(pack.kbytes)
                .ipaddr(pack.ipaddr)
                .build();

        // 사용자 정의 Field
        String date = DateUtil.yyyymmdd(pack.endTime);
        xxLogPack.setObjectName(TextRD.getString(date, TextTypes.OBJECT, pack.objHash));
        xxLogPack.setServiceName(TextRD.getString(date, TextTypes.SERVICE, pack.service));
        xxLogPack.setThreadName(TextRD.getString(date, TextTypes.HASH_MSG, pack.threadNameHash));
        xxLogPack.setStackTrace(TextRD.getString(date, TextTypes.ERROR, pack.error));

        return xxLogPack;
    }
}
