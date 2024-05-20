package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.ScheduleDTO;

import java.time.LocalDate;
import java.util.List;

public interface IScheduleService {
    List<String> getStartTimes(Integer movieId, Integer branchId, LocalDate startDate);
    List<ScheduleDTO> getSchedules(Integer movieId,Integer branchId,String startDate, String startTime,
                                   Integer roomId);
}
