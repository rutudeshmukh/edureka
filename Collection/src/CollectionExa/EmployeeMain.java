package CollectionExa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class EmployeeMain {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> ls = new LinkedHashSet<>();
		ls.add(new Employee(1,"Rutuja","Pune"));
		ls.add(new Employee(2,"Sakshi","Mumbai"));
		ls.add(new Employee(1,"Rutuja","Pune"));
		ls.add(new Employee(4,"Sejal","Goa"));
		
		Employee e1 = new Employee(4,"Sejal","Goa");
		Iterator <Employee> it = ls.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		System.out.println("Size of LinkedHashSet = "
                + ls.size());
		
		ls.stream().forEach(System.out::println);
			
		
	}
}
