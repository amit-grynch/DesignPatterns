package FactoryMethod;

public class PointCordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point CartisianPoint=Point.CartisianSystem(20, 30);
		System.out.println("Cartisian System:"+CartisianPoint);
		Point polarPoint=Point.PolarSystem(10, 20);
		System.out.println("PolarSystem:"+polarPoint);

	}

}

class Point{
	double x,y;
	private Point(double a,double b) {
		this.x=a;
		this.y=b;
	}
	
	public static Point  CartisianSystem(double a,double  b) {
		 return new Point(a,b);
	}
	public static Point PolarSystem(double rho,double theta) {
		return new Point(rho*Math.cos(theta),rho*Math.sin(theta));
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
