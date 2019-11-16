package FactoryClassDesignPattern;

public class FactoryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Point cartisianPoint=Point.PointFactory.CartisianSystem(10, 20);
		 System.out.println("CartisianSystem"+cartisianPoint);
		 Point polarSystem=Point.PointFactory.PolarSystem(20, 30);
		 System.out.println("PolarSystem"+polarSystem);

	}

}

class Point{
	double x,y;
	private Point(double a,double b) {
		this.x=a;
		this.y=b;
	}
	public static class PointFactory{
		public static Point CartisianSystem(double a, double b) {
			return new Point(a,b);
		}
		public static Point PolarSystem(double a,double theta) {
			return new Point(a*Math.cos(theta),a*Math.sin(theta));
		}
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
