package kg.easy.employeeservice.services.impl;

import kg.easy.employeeservice.dao.EmployeeRepo;
import kg.easy.employeeservice.mappers.EmployeeMapper;
import kg.easy.employeeservice.models.dto.EmployeeDto;
import kg.easy.employeeservice.models.entity.Employee;
import kg.easy.employeeservice.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public EmployeeDto save(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.INSTANCE.employeeDtoToEmployee(employeeDto);
        employee = employeeRepo.save(employee);
        return EmployeeMapper.INSTANCE.employeeToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> findAll() {
        List<EmployeeDto> employeeDtos = employeeRepo.findAll()
                .stream()
                .map(x -> EmployeeMapper.INSTANCE.employeeToEmployeeDto(x))
                .collect(Collectors.toList());
        return employeeDtos;
    }
}
