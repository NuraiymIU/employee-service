package kg.easy.employeeservice.mappers;

import kg.easy.employeeservice.mappers.impl.EmployeeProjectMapperImpl;
import kg.easy.employeeservice.models.dto.EmployeeProjectDto;
import kg.easy.employeeservice.models.entity.EmployeeProject;

public interface EmployeeProjectMapper {

    EmployeeProjectMapper INSTANCE = new EmployeeProjectMapperImpl();

    EmployeeProject employeeDtoToEmployee(EmployeeProjectDto employeeProjectDto);

    EmployeeProjectDto employeeToEmployeeDto(EmployeeProject employeeProject);
}
