package com.example.improvement.mapping.step2_advanced;

import com.example.improvement.mapping.step1_basic.after.XXLogPackAfter;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-01T22:52:56+0900",
    comments = "version: 1.5.4.Final, compiler: javac, environment: Java 11.0.17 (Eclipse Adoptium)"
)
@Component
public class XXLogPackDiMapperImpl extends XXLogPackDiMapper {

    @Override
    public XXLogPackEntity toEntity(XXLogPackAfter dto) {
        if ( dto == null ) {
            return null;
        }

        XXLogPackEntity xXLogPackEntity = new XXLogPackEntity();

        xXLogPackEntity.setXlog( dto );
        xXLogPackEntity.setIpaddr( map( dto.ipaddr ) );
        xXLogPackEntity.setStackTrace( remapStackTrace( dto ) );
        xXLogPackEntity.setObjectName( dto.getObjectName() );
        xXLogPackEntity.setServiceName( dto.getServiceName() );
        xXLogPackEntity.setThreadName( dto.getThreadName() );

        mapXId( dto, xXLogPackEntity );

        return xXLogPackEntity;
    }
}
