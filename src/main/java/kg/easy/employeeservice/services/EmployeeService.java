package kg.easy.employeeservice.services;

import kg.easy.employeeservice.models.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

    EmployeeDto save(EmployeeDto employeeDto);

    List<EmployeeDto> findAll();
}
