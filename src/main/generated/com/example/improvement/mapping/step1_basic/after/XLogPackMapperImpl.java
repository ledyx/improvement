package com.example.improvement.mapping.step1_basic.after;

import java.util.Arrays;
import javax.annotation.Generated;
import scouter.lang.pack.XLogPack;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-30T18:52:52+0900",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 1.8.0_362 (Temurin)"
)
public class XLogPackMapperImpl implements XLogPackMapper {

    @Override
    public XXLogPackAfterImprovement toXXLogPack(XLogPack dto) {
        if ( dto == null ) {
            return null;
        }

        XXLogPackAfterImprovement xXLogPackAfterImprovement = new XXLogPackAfterImprovement();

        xXLogPackAfterImprovement.endTime = dto.endTime;
        xXLogPackAfterImprovement.objHash = dto.objHash;
        xXLogPackAfterImprovement.service = dto.service;
        xXLogPackAfterImprovement.txid = dto.txid;
        xXLogPackAfterImprovement.threadNameHash = dto.threadNameHash;
        xXLogPackAfterImprovement.caller = dto.caller;
        xXLogPackAfterImprovement.gxid = dto.gxid;
        xXLogPackAfterImprovement.elapsed = dto.elapsed;
        xXLogPackAfterImprovement.error = dto.error;
        xXLogPackAfterImprovement.cpu = dto.cpu;
        xXLogPackAfterImprovement.sqlCount = dto.sqlCount;
        xXLogPackAfterImprovement.sqlTime = dto.sqlTime;
        byte[] ipaddr = dto.ipaddr;
        if ( ipaddr != null ) {
            xXLogPackAfterImprovement.ipaddr = Arrays.copyOf( ipaddr, ipaddr.length );
        }
        xXLogPackAfterImprovement.kbytes = dto.kbytes;
        xXLogPackAfterImprovement.status = dto.status;
        xXLogPackAfterImprovement.userid = dto.userid;
        xXLogPackAfterImprovement.userAgent = dto.userAgent;
        xXLogPackAfterImprovement.referer = dto.referer;
        xXLogPackAfterImprovement.group = dto.group;
        xXLogPackAfterImprovement.apicallCount = dto.apicallCount;
        xXLogPackAfterImprovement.apicallTime = dto.apicallTime;
        xXLogPackAfterImprovement.countryCode = dto.countryCode;
        xXLogPackAfterImprovement.city = dto.city;
        xXLogPackAfterImprovement.xType = dto.xType;
        xXLogPackAfterImprovement.login = dto.login;
        xXLogPackAfterImprovement.desc = dto.desc;
        xXLogPackAfterImprovement.webHash = dto.webHash;
        xXLogPackAfterImprovement.webTime = dto.webTime;
        xXLogPackAfterImprovement.hasDump = dto.hasDump;
        xXLogPackAfterImprovement.text1 = dto.text1;
        xXLogPackAfterImprovement.text2 = dto.text2;
        xXLogPackAfterImprovement.queuingHostHash = dto.queuingHostHash;
        xXLogPackAfterImprovement.queuingTime = dto.queuingTime;
        xXLogPackAfterImprovement.queuing2ndHostHash = dto.queuing2ndHostHash;
        xXLogPackAfterImprovement.queuing2ndTime = dto.queuing2ndTime;
        xXLogPackAfterImprovement.text3 = dto.text3;
        xXLogPackAfterImprovement.text4 = dto.text4;
        xXLogPackAfterImprovement.text5 = dto.text5;
        xXLogPackAfterImprovement.profileCount = dto.profileCount;
        xXLogPackAfterImprovement.b3Mode = dto.b3Mode;
        xXLogPackAfterImprovement.profileSize = dto.profileSize;
        xXLogPackAfterImprovement.discardType = dto.discardType;
        xXLogPackAfterImprovement.ignoreGlobalConsequentSampling = dto.ignoreGlobalConsequentSampling;

        mapAfterXXLogPack( dto, xXLogPackAfterImprovement );

        return xXLogPackAfterImprovement;
    }
}
