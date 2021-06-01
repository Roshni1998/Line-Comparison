package com.LineComparison;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) {
	// Declaration of Variables
	int x1, y1, x2, y2, x3, y3, x4, y4;
	// User inputs the coordinates
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a 1st co-ordinate of x-axis of First Line : ");
	x1 = obj.nextInt();
	System.out.print("Enter a 1st co-ordinate of y-axis of First Line : ");
	y1 = obj.nextInt();
	System.out.print("Enter a 2nd co-ordinate of x-axis of First Line : ");
	x2 = obj.nextInt();
	System.out.print("Enter a 2nd co-ordinate of y-axis of First Line : ");
	y2 = obj.nextInt();
	System.out.print("Enter a 1st co-ordinate of x-axis of Second Line : ");
	x3 = obj.nextInt();
	System.out.print("Enter a 1st co-ordinate of y-axis of Second Line : ");
	y3 = obj.nextInt();
	System.out.print("Enter a 2nd co-ordinate of x-axis of Second Line : ");
	x4 = obj.nextInt();
	System.out.print("Enter a 2nd co-ordinate of y-axis of Second Line : ");
	y4 = obj.nextInt();
	// Print the coordinates
	System.out.println("End Points of First Line Segment are = " + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
	System.out.println("End Points of Second Line Segment are = " + "(" + x3 + "," + y3 + ")" + "(" + x4 + "," + y4 + ")");
	// Convert double into String
	double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	String str1 = Double.toString(length1);
	double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
	String str2 = Double.toString(length2);
	// Prints length of 2 line segment
	System.out.println("Length of a First Line Segment = " + length1);
    System.out.println("Length of a Second Line Segment = " + length2);
    // Using Java compareTo method to compare 2 lengths
	System.out.println(str1.compareTo(str2)); // Prints 0;(because str1=str2)
	System.out.println(str1.compareTo(str2)); // Prints 1;(because str1>str2)
	System.out.println(str2.compareTo(str1)); // Prints -1;(because str1<str2)
}
}
