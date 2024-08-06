package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
public class OptionalExa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[20];
		//System.out.println(arr[10].intValue());
		
		Optional<Integer> r = Optional.ofNullable(arr[10]);
		//if optional for isPrsent find the 
		//else print 
		if(r.isPresent()) {
			System.out.println(arr[10]);
		}else {
			System.out.println("Value is not present");
		}
		Employee em = new Employee(1,"Rutuja", 12, "F", "IT", 2024, 12);
		Optional<Employee> op = Optional.ofNullable(em);
		System.out.println(op);
		System.out.println(op.isEmpty());
		op.ifPresent(s->System.out.println(s.getName()));
		 
		
		

	}

}
