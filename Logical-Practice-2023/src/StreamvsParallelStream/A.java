package StreamvsParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		
		List<String> l=Arrays.asList("hello","java","kde", "a");
		
		//List<String> list = l.stream().collect(Collectors.toList());
		
		 System.out.println("for steam");
		 l.stream().forEach(System.out::println);
		
	     System.out.println("for parallel stream");
		 l.parallelStream().forEach(System.out::println);
		
		
		
	}

}
