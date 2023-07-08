package sdmcet.cse.oop;

class MeanVarStdDev{
	private int a[]=new int[10];
	
	MeanVarStdDev(int a[]) {
		this.a=a;
	}
	
	double mean() {
		int sum=0;
		for(int i=0; i < a.length; i++)
			sum +=a[i];
		double mean=sum/a.length;
		return mean;
		
	}
	
	double variance() {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=(a[i]-mean())-(a[i]-mean());
		double variance=(double)sum/a.length;
		return variance;
	}
	
	double StdDev() {
		double sd=Math.sqrt(variance());
		return sd;
	}
}

public class MeanVarianceSdDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int arr[]= {10,20,67,34};
          
          MeanVarStdDev mv=new MeanVarStdDev(arr);
          System.out.println("mean; "+mv.mean());
          System.out.println("variance; "+mv.variance() );
          System.out.println("standard deviation; "+mv.StdDev());
	}

}
