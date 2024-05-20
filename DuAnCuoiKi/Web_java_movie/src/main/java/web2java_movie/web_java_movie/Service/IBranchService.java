package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.BranchDTO;

import java.util.List;

public interface IBranchService {
    List<BranchDTO> getBranchesThatShowTheMovie(Integer movieId);
}
