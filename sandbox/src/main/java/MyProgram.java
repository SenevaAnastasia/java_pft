public class MyProgram {
	
	public static void main (String[] args){
		Point p1 = new Point();
		Point p2 = new Point();
		p1.a = 1;
		p1.b = 5;
		p2.a = 2;
		p2.b = 5;
		System.out.println("Расстояние между точкой p1(" + p1.a + ";" + p1.b + ") и точкой p2(" + p2.a + ";" + p2.b + ") = " + distance(p1, p2));
	}

	public static double distance(Point p1, Point p2){
		return Math.sqrt((p2.a - p1.a)*(p2.a - p1.a) + (p2.b - p1.b)*(p2.b - p1.b));
	}

}