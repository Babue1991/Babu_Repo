package Utility;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {

		int year, n ;

		System.out.println("Enter the year which you want to check");
		Scanner in = new Scanner(System.in);
		year = in.nextInt();

		n = year%4;

		if(n == 0) {
			System.out.println("The given year is leap year");
		}else {
			System.out.println("The given year is not a leap year");
		}
	}

}
