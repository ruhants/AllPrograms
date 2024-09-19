package StringArraysProgram;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonDuplicateCharater {
	
	public static void main(String[] args) {
        String str = "szuvkeshkumar";

//        Character character = str.chars()
//                .mapToObj(i -> Character.toLowerCase((char) i))
//                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
//            
//                .entrySet().stream()
//                .filter(entry -> entry.getValue() == 1L)
//                .map(entry -> entry.getKey())
//                .findFirst().orElse(null);
//
//        if (character != null) {
//            System.out.println("First non-duplicate character is: " + character);
//        } else {
//            System.out.println("No non-duplicate character found.");
//        }
        
        
        Map<Character,Long> map = str.chars().mapToObj(c->(char)c)
        		.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        
        System.out.println(map);
        
       char c = str.chars().mapToObj(e->(char)e).filter(n->map.get(n)>1).skip(0).findFirst().get();
        System.out.println(c);
    }
}
