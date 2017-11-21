package com.krish;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
      obj.getMessage();
      Map<String,ObjectShape> circleObj =  context.getBeansOfType(ObjectShape.class);
      circleObj.values().forEach(e->e.area());
   }
}