package StringArraysProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortEmelemtLeftRight {
	public static void main(String[] args) {
		int[] arr = { 2, 6, 7, 5, 1, 2, 9, 3 };
		int element = 5;
		List<Integer> list = new ArrayList<>();
		for (int num : arr) {
			list.add(num);
		}
		List<Integer> result = reorderList(list, element);
		System.out.println(result);
	}
	private static List<Integer> reorderList(List<Integer> list, int elemnt){
	  List<Integer> leftpart = new ArrayList<>();
	  List<Integer> righttpart = new ArrayList<>(); 
	  for(int num:list) {
		  if(num<elemnt) {
			  leftpart.add(num);
		  }else if(num>elemnt)  {
			  righttpart.add(num);
		  }
	  }
	  Collections.sort(leftpart);
	  Collections.sort(righttpart);
	  List<Integer> result = new ArrayList<>(leftpart);
	  result.add(elemnt);
	  result.addAll(righttpart);
	  
	return result;
	  
  }
}
