package kg.easy.employeeservice.mappers;

import kg.easy.employeeservice.mappers.impl.PositionMapperImpl;
import kg.easy.employeeservice.models.dto.PositionDto;
import kg.easy.employeeservice.models.entity.Position;

import java.util.List;

public interface PositionMapper {

    PositionMapper INSTANCE = new PositionMapperImpl();

    Position positionDtoToPosition(PositionDto positionDto);

    PositionDto positionToPositionDto(Position position);

    List<PositionDto> positionListToPositionDto(List<Position> positions);
}
