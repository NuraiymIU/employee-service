package kg.easy.employeeservice.mappers.impl;

import kg.easy.employeeservice.mappers.EmployeeMapper;
import kg.easy.employeeservice.mappers.EmployeeProjectMapper;
import kg.easy.employeeservice.mappers.ProjectMapper;
import kg.easy.employeeservice.models.dto.EmployeeProjectDto;
import kg.easy.employeeservice.models.entity.EmployeeProject;

public class EmployeeProjectMapperImpl implements EmployeeProjectMapper {

    @Override
    public EmployeeProject employeeDtoToEmployee(EmployeeProjectDto employeeProjectDto) {
        EmployeeProject employeeProject = new EmployeeProject();
        employeeProject.setId(employeeProjectDto.getId());
        employeeProject.setWorkedDays(employeeProjectDto.getWorkedDays());
        employeeProject.setProject(ProjectMapper.INSTANCE.projectDtoToProject(employeeProjectDto.getProject()));
        employeeProject.setEmployee(EmployeeMapper.INSTANCE.employeeDtoToEmployee(employeeProjectDto.getEmployee()));
        return employeeProject;
    }

    @Override
    public EmployeeProjectDto employeeToEmployeeDto(EmployeeProject employeeProject) {
        EmployeeProjectDto employeeProjectDto = new EmployeeProjectDto();
        employeeProjectDto.setId(employeeProject.getId());
        employeeProjectDto.setWorkedDays(employeeProject.getWorkedDays());
        employeeProjectDto.setEmployee(EmployeeMapper.INSTANCE.employeeToEmployeeDto(employeeProject.getEmployee()));
        employeeProjectDto.setProject(ProjectMapper.INSTANCE.projectToProjectDto(employeeProject.getProject()));
        return employeeProjectDto;
    }
}
