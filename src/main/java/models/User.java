package models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User  {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private String name;
    private String function;



}
