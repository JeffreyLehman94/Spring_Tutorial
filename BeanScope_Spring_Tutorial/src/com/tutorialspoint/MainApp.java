package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Beans.xml is set to singleton, gets A A B

// Beans.xml set to prototype, gets A null A
public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld objA = (HelloWorld) context.getBean("helloWorld");

      objA.setMessage("I'm object A");
      
      objA.getMessage();

      HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
      
      objB.getMessage();
      
      objB.setMessage("I'm object B");
      
      objA.getMessage();
   }
}