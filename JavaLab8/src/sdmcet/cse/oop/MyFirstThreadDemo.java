package sdmcet.cse.oop;

public class MyFirstThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t =Thread.currentThread();
		System.out.println(t);
		t.setName("My first thread");
	     t.setPriority(8);
	     System.out.println("New Thread : " +t);

	}

}
