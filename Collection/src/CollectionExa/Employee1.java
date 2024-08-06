package CollectionExa;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class Employee1 {
	
	  public static void main(String[] args) {
	  
	    // Make a collection
	    LinkedHashSet<String> cars = new LinkedHashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Volvo");
	    cars.add("Mazda");
	  
	    // Get the iterator
	    Iterator<String> it = cars.iterator();
	  
	    // Print the all item
	    cars.stream().forEach(System.out::println);
	  }
	

}
