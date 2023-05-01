package com.example.improvement.mapping.step1_basic.after;

import java.util.Arrays;
import javax.annotation.Generated;
import scouter.lang.pack.XLogPack;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-01T22:52:54+0900",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 11.0.17 (Eclipse Adoptium)"
)
public class XLogPackMapperImpl implements XLogPackMapper {

    @Override
    public XXLogPackAfter toXXLogPack(XLogPack dto) {
        if ( dto == null ) {
            return null;
        }

        XXLogPackAfter xXLogPackAfter = new XXLogPackAfter();

        xXLogPackAfter.endTime = dto.endTime;
        xXLogPackAfter.objHash = dto.objHash;
        xXLogPackAfter.service = dto.service;
        xXLogPackAfter.txid = dto.txid;
        xXLogPackAfter.threadNameHash = dto.threadNameHash;
        xXLogPackAfter.caller = dto.caller;
        xXLogPackAfter.gxid = dto.gxid;
        xXLogPackAfter.elapsed = dto.elapsed;
        xXLogPackAfter.error = dto.error;
        xXLogPackAfter.cpu = dto.cpu;
        xXLogPackAfter.sqlCount = dto.sqlCount;
        xXLogPackAfter.sqlTime = dto.sqlTime;
        byte[] ipaddr = dto.ipaddr;
        if ( ipaddr != null ) {
            xXLogPackAfter.ipaddr = Arrays.copyOf( ipaddr, ipaddr.length );
        }
        xXLogPackAfter.kbytes = dto.kbytes;
        xXLogPackAfter.status = dto.status;
        xXLogPackAfter.userid = dto.userid;
        xXLogPackAfter.userAgent = dto.userAgent;
        xXLogPackAfter.referer = dto.referer;
        xXLogPackAfter.group = dto.group;
        xXLogPackAfter.apicallCount = dto.apicallCount;
        xXLogPackAfter.apicallTime = dto.apicallTime;
        xXLogPackAfter.countryCode = dto.countryCode;
        xXLogPackAfter.city = dto.city;
        xXLogPackAfter.xType = dto.xType;
        xXLogPackAfter.login = dto.login;
        xXLogPackAfter.desc = dto.desc;
        xXLogPackAfter.webHash = dto.webHash;
        xXLogPackAfter.webTime = dto.webTime;
        xXLogPackAfter.hasDump = dto.hasDump;
        xXLogPackAfter.text1 = dto.text1;
        xXLogPackAfter.text2 = dto.text2;
        xXLogPackAfter.queuingHostHash = dto.queuingHostHash;
        xXLogPackAfter.queuingTime = dto.queuingTime;
        xXLogPackAfter.queuing2ndHostHash = dto.queuing2ndHostHash;
        xXLogPackAfter.queuing2ndTime = dto.queuing2ndTime;
        xXLogPackAfter.text3 = dto.text3;
        xXLogPackAfter.text4 = dto.text4;
        xXLogPackAfter.text5 = dto.text5;
        xXLogPackAfter.profileCount = dto.profileCount;
        xXLogPackAfter.b3Mode = dto.b3Mode;
        xXLogPackAfter.profileSize = dto.profileSize;
        xXLogPackAfter.discardType = dto.discardType;
        xXLogPackAfter.ignoreGlobalConsequentSampling = dto.ignoreGlobalConsequentSampling;

        mapAfterXXLogPack( dto, xXLogPackAfter );

        return xXLogPackAfter;
    }
}
