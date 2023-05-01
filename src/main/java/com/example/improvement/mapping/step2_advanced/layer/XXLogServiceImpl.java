package com.example.improvement.mapping.step2_advanced.layer;

import com.example.improvement.mapping.step1_basic.after.XXLogPackAfter;
import com.example.improvement.mapping.step2_advanced.XXLogPackDiMapper;
import com.example.improvement.mapping.step2_advanced.XXLogPackEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class XXLogServiceImpl implements XXLogService {

    private final XXLogRepository repository;
    private final XXLogPackDiMapper mapper;

    @Override
    public void save(XXLogPackAfter dto) {
        XXLogPackEntity entity = mapper.toEntity(dto);
        repository.save(entity);
    }
}
