package StringArraysProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCount {
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,9,2,1,5};
		
		Integer[] numbers ={7,2,5,7,3,2,8,8,1};
		
		
		
		Map<Integer, Long> input =  Arrays.stream(numbers)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//	System.out.println(input);
		input.forEach((key,value)->
		{
			if(value ==2)
			{
				System.out.println(key + " "+ "repeate : "+value);
			}
		});
		
//		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		hm.forEach((key,value)->
//		{
//			if(value ==1)
//			{
//				System.out.println(key + " "+ "repeate : "+value);
//			}
//		});
		
		
	}

}
