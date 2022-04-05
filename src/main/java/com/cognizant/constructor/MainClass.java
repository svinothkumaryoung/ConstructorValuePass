package com.cognizant.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("constructorArg.xml");
        DataClass dc=(DataClass)context.getBean("datac");
        dc.printData();
    }
}
