package sdmcet.cse.oop;

import java.util.Scanner;

class Student {
	private int ia1;
	private int ia2;
	private int ia3;
	private int cta;

	Student() {
		this.ia1 = 0;
		this.ia2 = 0;
		this.ia3 = 0;
		this.cta = 0;
	}

	Student(int ia1, int ia2, int ia3) {
		this.ia1 = ia1;
		this.ia2 = ia2;
		this.ia3 = ia3;

	}

	Student(int ia1, int ia2, int ia3, int cta) {
		this.ia1 = ia1;
		this.ia2 = ia2;
		this.ia3 = ia3;
		this.cta = cta;
	}

	int computeCIE() {

		if (ia1 <= ia2 && ia1 <= ia3) {
			return ia2 + ia3 + cta;
		} else if (ia2 <= ia1 && ia2 <= ia3) {
			return ia1 + ia3 + cta;
		} else
			return ia1 + ia2 + cta;
	}

	char computeGrade() {
		if (computeCIE() >= 45 && computeCIE() <= 50)
			return 'S';
		else if (computeCIE() >= 40 && computeCIE() <= 44)
			return 'A';
		else if (computeCIE() >= 35 && computeCIE() <= 39)
			return 'B';
		else if (computeCIE() >= 30 && computeCIE() <= 34)
			return 'C';
		else if (computeCIE() >= 25 && computeCIE() <= 29)
			return 'D';
		else if (computeCIE() >= 20 && computeCIE() <= 24)
			return 'E';
		else
			return 'F';
	}
}

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st[]=new Student[3];
		
		Scanner sc = new Scanner(System.in);
		int m1,m2,m3,m4;
		
		for(int i=0;i<st.length;i++) {
			System.out.println("enter the details of student"+(i+1));
			System.out.println("enter Ia 1 marks: ");
			m1=sc.nextInt();
			
			System.out.println("enter Ia 2 marks: ");
			m2=sc.nextInt();
		
			System.out.println("enter Ia 3 marks: ");
			m3=sc.nextInt();
			
			System.out.println("enter cta marks: ");
			m4=sc.nextInt();
 
			st[i]=new Student(m1,m2,m3,m4);
			
			System.out.println("--------------------");
			System.out.println(" CIE:" +st[i].computeCIE());
			System.out.println("Grade:" +st[i].computeGrade());
			System.out.println("--------------------");
			
		}
			
		}
//		Student st1 = new Student(20, 19, 19, 10);
//		System.out.println("printing grade of student 1");
//		System.out.println("-------------");
//		System.out.println("cie:" + st1.computeCIE());
//		System.out.println("GRDADE:" + st1.computeGrade());
//		System.out.println("-------------");
//
//		Student st2 = new Student();
//		System.out.println("printing grade of student 2");
//		System.out.println("-------------");
//		System.out.println("cie:" + st2.computeCIE());
//		System.out.println("GRDADE:" + st2.computeGrade());
//		System.out.println("-------------");
//		
//		
//		Student st3 = new Student(15, 10, 5, 10);
//		System.out.println("printing grade of student 3");
//		System.out.println("-------------");
//		System.out.println("cie:" + st3.computeCIE());
//		System.out.println("GRDADE:" + st3.computeGrade());
//		System.out.println("-------------");
}


