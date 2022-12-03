package kg.easy.employeeservice.mappers;

import kg.easy.employeeservice.mappers.impl.EmployeeMapperImpl;
import kg.easy.employeeservice.models.dto.EmployeeDto;
import kg.easy.employeeservice.models.entity.Employee;

public interface EmployeeMapper {

    EmployeeMapper INSTANCE = new EmployeeMapperImpl();

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);

    EmployeeDto employeeToEmployeeDto(Employee employee);
}
