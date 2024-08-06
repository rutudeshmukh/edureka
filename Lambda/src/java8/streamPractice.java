package java8;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamPractice {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<>();
		ar.add("pen");
		ar.add("book");
		ar.add("bottle");
		Stream<String> s = ar.stream();
		Stream<String> ps = ar.parallelStream();//this we use improve to performance on multi-core processor.
		
		int[] array = {1,23,4,456,78};
		IntStream is = Arrays.stream(array);
		//IntStream is a class of stream interface, it represent stream of primitive int valued elements.
		//we declared the stream of array
		
		//Streamof method
		Stream<String> stream  =Stream.of("mobile","charger","laptop");
		s = Stream.of("mobile");
		System.out.println(s);
		s = Stream.of("hwh","edhiie","hdedi");
		System.out.println(s);
		System.out.println(stream);
		s.forEach(System.out::println);
		System.out.println(" ");
		
		//Stream<String> stream= Stream.of("Mobile","charger","Laptop");
		
		//filter 
		ArrayList<String> filtered4 = (ArrayList<String>) ar.stream()
				.filter(st->st.length()>4)
				.collect(Collectors.toList());
	
		ArrayList<String> filtered = (ArrayList<String>) ar.stream()
				.filter(st->st.length()>4)
				.collect(Collectors.toList());
		
		
		Set<String> filtered2 = (Set<String>) ar.stream()
				.filter(st->st.length()>4)
				.collect(Collectors.toSet());
		
		filtered.forEach(System.out::println);
		
		//map
		List<Integer> lenghts = ar.stream()
				.map(sp -> sp.length())
				.collect(Collectors.toList());
		lenghts.forEach(System.out::println);
		System.out.println(" ");
		List<Integer> lenghts1 = ar.stream()
				.map(String::length)
				.collect(Collectors.toList());
		lenghts1.forEach(System.out::println);
		
//		public static Integer solve(Integer l,Integer n) {
//			try {
//				int z;
//				return z = l/n;
//			}catch(Exception e) {
//				e.printStackTrace();
//			}
//		}
//		
//		
//		public static List<Integer> divide(List<Integer> L1,Integer x){
//			return L1.stream()
//					.map(n->solve(L1,x))
//					.collect(Collectors.toList());
//		}
		
		//sort
		List<Integer> l= Arrays.asList(2,3,4,2,1,2);
		List<Integer> st1 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted"+st1);
		
		//distinct
		List<Integer> l1= Arrays.asList(2,3,4,2,1,2);
		List<Integer> st2 = l.stream().sorted().distinct().collect(Collectors.toList());
		System.out.println("distinct"+st2);
		
		
		
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		try(Stream<String> s11= Files.lines(Paths.get("/home/labuser/Desktop/note"))){
					{
				s11.forEach(System.out::println);
				};
		}catch(Exception e){
			System.out.println("Error");
		}

	}

}
