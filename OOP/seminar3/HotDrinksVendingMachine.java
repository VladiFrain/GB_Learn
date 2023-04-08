package OOP.seminar3;

import java.util.List;

public class HotDrinksVendingMachine implements VendingMachine {
    private List<Product> products;

    public HotDrinksVendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProduct(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        throw new IllegalStateException(String.format("Продукт c названием %s не найден.", name));
    }

    public HotDrink getProduct(String name, int volume, int temperature) {
        for (Product product : products) {
            if (product instanceof HotDrink) {
                if (product.getName().equalsIgnoreCase(name) && ((HotDrink) product).getVolume() == volume
                        && ((HotDrink) product).getTemperature() == temperature) {
                    return (HotDrink) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s, объемом %s и температурой %s" +
                " не найден.", name, volume, temperature));
    }

}