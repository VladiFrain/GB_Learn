package Java.seminar5.hw2;

import java.util.HashMap;
import java.util.Map;

/**
 * 2) Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 */

public class Ex {
    public static void main(String[] args) {
        String input = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String search = "Россия";
        Map<String, Integer> strCount = countWords(input, search);
        System.out.println(strCount);
    }

    private static Map<String, Integer> countWords(String input, String search) {
        search = search.toLowerCase();
        Map<String, Integer> strCount = new HashMap<>();
        var strArray = input.toLowerCase()
                .replace("—", "")
                .replace(".", "")
                .replace("  ", " ").split(" ");
        for (String str : strArray) {
            if (str.equals(search)) {
                int item = strCount.get(str) == null ? 0 : strCount.get(str);
                strCount.put(str, ++item);
            }
        }
        return strCount;
    }

}
