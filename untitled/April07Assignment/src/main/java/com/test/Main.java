package com.test;

import com.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");
        Student s =(Student) context.getBean("st");
        System.out.println(s);
    }
}
