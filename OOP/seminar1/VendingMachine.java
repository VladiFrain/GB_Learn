package OOP.seminar1;

import java.util.ArrayList;

public class VendingMachine implements Machine {
    protected ArrayList<Product> list;

    public VendingMachine() {
        list = new ArrayList<>();
    }

    public void addProduct(Product newItem) {
        list.add(newItem);
    }

    public ArrayList getProduct(String searchName, Integer volume) {
        ArrayList<Product> tempList = getProductByName(searchName);

        ArrayList<Product> result = new ArrayList<>();
        for (Product tempItem : tempList) {
            HotWater item = (HotWater) tempItem;
            if (item.getVolume().equals(volume)) {
                result.add(tempItem);
            }
        }
        return result;
    }

    public ArrayList getProductByName(String searchName) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list) {
            if (item.getName().contains(searchName)) {
                result.add(item);
            }
        }
        return result;
    }

    public ArrayList getProductByPrice(Double searchPrice) {
        ArrayList<Product> result = new ArrayList<Product>();
        for (Product item : list) {
            if (item.getPrice().equals(searchPrice)) {
                result.add(item);
            }
        }
        return result;
    }
}