package web2java_movie.web_java_movie.Entity;

import jakarta.persistence.*;
import lombok.Data;



@Entity
@Data
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
}
