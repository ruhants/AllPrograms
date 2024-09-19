package StringArraysProgram;

import java.util.HashSet;

public class FirstDuplicate {
	public static void main(String[] args) {

		int[] array = { 2, 1, 3, 5, 3, 2 };
          int count =0;
		Integer firstDuplicate = null;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					firstDuplicate = array[i];
					count++;
				}
			}
			if(count==1) {
			break;
			}
		}
		System.out.println(firstDuplicate + " firstDuplicate");
	}

}
