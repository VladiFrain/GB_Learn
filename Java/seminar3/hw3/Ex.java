package seminar3.hw3;

import seminar3.hw3.model.Book;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Ex {
    public static void main(String[] args) {
        Book book1 = new Book("Выбор. О свободе и внутренней силе человека", "Эгер", 499, 2017, 410);
        Book book2 = new Book("Любовь с уведомлением", "Аркади", 200, 2023, 211);
        Book book3 = new Book("Евгений Онегин", "Пушкин", 490, 1833, 449);
        Book book4 = new Book("Что есть Россия? Дневники писателя", "Достоевский", 279, 2014, 260);

        List<Book> listBook = new ArrayList<>();
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book4);

        BigInteger bigInteger;
        for (Book book : listBook) {
            bigInteger = BigInteger.valueOf(book.getNumberPages());
            if (bigInteger.isProbablePrime((int) Math.log(book.getNumberPages())) && book.getLastname().contains("а")
                    && book.getYear() >= 2010) {
                System.out.println(book.getName());
            }
        }
    }

}
