package sdmcet.cse.oop;

import java.util.Scanner;

class Stack{
	private int arr[]=new int[10];
	private int top;

  Stack()
  {
	   top=-1;
	   
  }
  void push(int ele) {
	  if (top==9)
		  System.out.println("stack overflow");
	  else
		  arr[++top]=ele;
  }
	  int pop() {
		  int ele;
		  if(top==-1) {
			  System.out.println("stack underflow");
		       return -1;
		  }
		  else
			   ele=arr[top--];
		        return ele;
	  
  }
	  void display() {
		  System.out.println("elemnts of stack are");
		   if(top==-1)
			   System.out.println("stack underflow");
		   else {
			   for(int  i=0;i<=top;i++)
				   System.out.println(arr[i]);
		   }
	  }
}
public class StackDemo {

	public static void main(String[] args) {
		Stack st1=new Stack();
		st1.push(10);
		st1.push(30);
		st1.push(36);
		st1.display();
		System.out.println("removed elemnt is :"+st1.pop());
		System.out.println("elemt of the stack are:");
		st1.display();
		 
		 }
	 }
	

