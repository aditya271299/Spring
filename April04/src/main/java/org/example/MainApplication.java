package org.example;

import org.example.HelloWorld;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class MainApplication {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Object obj = context.getBean("hello");
        HelloWorld obj_hello = (HelloWorld) obj;

        System.out.println( "hello "+obj_hello.getMsg());

    }
}