package seminar3.hw2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private String country;
    private int weight;
    private int price;
    private int varieties;
}
