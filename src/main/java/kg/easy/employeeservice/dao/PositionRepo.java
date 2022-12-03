package kg.easy.employeeservice.dao;

import kg.easy.employeeservice.models.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepo extends JpaRepository<Position, Long> {
}
