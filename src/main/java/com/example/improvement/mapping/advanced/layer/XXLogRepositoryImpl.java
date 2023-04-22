package com.example.improvement.mapping.advanced.layer;

import com.example.improvement.mapping.advanced.XXLogPackEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class XXLogRepositoryImpl implements XXLogRepository {
    @Override
    public void save(XXLogPackEntity entity) {
        log.info("Entity saved : {}", entity);
    }
}
