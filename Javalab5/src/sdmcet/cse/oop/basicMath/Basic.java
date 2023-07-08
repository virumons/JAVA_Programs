package sdmcet.cse.oop.basicMath;

public class Basic {
 public void checkPrime(int n) {
	 int i;
	 for(i=3;i<=n/2 ;i++) {
		 if(n % i == 0)
	       break;
	
}
if (i>n/2)
	System.out.println("not prime");
 }
public void generateFibonacci(int n) {
	int fib1=0,fib2=1,fib3;
	System.out.println(fib1);
	System.out.println(fib2);
	
	for(int i=2;i<n;i++) {
		fib3=fib1+fib2;
		System.out.println(fib3);
		fib1=fib2;
		fib2=fib3;		
	}
}
public void sumOfDigits(int n) {
	int digit,sum=0;
	
	while(n!=0) {
		digit =n%10;
		sum+=digit;
		n/=10;
	}
	System.out.println("Sum of digits =" +sum);
}
}
