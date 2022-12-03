package kg.easy.employeeservice.mappers.impl;

import kg.easy.employeeservice.mappers.EmployeeMapper;
import kg.easy.employeeservice.mappers.PositionMapper;
import kg.easy.employeeservice.models.dto.EmployeeDto;
import kg.easy.employeeservice.models.entity.Employee;

public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public Employee employeeDtoToEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setId(employeeDto.getId());
        employee.setName(employeeDto.getName());
        employee.setLastName(employeeDto.getLastName());
        employee.setPatronymic(employeeDto.getPatronymic());
        employee.setAddress(employeeDto.getAddress());
        employee.setSalary(employeeDto.getSalary());
        employee.setCharacteristic(employeeDto.getCharacteristic());
        employee.setPosition(PositionMapper.INSTANCE.positionDtoToPosition(employeeDto.getPosition()));
        return employee;
    }

    @Override
    public EmployeeDto employeeToEmployeeDto(Employee employee) {
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setLastName(employee.getLastName());
        employeeDto.setPatronymic(employee.getPatronymic());
        employeeDto.setAddress(employee.getAddress());
        employeeDto.setSalary(employee.getSalary());
        employeeDto.setCharacteristic(employee.getCharacteristic());
        employeeDto.setPosition(PositionMapper.INSTANCE.positionToPositionDto(employee.getPosition()));
        return employeeDto;
    }
}
