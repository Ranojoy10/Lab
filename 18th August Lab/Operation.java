package Operator;

import java.util.Scanner;

public class Operation {

	//Arithmetic operations(addition,multiplication,subtraction, division)

	public static void main(String[]args){ // main method

		// creating scanner class
		   Scanner sc= new Scanner (System.in); // System.in is a standard input stream
		   System.out.print("Enter first number -   ");
		   int  a = sc.nextInt();
		   System.out.print("Enter second number -   ");
		   int  b = sc.nextInt();

	int sum = a+b;

	System.out.println("The sum two integers: " +sum);

	int sub= a-b;

	System.out.println("The Difference of two integers: " +sub);
	
	int multiply= a*b;

	System.out.println("The Product of two integers : " +multiply);
	
	float Avg=(a+b)/2;
	
	System.out.println("The Average of two integers : " +Avg);

	int div= a/b;

	System.out.println("The Division of two number is:" +div);

	if (a>b)
		
	{ 	
		System.out.println("The Max integer:" +a);
		System.out.println("The Max integer:" +b);
		
	}
	
	else {
		
		System.out.println("The Max integer:" +b);
		System.out.println("The Max integer:" +a);
	     }
	}
	}

