package sdmcet.cse.oop;
class shape {
	protected double a;
	protected double b;

	double area() {
		System.out.println("area cannot be computed ");
		return -1;
	}
}

	class triangle extends shape {
		triangle(double a, double b) {
			this.a = a;
			this.b = b;
		}

		double area() {
			double area = 0.5 * a * b;
			return area;
		}

	}

	class square extends shape {
		square(double a) {
			this.a = a;
		}

		double area() {
			double area = a * a;
			return area;
		}
	}

	class rectangle extends shape {
		rectangle(double a, double b) {
			this.a = a;
			this.b = b;
		}

		double area() {
			double area = a * b;
			return area;
		}
	}

public class AreaDmdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		triangle s1=new triangle(5,10);
		square s2=new square(4);
		rectangle s3=new rectangle(4,5);

		System.out.println("area of triangle: " +s1.area());
		System.out.println("area of square: " +s2.area());
		System.out.println("area of rectangle: " +s3.area());
	}

}
