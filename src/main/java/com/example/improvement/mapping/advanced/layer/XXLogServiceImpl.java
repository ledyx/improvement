package com.example.improvement.mapping.advanced.layer;

import com.example.improvement.mapping.advanced.XXLogPackDiMapper;
import com.example.improvement.mapping.advanced.XXLogPackEntity;
import com.example.improvement.mapping.basic.after.XXLogPackAfterImprovement;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class XXLogServiceImpl implements XXLogService {

    private final XXLogRepository repository;
    private final XXLogPackDiMapper mapper;

    @Override
    public void save(XXLogPackAfterImprovement dto) {
        XXLogPackEntity entity = mapper.toEntity(dto);
        repository.save(entity);
    }
}
