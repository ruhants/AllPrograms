package StringArraysProgram;

import java.util.ArrayList;
import java.util.List;

public class SortWithElement {
	public static void main(String[] args) {
		int arr[] = {6,3,7,1,8,5,9,12};
		int number=8;
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			if(number>=arr[i]) {
				list.add(arr[i]);
			}else if(number<=arr[i]) {
				list.add(arr[i]);
			}
		}
		System.out.print(list);
		list.stream().sorted().forEach(System.out::println);
	}

	
}
