package kg.easy.employeeservice.models.dto;

import lombok.Data;

@Data
public class EmployeeProjectDto {
    private Long id;
    private int workedDays;
    private EmployeeDto employee;
    private ProjectDto project;

}
