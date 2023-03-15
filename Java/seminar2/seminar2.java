package seminar2;

import java.math.BigInteger;
import java.util.Scanner;

import seminar2.model.Vector;

// import seminar2.model.Vector;

public class seminar2 {
    public static void main(String[] args) {
        // Задача 0
        Vector vector1 = new Vector(1, 1, 1);
        Vector vector2 = new Vector(1, 2, 1);
        System.out.println(vector1.lengthVector());
        System.out.println(vector1.scalarMulti(vector2));
        System.out.println(vector1.vectorMulti(vector2));
        System.out.println(vector1.cosVector(vector2));
        System.out.println(vector1.sumVector(vector2));
        System.out.println(vector1.difVector(vector2));

        // Задача 1
        System.out.println(sumPrimeNumbers());

        // Задача 2
        System.out.println(isSequanceIncreasing());

        // Задача 3
        int[] array = replacingNegativeElements(new int[] { 1, 3, 4, 5, 8, 23, 45,
                36, -3, -6, 2 });
        for (var el : array) {
            System.out.print(el + " ");
        }

        // Задача 4
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        System.out.println("Validete: " + isValidSudoku(board));

    }

    /**
     * 1) Дана последовательность N целых чисел. Найти сумму простых чисел.
     * 
     * @return sum - сумма простых чисел
     */
    public static int sumPrimeNumbers() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        Integer integer;
        BigInteger bigInteger;
        for (int i = 0; i < n; i++) {
            integer = sc.nextInt();
            bigInteger = BigInteger.valueOf(integer);
            if (bigInteger.isProbablePrime((int) Math.log(integer))) {
                sum += integer;
            }
        }
        sc.close();
        return sum;
    }

    /**
     * 2) Дана последовательность из N целых чисел. Верно ли, что последовательность
     * является возрастающей.
     * 
     * @return boolean - является ли последовательность возрастающей
     */
    public static boolean isSequanceIncreasing() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int one = sc.nextInt();
        for (int i = 1; i < n; i++) {
            int two = sc.nextInt();
            if (two < one) {
                sc.close();
                return false;
            }
            one = two;
        }
        sc.close();
        return true;
    }

    /**
     * 3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов
     * двузначных элементов массива.
     * 
     * @param array - массив данных
     * @return newArray - новый массив обработанный по правилу замены отрицательных
     *         элементов
     */
    public static int[] replacingNegativeElements(int[] array) {
        int[] newArray = new int[array.length];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 10 && array[i] < 100) {
                sum += i;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                newArray[i] = sum;
            } else {
                newArray[i] = array[i];
            }
        }
        return newArray;
    }

    /**
     * 4)(*) Отвалидировать доску судоку
     * 
     * @param board - двумерный массив судоку
     * @return boolean - истина если в судоку нет ошибок
     */
    private static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (!rowCorrect(board[i]))
                return false;
        }
        for (int i = 0; i < board[0].length; i++) {
            if (!columnCorrect(board, i)) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[0].length; j += 3) {
                if (!blockCorrect(board, i, j))
                    return false;
            }
        }
        return true;
    }

    /**
     * @param chars - массив символов ряда
     * @return boolean - истина если в ряду нет повторений
     */
    private static boolean rowCorrect(char[] chars) {
        String allstring = "";
        for (char ch : chars) {
            if (stringContains(ch, allstring))
                return false;
            allstring += ch;
        }
        return true;
    }

    /**
     * @param board        - вся доска судоку
     * @param columnNumber - номер проверяемой колонки
     * @return boolean - истина если в колонке нет повторений
     */
    public static boolean columnCorrect(char[][] board, int columnNumber) {
        String allstring = "";
        char ch;
        for (int i = 0; i < board[0].length; i++) {
            ch = board[i][columnNumber];
            if (stringContains(ch, allstring))
                return false;
            allstring += ch;
        }
        return true;
    }

    /**
     * @param board    - вся доска судоке
     * @param startRow - индекс первой строки блока
     * @param StartCol - индекс первой колонки блока
     * @return boolean - истина если в блоке нет повторений
     */
    public static boolean blockCorrect(char[][] board, int startRow, int StartCol) {
        String allstring = "";
        char ch;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ch = board[startRow + i][StartCol + j];
                if (stringContains(ch, allstring))
                    return false;
                allstring += ch;
            }
        }
        return true;
    }

    /**
     * @param ch     - искомый символ
     * @param string - строка в которой ищем
     * @return boolean - входит ли символ в данную строку
     */
    public static boolean stringContains(char ch, String string) {
        if (ch != '.') {
            return string.contains(Character.toString(ch));
        }
        return false;
    }
}
