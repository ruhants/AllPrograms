package StringArraysProgram;

import java.util.Arrays;

public class Temp {
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,6};
		multiplearr(arr);
	
		
	}
		
		public static void multiplearr(int[] arr) {
			
			int[] res = new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				int temp =1;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]!=arr[j]) {
						temp = temp * arr[j];
					}
				}
				res[i]= temp;
			}
			System.out.println(Arrays.toString(res));
			
		}
		
	}
