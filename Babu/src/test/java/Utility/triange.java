package Utility;

public class triange {

	public static void main(String[] args) {

		System.out.println("triangle format");

		int n =5;

		int count =n%2;

		for(int i =0; i < n; i++) {


			
			  for(int k=n; k >= i; k--) {
				  System.out.print(" "); 
				  }
			 


			for(int j= 0 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
