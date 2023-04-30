package com.example.improvement.mapping.step2_advanced.layer;

import com.example.improvement.mapping.step2_advanced.XXLogPackEntity;
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
