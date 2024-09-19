package StringArraysProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {
	
	public static void main(String[] args) {
		Integer[] array1 = {1,2,3,4};
		Integer[] array2 = {5, 6, 7, 8};
        Integer[] array3 = new Integer[array1.length+array2.length];
		
//		List<Integer> temp = new ArrayList<>(Arrays.asList(array1));
//		temp.addAll(Arrays.asList(array2));
//		Integer[] arr3 = temp.toArray(new Integer[0]);
//		List<Integer> result = Arrays.asList(arr3).stream().distinct().toList();
//		
//	
//		System.out.println(result);
		
		
		for(int i=0;i<array1.length;i++) {
			array3[i] = array1[i];
		}
		for(int j=0;j<array2.length;j++) {
			array3[array1.length+j]=array2[j];
		}
		System.out.println(Arrays.toString(array3));
	}

}
