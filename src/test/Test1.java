package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		Integer[] array1 = {1,2,3,4,5,6};
		Integer[] array2 = {3,2,5,6,7,8};
		List<Integer> list1 = findCommon(array1, array2);
		System.out.println(list1);
	}

	public static List<Integer> findCommon(Integer[] arr1,Integer[] arr2){
		
		List<Integer> list = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<>(Arrays.asList(arr1));
		list2.retainAll(list);
		return list2;
		
	}
}
