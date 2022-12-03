package kg.easy.employeeservice.controllers;

import kg.easy.employeeservice.models.dto.PositionDto;
import kg.easy.employeeservice.services.PositionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/position")
public class PositionController {

    private PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping("/save")
    public PositionDto savePosition(@RequestBody PositionDto positionDto) {
        return positionService.save(positionDto);
    }

    @GetMapping("/all")
    public List<PositionDto> findAllPositions() {
        return positionService.findAll();
    }
}
