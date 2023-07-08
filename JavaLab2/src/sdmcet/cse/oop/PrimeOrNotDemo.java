package sdmcet.cse.oop;

import java.util.Scanner;

public class PrimeOrNotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc= new Scanner (System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int i;
		int flag=0;
		int m=0;
		m=a/2;
		
		for(i=2;i<m;i++) {
			if(a%i==0) {
				flag=1;
				break;
			}
		}
		
		if(flag == 1)
			System.out.println("number not prime");
		else
			System.out.println("number is prime");
	}

}
