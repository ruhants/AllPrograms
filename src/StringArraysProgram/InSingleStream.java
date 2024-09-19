package StringArraysProgram;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InSingleStream {
	public static void main(String[] args) {
		
	
	
	Integer[] array = {1,3,4,6,7,8};
	 
	Stream<Integer> stream = Arrays.stream(array);
	 
	
	 
	 
	 
	IntSummaryStatistics collect = stream.collect(Collectors.summarizingInt(Integer::intValue));
	 System.out.println(collect.getMin());
	 System.out.println(collect.getMax());
	 System.out.println(collect.getAverage());
	
 Arrays.stream(array);
	 
	 Integer min = stream.sorted().findFirst().get();
	 
	
	}
}
