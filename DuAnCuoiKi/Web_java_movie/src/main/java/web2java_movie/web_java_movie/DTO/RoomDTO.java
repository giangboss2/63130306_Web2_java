package web2java_movie.web_java_movie.DTO;

import lombok.Data;

@Data
public class RoomDTO {
    private int id;
    private String name;
    private int capacity;
    private double totalArea;
    private String imgURL;
    private BranchDTO branch;
}
