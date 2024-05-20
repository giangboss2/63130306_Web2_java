package web2java_movie.web_java_movie.Service;


import com.example.cinema_back_end.dtos.MovieDTO;

import java.util.List;

public interface IMovieService {
    List<MovieDTO> findAllShowingMovies();
    MovieDTO getById(Integer movieId);
    List<MovieDTO> findAllShowingMoviesByName(String name);
}
