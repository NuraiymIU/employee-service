package kg.easy.employeeservice.services.impl;

import kg.easy.employeeservice.dao.EmployeeProjectRepo;
import kg.easy.employeeservice.mappers.EmployeeProjectMapper;
import kg.easy.employeeservice.models.dto.EmployeeProjectDto;
import kg.easy.employeeservice.models.entity.EmployeeProject;
import kg.easy.employeeservice.services.EmployeeProjectService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeProjectServiceImpl implements EmployeeProjectService {

    private EmployeeProjectRepo employeeProjectRepo;

    public EmployeeProjectServiceImpl(EmployeeProjectRepo employeeProjectRepo) {
        this.employeeProjectRepo = employeeProjectRepo;
    }

    @Override
    public EmployeeProjectDto save(EmployeeProjectDto employeeProjectDto) {
        EmployeeProject employeeProject = EmployeeProjectMapper.INSTANCE.employeeDtoToEmployee(employeeProjectDto);
        employeeProject = employeeProjectRepo.save(employeeProject);
        return EmployeeProjectMapper.INSTANCE.employeeToEmployeeDto(employeeProject);
    }
}
