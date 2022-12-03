package kg.easy.employeeservice.mappers.impl;

import kg.easy.employeeservice.mappers.PositionMapper;
import kg.easy.employeeservice.models.dto.PositionDto;
import kg.easy.employeeservice.models.entity.Position;

import java.util.List;
import java.util.stream.Collectors;

public class PositionMapperImpl implements PositionMapper {
    @Override
    public Position positionDtoToPosition(PositionDto positionDto) {
        Position position = new Position();
        position.setId(positionDto.getId());
        position.setName(positionDto.getName());
        return position;
    }

    @Override
    public PositionDto positionToPositionDto(Position position) {
        PositionDto positionDto = new PositionDto();
        positionDto.setId(position.getId());
        positionDto.setName(position.getName());
        return positionDto;
    }

    @Override
    public List<PositionDto> positionListToPositionDto(List<Position> positions) {
        List<PositionDto> positionDtoList = positions
                .stream()
                .map(x -> positionToPositionDto(x))
                .collect(Collectors.toList());
        return positionDtoList;
    }
}
