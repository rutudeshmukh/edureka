package com.org.web.spring_demo_project;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
	
	
	
	public void add(String actorName) {
		if(actorName== null) {
			throw new RuntimeException("Actor name is Null",new NullPointerException());
		}else {
			System.out.println("Actor Name: " + actorName);
		}
	}
	
	public boolean delete(String actorName) {
		if(actorName !=null) {
			System.out.println(actorName);
			return true;
		}else {
			return false;
		}
	}
}
