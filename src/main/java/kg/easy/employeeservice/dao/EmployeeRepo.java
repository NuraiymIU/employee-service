package kg.easy.employeeservice.dao;

import kg.easy.employeeservice.models.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
