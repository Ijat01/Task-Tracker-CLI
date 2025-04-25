import java.time.LocalDateTime;
import java.util.ArrayList;

public class Task {

    public int id;
    public String description;
    public String status;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;

    public Task(String description, int id){

        this.id = id;
        this.description = description;
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
        status = "todo";

    }


}
