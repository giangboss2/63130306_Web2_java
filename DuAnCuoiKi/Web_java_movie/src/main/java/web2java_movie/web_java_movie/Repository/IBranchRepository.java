package web2java_movie.web_java_movie.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import web2java_movie.web_java_movie.Entity.Branch;

import java.util.List;

public interface IBranchRepository extends JpaRepository<Branch, Integer> {
    @Query("SELECT b FROM Branch b where b.id in " +
            "(SELECT s.branch.id FROM Schedule s JOIN s.movie m WHERE s.movie.id = :movieId )")
    List<Branch> getBranchThatShowTheMovie(@Param("movieId") Integer movieId);
}