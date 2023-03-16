package Java.seminar4.hw1;

import java.util.LinkedList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        /*
         * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
         */
        List<Integer> numList = new LinkedList<>(List.of(1, 2, 3, 4));
        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.println(numList.get(i));
        }
    }
}