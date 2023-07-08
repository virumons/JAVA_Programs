package sdmcet.cse.oop;

class person {
	protected String fname;
	protected String lname;
	protected String age;
	protected String mobnum;

	void display() {
		System.out.println("1st name:" + fname);
		System.out.println("last name:" + lname);
		System.out.println("Age:" + age);
		System.out.println("Phone number:" + mobnum);
	}

}

class Employee extends person {
	String EmpID;
	String Salary;

	void display() {

		System.out.println("------------");
		super.display();

		//System.out.println("1st name:" + fname);
		//System.out.println("last name:" + lname);
		System.out.println("employee id:" + EmpID);
		System.out.println("salary:" + Salary);
	}
}

class Student extends person {
	String USN;
	String dep;

	void display() {
		System.out.println("------------");
		super.display();

		//System.out.println("first name:" + fname);
		//System.out.println("last name:" + lname);
		System.out.println("usn:" + USN);
		System.out.println("department:" + dep);
		

	}
}

public class StudentEmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		person p = new person();
		Employee e = new Employee();
		Student st = new Student();

		p.fname = "DRAVYA";
		p.lname = "JAIN";
		p.age = "20";
		p.mobnum = "99654732120";

		e.fname = "ADITYA";
		e.lname = "KAPOOR";
		e.age=" 26";
		e.mobnum=" 8976452319";
		e.EmpID = "2SD21";
		e.Salary = "THIRTY THOUSAND ONLY";

		st.fname = "KHUSHI";
		st.lname = "ACHARYA";
		st.age=" 20";
		st.mobnum=" 764321478";
		st.USN = "CS034";
		st.dep="CSE";

		p.display();
		e.display();
		st.display();

	}

}
