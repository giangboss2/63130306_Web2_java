package web2java_movie.web_java_movie.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import web2java_movie.web_java_movie.Entity.Room;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public interface IRoomRepository extends JpaRepository<Room, Integer> {

    @Query("SELECT r FROM Room r WHERE r.id in (SELECT s.room.id FROM Schedule s WHERE s.movie.id=:movieId AND " +
            "s.branch.id = :branchId AND s.startDate=:startDate AND s.startTime=:startTime)")
    List<Room> getRoomByBranchAndMovieAndSchedule(@Param("movieId") Integer movieId,
                                                  @Param("branchId") Integer branchId,
                                                  @Param("startDate") LocalDate startDate,
                                                  @Param("startTime") LocalTime startTime);
}