package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("employeeConfig.xml");
        Employee emp = (Employee) context.getBean("emp1");
        System.out.println(emp.getName());
        System.out.println(emp.getCourses());
        System.out.println(emp.getPhone());
        System.out.println(emp.getCity());
    }
}
