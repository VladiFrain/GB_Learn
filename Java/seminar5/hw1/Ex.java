package Java.seminar5.hw1;

import java.util.HashMap;
import java.util.Map;

/**
 * 1) Подсчитать количество вхождения каждого слова
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */

public class Ex {
    public static void main(String[] args) {
        String input = "Россия идет вперед всей планеты. Планета — это не Россия.";
        Map<String, Integer> strCount = countWords(input);
        System.out.println(strCount);
    }

    private static Map<String, Integer> countWords(String input) {
        Map<String, Integer> strCount = new HashMap<>();
        var strArray = input.toLowerCase()
                .replace("—", "")
                .replace(".", "")
                .replace("  ", " ").split(" ");
        for (String str : strArray) {
            int item = strCount.get(str) == null ? 0 : strCount.get(str);
            strCount.put(str, ++item);
        }
        return strCount;
    }
}
