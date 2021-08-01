package ru.stqa.pft.sandbox;

public class MyProgram {
	
	public static void main (String[] args){
		Point p1 = new Point(1, 5);
		Point p2 = new Point(1, 10);
		System.out.println("Расстояние между точкой p1(" + p1.a + ";" + p1.b + ") и точкой p2(" + p2.a + ";" + p2.b + ") = " + p1.distance(p2));
	}

}