package com.org.web.spring_demo_project;
import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	
	public void add(String movieName) {
		if(movieName== null) {
			throw new RuntimeException("Movie name is Null",new NullPointerException());
		}else {
			System.out.println("Movie Name: "+movieName);
		}
	}
	
	public boolean delete(String movieName) {
		if(movieName !=null) {
			System.out.println(movieName);
			return true;
		}else {
			return false;
		}
	}
}
