package com.org.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.org.jdbc.dao.StudentDao;
import com.org.jdbc.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context = new ClassPathXmlApplicationContext("myxml.xml");
       StudentDao st = (StudentDao) context.getBean("studentDao");
       Student obj = new Student(1, "Neeraj", "Computer science department");
       st.insertStudentInfo(obj);
       System.out.println(obj);
        
        
    }
}
