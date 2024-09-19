package Fuctions;

public class Addwithoutsign {
	public static void main(String[] args) {
		System.out.println(Addwithoutsign.Add(100, 1000));
	}
	static int  Add(int a, int b){  
	        while (b != 0){
            int carry = (a & b) ; 
            a =(a^b);
	        b = carry<< 1;
	        }
			return a;    
	 }
	
	
	}
