package sdmcet.cse.oop;

class NewThread implements Runnable {
	Thread t;

	NewThread(String title) {
		t = new Thread(this, title);
		System.out.println(t);
		t.start();

	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(t.getName()+" :" +i);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
	public class OneTwoThreeDemo {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Thread t=Thread.currentThread();
			
			NewThread nt1 = new NewThread("one");
			NewThread nt2 = new NewThread("two");
			NewThread nt3 = new NewThread("three");
			
			
			try {
				nt1.t.join();
				nt2.t.join();
				nt3.t.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(t);
		}
}