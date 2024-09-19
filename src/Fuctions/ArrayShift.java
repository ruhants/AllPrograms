package Fuctions;

public class ArrayShift {

	public static void main(String[] args) {
	int array[] = { 1, 2, 3, 67, 9 };
//		int insertNum = 50;
		int index = 3;
//
//		for (int i = array.length - 1; i > index; i--) {
//			array[i] = array[i - 1];
//		}
//
//		array[index] = insertNum;
//
//		for (int b : array) {
//			System.out.println(b);
//		}
	
		
		for(int i=0; i<array.length;i++) {
			
			
			if(array[i]== index) {
				
				for(int j=i;j<array.length-1;j++) {
					
				array[j]= array[j+1];
			}
			}
			
		}
		for (int b=0;b<array.length-1;b++) {
			System.out.println(array[b]);
		}

	}

}
