package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.SeatDTO;

import java.util.List;

public interface ISeatService {
    List<SeatDTO> getSeatsByScheduleId(Integer scheduleId);
}
