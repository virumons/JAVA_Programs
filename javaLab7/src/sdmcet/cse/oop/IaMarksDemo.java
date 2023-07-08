package sdmcet.cse.oop;
import java.util.Scanner;

class IamarksValidate{
	private int marks;
	
	public void setMarks(int marks) {
		this.marks=marks;
	}
	
	public void validateandprintMarks() throws IllegalArgumentException {
		if(marks <0 || marks >20) {
			throw new IllegalArgumentException("Invalid input ia marks should be in range of 0-20");
		}else {
			System.out.println("entered marks: " +marks);
		}
	}
	
}
public class IaMarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter ia-1 marks");
		 int marks =sc.nextInt();
		 
		 IamarksValidate val=new IamarksValidate();
		 val.setMarks(marks);
		 
		 try {
			 val.validateandprintMarks();
		 }catch(IllegalArgumentException e) {
			 System.out.println(e.getMessage());
		 }
 	}

}
