package com.org.sim.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.sim.data.db.DBClass;
import com.org.sim.data.model.Dish;

/**
 * Hello world!
 *
 */
public class App 
{
    private static ApplicationContext context;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("context.xml");
        DBClass dbref = context.getBean("db",DBClass.class);
       // System.out.println(dbref);
        
        Dish d1 = new Dish(0, "Noodles", 200);
        Dish d2 = new Dish(0, "Burger", 100);
        Dish d3 = new Dish(0, "Pizza", 500);
        
        dbref.insertDish(d1);    dbref.insertDish(d2);   dbref.insertDish(d3);
        
        int i = dbref.updateDish(new Dish(3, " Cheez Pizza", 900));
        System.out.println("One rwo updated : "+i);
        
        Dish d4 = new Dish(0, null, 0);
        
        int del = dbref.delete(new Dish(5, "Burger", 100));
        System.out.println(" One row deleted "+del);
    }
}
