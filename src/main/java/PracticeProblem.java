/*
Author: Alex Liang
File: Lesson 1.7: Boolean Logic
Date Created: Feb 23, 2026
Date Last Modified: Feb 23, 2026
*/

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
		//Write question 1 code here
	boolean bool1 = true;
	boolean bool2 = false; 
	System.out.println(bool1 && bool2);
	System.out.println(bool1 || bool2);
	}

	public static void q2() {
		//Write question 2 code here
	String letter1;
	String letter2;
Scanner input = new Scanner(System.in);
	System.out.print("Input a lowercase letter: ");
	letter1 = input.nextChar(); 
	input.nextLine();
	letter2 = input.nextChar();
	input.nextLine();
	}

	public static void q3() {
		//Write question 3 code here
	double num;
Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	num = input.nextDouble();
	input.nextLine();
	boolean range = num >= 0 && num <= 10;
	System.out.print(range);
	System.out.println();
	}

	public static void q4() {
		//Write question 4 code here
	double num;
Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	num = input.nextDouble();
	input.nextLine();
	boolean posNumber = num > 0 && num != 5;
	System.out.print(posNumber);
	System.out.println();
	}

	public static void q5() {
		//Write question 5 code here
	String word;
Scanner input = new Scanner(System.in);
	word = input.nextLine();
	System.out.println(word.compareTo("banana") == 0);
	}

	public static void q6() {
		//Write question 5 code here
	int integer;
Scanner input = new Scanner(System.in);
	integer = input.nextInt();
	input.nextLine();
	boolean even = integer%2 == 0;
	System.out.print(even);
	}

}
