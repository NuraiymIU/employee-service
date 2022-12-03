package kg.easy.employeeservice.services;

import kg.easy.employeeservice.models.dto.PositionDto;

import java.util.List;

public interface PositionService {

    PositionDto save(PositionDto positionDto);
    List<PositionDto> findAll();
}
