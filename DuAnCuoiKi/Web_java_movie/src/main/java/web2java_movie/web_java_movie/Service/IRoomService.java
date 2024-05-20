package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.RoomDTO;

import java.util.List;

public interface IRoomService {
    List<RoomDTO> getRooms(Integer movieId,Integer branchId,String startDate,String startTime);
}
