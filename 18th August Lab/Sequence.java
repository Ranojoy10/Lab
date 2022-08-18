// Write a Java program to break an integer into a sequence of individual digits. //

package Operator;

import java.util.Scanner;

public class Sequence {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner (System.in)) {
			System.out.print(" Input six Digits:   ");
			   int  a = sc.nextInt();
			   int  n1 = (a/100000)%10;
			   int  n2 = (a/10000)%10;
			   int  n3 = (a/1000)%10;
			   int  n4 = (a/100)%10;
			   int  n5 = (a/10)%10;
			   int  n6 = a%10;
			   System.out.println(n1+ " "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
		}
	}

}
