package com.test;

import com.beans.Book;
import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        BookDao bookDao=(BookDao) context.getBean("bd");
        Book b = new Book();
        //b.setBid(1);
        //b.setBookName("g");
        //b.setAuthorName("cc");
        //b.setPrice(162);
        //bookDao.insertBook(b);
        //System.out.println("===book inserted===");
        //bookDao.updateBook("abc",321);
        //System.out.println("===book record updated===");
        //bookDao.deleteBook("ghh");
        //System.out.println("===record deleted===");
        //System.out.println("===all books in table===");
       /* List<Book> list = bookDao.fetchAllBooks();
        for (Book bk :list
        ) {
            System.out.println(bk);
        }*/
        //System.out.println("===books with like author===");
       /* List<Book> auth = bookDao.likeAuthor();
        for (Book authr :auth) {
            System.out.println(authr);
        }*/
        System.out.println("===books between price range===");
        List<Book> pp = bookDao.betweenPrice();
        for (Book p :pp) {
            System.out.println(p);
        }
    }
}