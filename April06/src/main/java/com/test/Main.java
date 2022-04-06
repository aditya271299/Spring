package com.test;

import com.beans.Batch;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Batch batch =(Batch) context.getBean("b");
        batch.display();
    }
}
