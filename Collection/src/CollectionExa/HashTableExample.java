package CollectionExa;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableExample {
	public static void main(String[] args) {
		
//	 ArrayList<String> cars = new ArrayList<String>();
//	    cars.add("Volvo");
//	    cars.add("BMW");
//	    cars.add("Volvo");
//	    cars.add("Mazda");
	   
	 Hashtable<Integer,String> h1 = new Hashtable<>();
	 h1.put(1, "Pen");
	 h1.put(2, "Book");
	 h1.put(3, "Pencil");
	 h1.put(4, "NoteBook");
	 
	 System.out.println(h1.get(1));
	 System.out.println(h1.getOrDefault(2, "not avail"));
	 System.out.println(h1.getOrDefault(77, "not avail"));
	 System.out.println(h1.putIfAbsent(5, "hii"));
	 System.out.println(h1.get(5));
	 System.out.println(h1.getOrDefault(2,"gyh"));
	 
	 Enumeration<Integer> en = h1.keys();
//	 System.out.println(en.asIterator());
	 while(en.hasMoreElements()) {
		 int key = en.nextElement();
		 System.out.println(key);
		 }
	 
	 Set<Entry<Integer,String>> en1 = h1.entrySet();
	 for(Entry<Integer,String> en2: en1) {
		 System.out.println(en2.getValue()+" "+en2.getKey());
	 }	    
	}
	  
}
