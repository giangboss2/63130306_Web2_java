package web2java_movie.web_java_movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web2java_movie.web_java_movie.Entity.Bill;

public interface IBillRepository extends JpaRepository<Bill, Integer> {
}