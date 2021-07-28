public class Point {

    public double a;
    public double b;

    public Point(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double distance(double a, double b){
        double da = this.a - a;
        double db = this.b - b;
        return Math.sqrt(da*da + db*db);
    }

    public double distance(Point p)
    {
        return distance(p.a, p.b);
    }
}
