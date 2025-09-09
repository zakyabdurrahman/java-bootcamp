package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //in spring vanilla first we make container (context)
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Manufacturer laptopMaker = (Manufacturer) context.getBean("manufacturer");
        laptopMaker.country();
        System.out.println( "Hello World!" );

    }
}
