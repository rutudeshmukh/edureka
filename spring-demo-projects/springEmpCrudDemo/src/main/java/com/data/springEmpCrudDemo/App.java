package com.data.springEmpCrudDemo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.data.springEmpCrudDemo.db.EmpDB;
import com.data.springEmpCrudDemo.model.Emp;


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
        System.out.println( "Hello World!" );
        context = new ClassPathXmlApplicationContext("context.xml");
        EmpDB db = context.getBean("db",EmpDB.class);
        
       Emp e1 = new Emp(0, "Mahesh", 5000, "java");
       Emp e2 = new Emp(0, "suresh", 8500, "java Springboot");
       Emp e3 = new Emp(0, "Siddesh", 5000, "Dot Net");
       Emp e4 = new Emp(0, "Ramesh", 99000, "AI/ML");
       
       db.saveEmployee(e1);
       db.saveEmployee(e2);db.saveEmployee(e3);db.saveEmployee(e4);
       System.out.println("recore inserted");
       
      int update= db.updateEmployee(new Emp(2, "Raghav",66000, "WEb3"));
      System.out.println(" Row updated -> "+update);
      
      int delete = db.deleteEmployee(new Emp(1,"Mahesh",5000,"java"));
      System.out.println(" Row deleted ->  "+delete);
      
   
     
       
    }
}
