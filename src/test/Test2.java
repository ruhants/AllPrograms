package test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {
	
public static void main(String[] args) {
	Integer[] array1 = {1,2,3,4,5,1,2,7,8,9,5};
	Map<Integer,Long> map = Arrays.stream(array1)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	map.forEach((key,value)->
	{
		if(value>1) {
			System.out.print(key +"="+ value+ " ");
		}
	}
	);
}

}
