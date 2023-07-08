package sdmcet.cse.oop;


public class ExceptionGenratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              
		try {
			 if(args.length==0) {
				  generateArithmeticException();
			 }else if(args.length==1) {
				 generateArrayIndexOutOfBoundsException();
			 }else if(args.length==2) {
				 generateNullPointerException();
			 }else if(args.length==3) {
				 generateNegativeArraySizeException();
			 }else {
				 displayAllArguments(args);
			 }
		}catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException|NegativeArraySizeException e) {
			e.printStackTrace();
		}
	} public static void generateArithmeticException() {
		int result=10/0;
	}
          public static void generateArrayIndexOutOfBoundsException()
          {
        	   int[] array=new int[1];
        	   int value=array[1];//index out of bounds
          }
          public static void generateNullPointerException() {
        	  String str=null;
        	  int length=str.length();//null reference
          }
          public static void generateNegativeArraySizeException()
          {
        	  int[] array=new int[-1];//negative array size
        	  
          }
          public static void displayAllArguments(String[] args) {
              for(String arg: args) {
            	  System.out.println(arg) ;
            		  
            	  
              }
          }
}
