package OOP.seminar3;

import java.util.Comparator;

public class SortCost implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        if (product1.getCost() == product2.getCost())
            return 0;
        if (product1.getCost() < product2.getCost())
            return -1;

        return 1;
    }

}