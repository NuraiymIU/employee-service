package kg.easy.employeeservice.models.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String lastName;
    private String patronymic;
    private String address;
    private double salary;
    private String characteristic;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Position position;

}
