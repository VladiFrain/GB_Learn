package seminar3.hw1;

public class Ex {
    /**
     * 1. Дан массив записей: наименование товара, цена, сорт.
     * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название
     * которых содержит «высший».
     */
    public static void main(String[] args) {
        Items items1 = new Items("Колбаса высшего сорта", 123, 1);
        Items items2 = new Items("Телятина обычного сорта", 123, 3);
        Items items3 = new Items("Шоколад высшего сорта", 112, 2);
        Items items4 = new Items("Кофе низшего сорта", 321, 4);

        List<Items> listItems = new ArrayList<>();
        listItems.add(items1);
        listItems.add(items2);
        listItems.add(items3);
        listItems.add(items4);

        int max = 0;
        for (int i = 0; i < listItems.size(); i++) {
            if (listItems.get(i).getName().contains("высшего")) {
                if (listItems.get(i).getPrice() > max) {
                    max = listItems.get(i).getPrice();
                }
            }
        }
        System.out.println(max);
    }
}
