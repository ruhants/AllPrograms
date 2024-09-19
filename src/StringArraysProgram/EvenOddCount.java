package StringArraysProgram;

public class EvenOddCount {
	
	public static void main(String[] args) {
		
		int arr[] = {5,5,6,7,8,9,3};
		countCheck(arr);
		System.out.println(countCheck(arr));
		
	}
	public static String countCheck(int[] arr) {
		
		 int evencount =0;
		 int oddcount =0;
		 
		  for(int num : arr) {
			  if(num%2==0) {
				  evencount++;
			  }else {
				  oddcount++;
			  }
		  }
		  
		  if(evencount %2==0 & oddcount %2 !=0) {
			  return "yes";
		  }else {
			  return "no";
		  }
		
		
	}
}
