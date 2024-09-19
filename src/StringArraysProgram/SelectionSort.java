package StringArraysProgram;

public class SelectionSort {
	
	public static void selectsort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int minindex =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					minindex = j;
				}
			}
			int temp = arr[minindex];
			arr[minindex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
				int arr[] = {11,44,15,38,19,75,10};
		selectsort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	

}
