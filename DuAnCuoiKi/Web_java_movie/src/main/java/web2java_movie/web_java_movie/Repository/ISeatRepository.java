package web2java_movie.web_java_movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import web2java_movie.web_java_movie.Entity.Seat;

import java.util.List;

public interface ISeatRepository extends JpaRepository<Seat, Integer> {
    List<Seat> getSeatByRoom_Id(Integer roomId);
}