package web2java_movie.web_java_movie.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import web2java_movie.web_java_movie.Entity.Movie;

import java.util.List;

public interface IMovieRepository extends JpaRepository<Movie, Integer> {
    List<Movie> findMoviesByIsShowingOrderByIdDesc(Integer isShowing);
    List<Movie> findMoviesByIsShowingAndNameContaining(Integer isShowing,String name);
}