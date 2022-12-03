package kg.easy.employeeservice.mappers.impl;

import kg.easy.employeeservice.mappers.ProjectMapper;
import kg.easy.employeeservice.models.dto.ProjectDto;
import kg.easy.employeeservice.models.entity.Project;

public class ProjectMapperImpl implements ProjectMapper {

    @Override
    public Project projectDtoToProject(ProjectDto projectDto) {
        Project project = new Project();
        project.setId(projectDto.getId());
        project.setName(projectDto.getName());
        project.setStartDate(projectDto.getStartDate());
        project.setEndDate(projectDto.getEndDate());
        return project;
    }

    @Override
    public ProjectDto projectToProjectDto(Project project) {
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(project.getId());
        projectDto.setName(project.getName());
        projectDto.setStartDate(project.getStartDate());
        projectDto.setEndDate(project.getEndDate());
        return projectDto;
    }
}
