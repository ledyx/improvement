package com.example.improvement.mapping.step1_basic.after;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import scouter.lang.TextTypes;
import scouter.lang.pack.XLogPack;
import scouter.server.db.TextRD;
import scouter.util.DateUtil;

@Mapper(
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        builder = @Builder(disableBuilder = true)
)
public interface XLogPackMapper {
    XLogPackMapper INSTANCE = Mappers.getMapper(XLogPackMapper.class);

    XXLogPackAfterImprovement toXXLogPack(XLogPack dto);

    // 사용자 정의 Field
    @AfterMapping
    default void mapAfterXXLogPack(XLogPack pack, @MappingTarget XXLogPackAfterImprovement xxLogPack) {
        String date = DateUtil.yyyymmdd(pack.endTime);
        xxLogPack.setObjectName(TextRD.getString(date, TextTypes.OBJECT, pack.objHash));
        xxLogPack.setServiceName(TextRD.getString(date, TextTypes.SERVICE, pack.service));
        xxLogPack.setThreadName(TextRD.getString(date, TextTypes.HASH_MSG, pack.threadNameHash));
        xxLogPack.setStackTrace(TextRD.getString(date, TextTypes.ERROR, pack.error));
    }
}
