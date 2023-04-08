package OOP.seminar3;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private final List<Product> products;

    public BottleOfWaterVendingMachine(List<Product> products) {
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

    public BottleOfWater getProduct(String name, int volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (product.getName().equalsIgnoreCase(name) && ((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }

        }
        throw new IllegalStateException(String.format("Продукт c названием %s и объемом %s" +
                " не найден.", name, volume));
    }
}