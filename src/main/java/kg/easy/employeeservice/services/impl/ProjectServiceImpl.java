package kg.easy.employeeservice.services.impl;

import kg.easy.employeeservice.dao.ProjectRepo;
import kg.easy.employeeservice.mappers.ProjectMapper;
import kg.easy.employeeservice.models.dto.ProjectDto;
import kg.easy.employeeservice.models.entity.Project;
import kg.easy.employeeservice.services.ProjectService;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepo projectRepo;

    public ProjectServiceImpl(ProjectRepo projectRepo) {
        this.projectRepo = projectRepo;
    }

    @Override
    public ProjectDto save(ProjectDto projectDto) {
        Project project = ProjectMapper.INSTANCE.projectDtoToProject(projectDto);
        project = projectRepo.save(project);
        return ProjectMapper.INSTANCE.projectToProjectDto(project);
    }
}
