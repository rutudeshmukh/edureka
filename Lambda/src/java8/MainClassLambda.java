package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClassLambda {

	public static void main(String[] args) {
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		
		employeeList.add(new Employee(1, "Pooja", 22, "F", "Dev", 2021, 55000));
		employeeList.add(new Employee(2, "Rutuja", 23, "F","Test", 2022, 57000));
		employeeList.add(new Employee(3, "Darshan", 22, "M", "Test", 2024, 57000));
		employeeList.add(new Employee(4, "Prasad", 22, "M", "Dev", 2022, 58000));
		employeeList.add(new Employee(5, "Sejal", 22, "F", "HR", 2021, 59000));
		
		Map<String, List<Employee>> pst1 = employeeList.stream()
	            .collect(Collectors.groupingBy(Employee::getGender));
	    System.out.println(pst1);
							
		
	    Map<String, Long> pst2 = employeeList.stream()
	    		.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
	    pst2.forEach((gender,count)->System.out.println("Count of "+gender+": "+count));
	    
	    Integer[] arr = new Integer[20];
	    //System.out.println(arr[10].intValue());
	    		
	    //second highest , second lowest, max exp , name starts with a, minimum (total) salary in department

        
        Optional<Double> secondHighestSalary = employeeList.stream()
                .map(Employee::getSalary) 
                .distinct() 
                .sorted((s1, s2) -> Double.compare(s2, s1)) 
                .skip(1) 
                .findFirst();
        
        if (secondHighestSalary.isPresent()) {
            System.out.println("Second highest salary: " + secondHighestSalary.get());
        } else {
            System.out.println("Second highest salary not found");
        }
        
        Optional<Double> secondLowestSalary = employeeList.stream()
                .map(Employee::getSalary) 
                .distinct() 
                .sorted() 
                .skip(1) 
                .findFirst();
        
        if (secondLowestSalary.isPresent()) {
            System.out.println("Second lowest salary: " + secondLowestSalary.get());
        } else {
            System.out.println("Second lowest salary not found");
        }
    
        Map<String, Optional<Double>> minSalariesByDept = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.mapping(Employee::getSalary,
                                Collectors.minBy(Double::compare))));

        minSalariesByDept.forEach((dept, minSalary) -> {
            System.out.print("Department: " + dept + " - ");
            if (minSalary.isPresent()) {
                System.out.println("Lowest salary: " + minSalary.get());
            } else {
                System.out.println("No employees in this department");
            }
        });
        
        List<Employee> a = employeeList.stream().filter(p->((String) p).startsWith("a")).collect(Collectors.toList());
	}

}
