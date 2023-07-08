package sdmcet.cse.oop;

class Prime{
	synchronized void prime(int a,int b) {
		for(int n=a;n<=b;n++) {
			int i;
			for(i=2;i<=n/2;i++) {
				if (n % i==0)
					break;
			}
			if(i>n/2)
				System.out.print(n + " ");
		}
		System.out.println();
	}
}

class PrimeThread implements Runnable{
	Thread t;
	Prime p;
	int a,b;
	
	PrimeThread(Prime p1,int a,int b){
		t=new Thread(this);
		p=p1;
		this.a=a;
		this.b=b;
		t.start();
	}
	
	@Override
	public void run() {
		p.prime(a, b);
	}
}
public class PrimeNumberThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Thread t=Thread.currentThread();
            Prime p=new Prime();
            
            PrimeThread p1=new PrimeThread(p,1,100);
            PrimeThread p2=new PrimeThread(p,101,200);
            PrimeThread p3=new PrimeThread(p,201,300);
            
            try {
            	p1.t.join();
            	p2.t.join();
            	p3.t.join();
            }catch (InterruptedException e) {
            	e.printStackTrace();
            }
	}

}
