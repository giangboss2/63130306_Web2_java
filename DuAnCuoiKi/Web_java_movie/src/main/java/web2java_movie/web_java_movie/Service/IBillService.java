package web2java_movie.web_java_movie.Service;

import com.example.cinema_back_end.dtos.BookingRequestDTO;

public interface IBillService {
    void createNewBill(BookingRequestDTO bookingRequestDTO) throws RuntimeException;
}
