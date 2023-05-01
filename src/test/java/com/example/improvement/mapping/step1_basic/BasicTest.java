package com.example.improvement.mapping.step1_basic;

import com.example.improvement.mapping.step1_basic.after.XLogPackMapper;
import com.example.improvement.mapping.step1_basic.after.XXLogPackAfter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import scouter.lang.pack.XLogPack;

@Slf4j
public class BasicTest {

    @Test
    void test() {
        XLogPack xLogPack = new XLogPack();
        xLogPack.txid = 1;
        xLogPack.objHash = 2;
        xLogPack.service = 3;
        xLogPack.ipaddr = "192.168.0.2".getBytes();

        XXLogPackAfter xxLogPack = XLogPackMapper.INSTANCE.toXXLogPack(xLogPack);

        log.info("XLogPack : {}", xLogPack);
        log.info("XXLogPack : {}", xxLogPack);
    }
}
