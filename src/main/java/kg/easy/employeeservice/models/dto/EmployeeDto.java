package kg.easy.employeeservice.models.dto;

import lombok.Data;

@Data
public class EmployeeDto {
    private Long id;
    private String name;
    private String lastName;
    private String patronymic;
    private String address;
    private double salary;
    private String characteristic;
    private PositionDto position;
}
