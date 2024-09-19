package StringArraysProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class CountName {
public static void main(String[] args) {
	List<String> names = Arrays.
			asList
			("Ashok", "Hemant", "Saroj", "Anil", "Rahul", "Suresh");
	names.stream().map(n->n.length() +" "+ n).forEach(System.out::println);
	
	names.stream().map(n->n.length()+ " " +n).forEach(System.out::println);
	
}
}
