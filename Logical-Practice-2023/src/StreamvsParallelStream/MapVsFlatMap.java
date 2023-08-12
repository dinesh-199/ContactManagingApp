package StreamvsParallelStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMap {
	public static void main(String[] args) {
		
		List<Integer> l= Arrays.asList(1,2,3,4,5);
		
		List<Integer> collect = l.stream().map(a->a*2).collect(Collectors.toList());
		System.out.println(collect);
		//List<Integer> collect = l.stream().map(a->a*2).collect(Collectors.toList());
		
		 l.stream().map(a->a*2).forEach(System.out::println);
		
	}

}
