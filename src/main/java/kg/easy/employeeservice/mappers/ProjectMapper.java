package kg.easy.employeeservice.mappers;

import kg.easy.employeeservice.mappers.impl.ProjectMapperImpl;
import kg.easy.employeeservice.models.dto.ProjectDto;
import kg.easy.employeeservice.models.entity.Project;

public interface ProjectMapper {

    ProjectMapper INSTANCE = new ProjectMapperImpl();

    Project projectDtoToProject(ProjectDto projectDto);

    ProjectDto projectToProjectDto(Project project);
}
