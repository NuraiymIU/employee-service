package kg.easy.employeeservice.controllers;

import kg.easy.employeeservice.models.dto.EmployeeDto;
import kg.easy.employeeservice.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public EmployeeDto save(@RequestBody EmployeeDto employeeDto) {
        return employeeService.save(employeeDto);
    }

    @GetMapping("/all")
    public List<EmployeeDto> getAllEmployee() {
        return employeeService.findAll();
    }
}
