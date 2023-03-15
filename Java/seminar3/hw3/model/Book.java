package seminar3.hw3.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private String name;
    private String lastname;
    private Integer price;
    private Integer year;
    private Integer numberPages;
}
