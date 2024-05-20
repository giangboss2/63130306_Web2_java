package web2java_movie.web_java_movie.DTO;


import lombok.Data;
import web2java_movie.web_java_movie.Entity.User;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class BillDTO {
    private int id;
    private LocalDateTime createdTime;
    private List<TicketDTO> listTickets;
    private User user;
}
