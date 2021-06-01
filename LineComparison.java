package com.LineComparison;

import java.util.Scanner;

public class LineComparison {

	public static void main(String[] args) {
		// Variables
		int x1, y1, x2, y2;
		Scanner obj = new Scanner(System.in);
		// User inputs the coordinates
		System.out.print("Enter a 1st co-ordinate of x-axis of First Line : ");
		x1 = obj.nextInt();
		System.out.print("Enter a 1st co-ordinate of y-axis of First Line : ");
		y1 = obj.nextInt();
		System.out.print("Enter a 2nd co-ordinate of x-axis of First Line : ");
		x2 = obj.nextInt();
		System.out.print("Enter a 2nd co-ordinate of y-axis of First Line : ");
		y2 = obj.nextInt();
		System.out.println("End Points of First Line Segment are = " + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
		double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("Length of a First Line Segment = " + length1);
	}
}