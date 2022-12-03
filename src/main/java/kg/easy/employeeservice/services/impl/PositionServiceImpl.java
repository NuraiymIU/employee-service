package kg.easy.employeeservice.services.impl;

import kg.easy.employeeservice.dao.PositionRepo;
import kg.easy.employeeservice.mappers.PositionMapper;
import kg.easy.employeeservice.models.dto.PositionDto;
import kg.easy.employeeservice.models.entity.Position;
import kg.easy.employeeservice.services.PositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    private PositionRepo positionRepo;

    public PositionServiceImpl(PositionRepo positionRepo) {
        this.positionRepo = positionRepo;
    }

    @Override
    public PositionDto save(PositionDto positionDto) {
        Position position = PositionMapper.INSTANCE.positionDtoToPosition(positionDto);
        position = positionRepo.save(position);
        return PositionMapper.INSTANCE.positionToPositionDto(position);
    }

    @Override
    public List<PositionDto> findAll() {
        return PositionMapper.INSTANCE.positionListToPositionDto(positionRepo.findAll());
    }
}
