package test;

public class TestBubble {
	
	public static void bubble(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1])
				{
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
	}
	
	public static void bubble2(String[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0)
				{
				String temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {10,4,6,7,8,1};
		String arr2[]= {"mohan","rohan","sukesh","zesan"};
		bubble(arr);
		bubble2(arr2);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		for(String st : arr2) {
			System.out.println(st);
		}
	}

}
