package Utility;

public class Swap {

	public static void main(String[] args) {

		System.out.println("Swapping number");
		
		int i =10, j= 15;
		System.out.println("Before swap: " +i + " "+j);
		int sum= j - i;
	
		 i = i + sum;
		 j = j - sum;
		 
		 System.out.println("after swap: " +i + " "+j);
	}

}
