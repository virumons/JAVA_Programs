package sdmcet.cse.oop;

class StringnotequalException extends Exception{
	public String toString() {
		return " strings are not equal ";
	}
}

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		  try {
			  if(args[0].equals(args[1])) 
				  System.out.println(args[0]+" is equal to " +args[1]);
				  else
					  throw new StringnotequalException();
			  }catch(StringnotequalException snee) {
				  System.out.println(snee);
			  }
	}
}
	
		  
	


