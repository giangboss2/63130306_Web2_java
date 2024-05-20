package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.TicketDTO;

import java.util.List;

public interface ITicketService {
    List<TicketDTO> getTicketsByUserId(Integer userId);
}
