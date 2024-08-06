package CollectionExamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ls =new LinkedList<>();
		ls.add("pen");
		ls.add("pensil");
		ls.add("notebook");
		ls.add("bag");
		
		System.out.println(ls);
		
		ArrayList<String> al =new ArrayList<>();
		al.add("mobile");
		al.add("laptop");
		al.add("desktop");
		al.add("headphone");
		System.out.println(al);
		 
		ls.addAll(al);
		System.out.println(ls);
		ls.add(2, "speaker");
		System.out.println(ls);
		
		System.out.println("element at index 3 "+ls.get(3));
		
		if(ls.contains("pen")){
			ls.remove(ls.indexOf("pen"));
			System.out.println("after removing element"+ ls);
		}
		System.out.println(ls.contains("pen"));
		
		

	}

}
