package StringArraysProgram;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountLastWord {
public static void main(String[] args) {
	String string = "hi hello every one";
	Map<Character, Long> map = string.chars().mapToObj(c->(char)c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	
	String[] s = string.split(" ");
	for(int i=s.length-1;i==s.length-1;i--) {
		System.out.println(s[i].length());
	}
	for(int i =s.length-1;i>=0;i--) {
		if(i==3) {
			System.out.println(s[i].length());
			break;
		}
		
	}
	
}
}
