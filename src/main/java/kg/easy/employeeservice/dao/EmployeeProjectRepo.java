package kg.easy.employeeservice.dao;

import kg.easy.employeeservice.models.entity.EmployeeProject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeProjectRepo extends JpaRepository<EmployeeProject, Long> {
}
