// Write a Java program to convert minutes into a number of years  and days.

package Operator;

import java.util.Scanner;

public class minutes {

	public static void main(String[] args) {
	       
		 double minutesInYear= 60*24*365;
		 
		 Scanner input = new Scanner(System.in);
		 
		 System.out.print(" Input the number of minutes:   ");
		 
		 double min = input.nextDouble();
		 
		 long years =(long) (min/minutesInYear);
		 int days =(int) (min/60/24)%365;
		 
		 System.out.print((int)min+" minutes is approximately " +years+" years and "+days+" days ");
		 
	}

}
