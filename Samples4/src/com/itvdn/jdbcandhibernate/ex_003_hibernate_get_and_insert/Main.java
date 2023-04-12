package com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert;

import com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Author;
import com.itvdn.jdbcandhibernate.ex_003_hibernate_get_and_insert.entity.Book;

import java.util.List;

/**
 * Created by Asus on 01.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        AuthorHelper ah = new AuthorHelper();
        String[] names = {"Zelenskiy1", "Zaluzhniy1", "Shevchenko1"};

        for (String name : names) {
            Author author = new Author();
            author.setName(name);
            ah.addAuthor(author);
        }

        BookHelper bookHelper= new BookHelper();
        Book book= new Book();
        book.setAuthor_id(10);book.setName("Alina");
        bookHelper.addBook(book);
        book.setAuthor_id(12);book.setName("Adrya");
        bookHelper.addBook(book);

//        int[] id= {1,2};
//        String[] name = {"Lina ","Vadim"};
//        for (String na: name) {
//            book.setName(na);
//            bookHelper.addBook(book);
//        }
//
//        for (int ids:id) {
//            book.setAuthor_id(ids);
//            bookHelper.addBook(book);
//        }
//
//
//        Author author = new Author();
//        author.setName("Mazepa");
//        ah.addAuthor(author);
//
//
//        List<Author> authorList = ah.getAuthorList();
//
//        for (Author a : authorList) {
//            System.out.println(a.getId() + " " + a.getName());
//        }
//
//        Author a = ah.getAuthorById(3);
//        System.out.println(a.getName());
    }

}
