package kg.easy.employeeservice.controllers;

import kg.easy.employeeservice.models.dto.EmployeeProjectDto;
import kg.easy.employeeservice.services.EmployeeProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee-project")
public class EmployeeProjectController {

    private EmployeeProjectService employeeProjectService;

    public EmployeeProjectController(EmployeeProjectService employeeProjectService) {
        this.employeeProjectService = employeeProjectService;
    }

    @PostMapping("/save")
    public EmployeeProjectDto save(@RequestBody EmployeeProjectDto employeeProjectDto) {
        return employeeProjectService.save(employeeProjectDto);
    }
}
