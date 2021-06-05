package com.LineComparison;

public class LineComparison {
	//Variables Declaration
	int x1, y1, x2, y2;
	String line;
	static double length1, length2;
	
	//Method for compute the length of lines
	public double lengthOfLine(String line, int x1, int y1, int x2, int y2) {
		double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("End Points of Line Segments are = " + "(" + x1 + "," + y1 + ")" + "(" + x2 + "," + y2 + ")");
		System.out.println("Length of " +line+ " = " + length);
		return length;		
	}
	
	public static void main(String[] args) {
		LineComparison l1 = new LineComparison();
		double length1 = l1.lengthOfLine("Line 1",7, 5, 3, 1);
		String str1 = Double.toString(length1);
		LineComparison l2 = new LineComparison();
		double length2 = l2.lengthOfLine("Line 2",2, 4, 5, 0);
		String str2 = Double.toString(length2);
		System.out.println(str1.equals(str2));//True or False
		System.out.println(str1.compareTo(str2));//prints 1
		System.out.println(str2.compareTo(str1));//prints -1
	}
}
