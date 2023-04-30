package com.example.improvement.mapping.advacned;

import com.example.improvement.mapping.step2_advanced.layer.XXLogService;
import com.example.improvement.mapping.step1_basic.after.XLogPackMapper;
import com.example.improvement.mapping.step1_basic.after.XXLogPackAfterImprovement;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import scouter.lang.pack.XLogPack;

@SpringBootTest
public class AdvancedTest {

    @Autowired
    private XXLogService service;

    @Test
    void test() {
        XLogPack xLogPack = new XLogPack();
        xLogPack.txid = 1;
        xLogPack.objHash = 2;
        xLogPack.service = 3;
        xLogPack.ipaddr = "192.168.0.2".getBytes();

        XXLogPackAfterImprovement xxLogPack = XLogPackMapper.INSTANCE.toXXLogPack(xLogPack);

        service.save(xxLogPack);
    }
}
