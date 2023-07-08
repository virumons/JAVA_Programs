package sdmcet.cse.oop.advanced;

public class Advanced {
	public void addmatrices() {
		int a[][]= {{2,3,4},{1,2,3},{1,0,1}};
		int b[][]= {{1,0,0},{1,2,1},{1,0,0}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
				System.out.print(a[i][j]+b[i][j]+" ");
			System.out.println();
		}
		
	}
	
	public void trigonometry(double n) {
		System.out.println("sin"+n+"="+Math.sin(n));
		System.out.println("cos"+n+"="+Math.cos(n));
		System.out.println("tan"+n+"="+Math.tan(n));
	}
  
	public void transpose(int a[][]) {
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<3;j++)
				 System.out.print(a[j][i]+" ");
			 System.out.println();
		 }
	}
	
	public void diagonalSum(int a[][]) {
		int sum=0,i=0,j=2;
		
		while(i!=3 && j!=1)
			sum+=a[i++][j--];
		System.out.println("sum of seconary diagonal ="+sum);
		
		sum=0;
		for(i=0;i<3;i++)
			sum+=a[i][i];
		System.out.println("sum of principle diagonal= "+sum);
	}
}
