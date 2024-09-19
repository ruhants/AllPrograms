package StringArraysProgram;

import java.nio.file.spi.FileSystemProvider;

public class MaxixmumusingNoInbuilt {
	
	public static void main(String[] args) {
		int[] arr= {4,7,9,2,1,3};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			
		}
		System.out.println(max+ " max");
	}

}
