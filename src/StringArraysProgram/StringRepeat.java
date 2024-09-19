package StringArraysProgram;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringRepeat {
	public static void main(String[] args) {
		String str = "hi every onee ";
		Map<Character, Long> counting= str.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
	counting.forEach((caharacter,countin)-> System.out.println(caharacter +" "+ countin));
	counting.forEach((c,n)->{
	if(n==1) {
		System.out.println(" count one time "+c + " "+  n);
	}});
		
		
		Map<Character, Long> map = str.chars().filter(n->n!=' ').mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
        .ifPresent(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		
		
		
		
		
	
		
		
	}

}
