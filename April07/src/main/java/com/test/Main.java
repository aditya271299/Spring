package com.test;

import com.bean.Director;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        Director dd=(Director)context.getBean("d");
        dd.display();
    }
}
