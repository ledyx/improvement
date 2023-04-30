package com.example.improvement.mapping.step2_advanced;

import com.example.improvement.mapping.step1_basic.after.XXLogPackAfterImprovement;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;
import scouter.lang.TextTypes;
import scouter.server.db.TextRD;
import scouter.util.DateUtil;

import java.util.Optional;

@Mapper(
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        builder = @Builder(disableBuilder = true)
)
public abstract class XXLogPackDiMapper {

    @Autowired
    private XIdGenerator xIdGenerator;

    @Mapping(source = "dto", target = "xlog")
    @Mapping(source = "ipaddr", target = "ipaddr")
    @Mapping(source = "dto", target = "stackTrace", qualifiedByName = "remapStackTrace")
    public abstract XXLogPackEntity toEntity(XXLogPackAfterImprovement dto);

    // 사람이 읽을 수 있는 문자열로 IP 변환
    protected String map(byte[] ipaddr) {
        return new String(ipaddr);
    }

    // dto로 받은 stackTrace가 null이면 다시 parsing
    @Named("remapStackTrace")
    protected String remapStackTrace(XXLogPackAfterImprovement pack) {
        return Optional.ofNullable(pack.getStackTrace())
                .orElseGet(() -> {
                    String date = DateUtil.yyyymmdd(pack.endTime);
                    return TextRD.getString(date, TextTypes.ERROR, pack.error);
                });
    }

    @AfterMapping
    protected void mapXId(XXLogPackAfterImprovement dto, @MappingTarget XXLogPackEntity entity) {
        int xid = xIdGenerator.generate(dto);
        entity.setXid(xid);
    }
}
