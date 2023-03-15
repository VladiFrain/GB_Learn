package seminar3.hw1.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Items {
    private String Name;
    private Integer Price;
    private Integer Variety;
}
