package OOP.seminar3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("ВОДА");
        List<Product> lstBW = new ArrayList<>();
        lstBW.add(new BottleOfWater("water 0.5l", 200.0, 200));
        lstBW.add(new BottleOfWater("water 1l", 300.0, 300));
        lstBW.add(new BottleOfWater("water 1.5l", 200.0, 200));
        lstBW.add(new BottleOfWater("water 2l", 300.0, 300));

        BottleOfWaterVendingMachine machine = new BottleOfWaterVendingMachine(lstBW);
        BottleOfWater water = machine.getProduct("water 1l", 300);
        System.out.println(water);

        System.out.println("Список воды без сортировки:");
        for (Product el : lstBW)
            System.out.println(el);

        System.out.println();
        System.out.println("Список воды c сортировкой по имени используя Iterator:");
        lstBW.sort(new SortName());
        Iterator<Product> iterator = lstBW.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("ГОРЯЧИЕ НАПИТКИ");
        List<Product> lstHD = new ArrayList<>();
        lstHD.add(new HotDrink("coffe", 200.0, 200, 1000));
        lstHD.add(new HotDrink("tee", 500.0, 300, 90));
        lstHD.add(new HotDrink("coffe2", 100.0, 200, 10));
        lstHD.add(new HotDrink("tee", 300.0, 300, 90));

        HotDrinksVendingMachine machine2 = new HotDrinksVendingMachine(lstHD);
        HotDrink drink = machine2.getProduct("tee", 300, 90);
        System.out.println(drink);

        System.out.println("Список горячих напитков без сортировки:");
        for (Product el : lstHD)
            System.out.println(el);

        System.out.println();
        System.out.println("Список горячих напитков c сортировкой по цене используя Iterator:");
        lstHD.sort(new SortCost());
        Iterator<Product> it = lstHD.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}