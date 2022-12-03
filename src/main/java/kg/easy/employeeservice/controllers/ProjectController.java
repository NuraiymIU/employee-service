package kg.easy.employeeservice.controllers;

import kg.easy.employeeservice.models.dto.ProjectDto;
import kg.easy.employeeservice.services.ProjectService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/project")
public class ProjectController {

    private ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/save")
    public ProjectDto save(@RequestBody ProjectDto projectDto) {
        return projectService.save(projectDto);
    }
}
