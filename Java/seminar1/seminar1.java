package seminar1;

import java.util.Scanner;

public class seminar1 {

    public static void main(String args[]) {
        var sc = new Scanner(System.in);

        // 1 задание
        System.out.print("Введите строку: ");
        String str = sc.nextLine();
        System.out.println(reverseTextString(str));

        // 2 задание
        System.out.println(sumPositiveNumbersFollowedByNegativeNumber());

        // 3 задание
        System.out.print("Введите первое двоичное число: ");
        int one = sc.nextInt();
        System.out.print("Введите второе двоичное число: ");
        int two = sc.nextInt();
        System.out.println(sumBinary(one, two));

        sc.close();
    }

    /**
     * 1)https://leetcode.com/problems/reverse-words-in-a-string/
     * Разворот строки по словам.
     */
    public static String reverseTextString(String str) {
        var list = str.replaceAll("\\s+", " ").split(" ");
        String newstr = "";
        for (int i = 0; i < list.length; i++) {
            newstr += list[list.length - i - 1] + " ";
        }
        return newstr;
    }

    /**
     * 2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму
     * положительных чисел, после которых следует отрицательное число.
     * Пример ввода:
     * 1 2 1 2 -1 1 3 1 3 -1 0
     * Логика расчета:
     * 2 -1 переход -> 2 в сумму
     * 3 -1 переход -> 3 в сумму
     * Пример вывода: 5
     */
    public static int sumPositiveNumbersFollowedByNegativeNumber() {
        var sc = new Scanner(System.in);
        System.out.print("Введите 1 элемент: ");
        int one = sc.nextInt();
        int count = 0;
        while (true) {
            System.out.print("Введите следующий элемент: ");
            int two = sc.nextInt();
            if (two == 0) {
                sc.close();
                return count;
            } else {
                if (one > 0 && two < 0) {
                    count += one;
                }
                one = two;
            }
        }
    }

    /**
     * 3)(*) https://leetcode.com/problems/add-binary/
     * Двоичный калькулятор
     */
    public static int sumBinary(int one, int two) {
        int sum = 0;
        int sumOrder = 0;
        int sumLastOrder = 0;
        boolean remains = false;
        int i = 1;
        while (one != 0) {
            sumOrder = sumLastOrder;
            sumOrder += one % 10;
            one /= 10;
            sumOrder += two % 10;
            two /= 10;
            if (sumOrder == 2 && remains == false) {
                sum += 0 * i;
                remains = true;
            } else if (sumOrder == 1 && remains == false) {
                sum += 1 * i;
            } else if (sumOrder == 0 && remains == false) {
                sum += 0 * i;
            } else if (sumOrder == 0 && remains == true) {
                sum += 1 * i;
                remains = false;
            } else if (sumOrder == 1 && remains == true) {
                sum += 0 * i;
            }
            i *= 10;
        }
        if (remains == true) {
            sum += 1 * i;
        }
        return sum;
    }

}
