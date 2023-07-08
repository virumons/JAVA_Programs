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

	public class AreaDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			triangle t1=new triangle(5,10);
			square s1=new square(4);
			rectangle r1=new rectangle(4,5);

			System.out.println("area of triangle: " +t1.area());
			System.out.println("area of square: " +s1.area());
			System.out.println("area of rectangle: " +r1.area());
		}

	}
