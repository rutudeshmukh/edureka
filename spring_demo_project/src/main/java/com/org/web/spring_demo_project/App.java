package com.org.web.spring_demo_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
    
    MovieRepository m = (MovieRepository) context.getBean("movieRepository");
    m.add("ehhe");
    //m.add(null);
    
    
    ActorRepository a = (ActorRepository) context.getBean("actorRepository");
    a.add("wdhb11");
    //a.add(null);
    }
}
