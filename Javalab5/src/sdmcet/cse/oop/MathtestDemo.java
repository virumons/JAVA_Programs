package sdmcet.cse.oop;

import sdmcet.cse.oop.advanced.Advanced;
import sdmcet.cse.oop.basicMath.Basic;

public class MathtestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Basic b=new Basic();
             Advanced a=new Advanced();
             int[][]i= {{4,5,6},{6,8,2},{3,7,4}};
             
             b.checkPrime(7);
             b.generateFibonacci(5);
             b.sumOfDigits(348);
             a.addmatrices();
             a.diagonalSum(i);
             a.transpose(i);
             a.trigonometry(30);
             System.out.println("-----------");
             
            
	}
}
