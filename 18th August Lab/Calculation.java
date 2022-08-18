// Write a Java program that accepts two integers from the user and then print the sum,difference,product,average,the distance(the differnce between the two integer),maximum(the larger between the two integer), minimum(the smaller between the two integer)//

package Operator;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		// creating scanner class
		   Scanner in = new Scanner (System.in); // System.in is a standard input stream
		   System.out.print(" Input 1st integer:   ");
		   int  firstInt= in.nextInt();
		   System.out.print(" Input 2nd integer:   ");
		   int  SecondInt= in.nextInt();
		   
		   System.out.printf("The sum two integers: %d%n" , firstInt+SecondInt);
		   System.out.printf("The Difference of two integers: %d%n ",firstInt-SecondInt);
		   System.out.printf("The Product of two integers: %d%n ",firstInt*SecondInt);
		   System.out.printf("The Average of two integers: %.2f%n",(double)(firstInt+SecondInt)/2);
                   System.out.printf("The Distance of two integers: %d%n",Math.abs(firstInt-SecondInt)); 	
		   System.out.printf("The Max integer: %d%n",Math.max(firstInt,SecondInt));
		   System.out.printf("The Min integer: %d%n",Math.min(firstInt,SecondInt));
				
	}
}
