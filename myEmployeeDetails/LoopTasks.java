package myEmployeeDetails;

import java.util.Scanner;

public class LoopTasks {
	//Print 10 Numbers 
	public void printNumber() {				
		System.out.print("Print 1 to 10 Numbers: ");
		    for (int i = 1; i <= 10; i++) {
		        System.out.print(i);
		    if(i < 10) {
		    	 System.out.print(" , ");
		    }
			}
		
		 System.out.println(); 
	}
	//Even Number
		 public void EvenNumber(int a) {	
			System.out.print("Print Even Numbers: ");
			for (int i = 0; i <= 20; i+=2) {
				System.out.print(i);
				 if(i < 20) {
			    	 System.out.print(" , ");
			    }
		}
			System.out.println(); 
		 }

	//sum of five numbers
			public void SumOfNo(int b) {	
			System.out.print("Sum of first " + b + " numbers: ");
			int sum = 0;
			for(int i=1; i<=b; i++) {
				sum = sum+i;
				}
			System.out.print(sum);
			
			System.out.println();
			}

	//Reverse Number
			public void ReverseNumbers() {	
	    System.out.print("Reverse the Number: ");
			int num = 4321;
			int rev = 0;
	  while (num != 0) {
			    int temp = num % 10;
			    rev = rev * 10 + temp;
			    num = num / 10;
			}
	System.out.print(rev);
			
			System.out.println();
			}	
	//Factorial
			public void factorial(int m) {	
	System.out.print("Factorial of a number: ");
	int fact = 1;
	for(int i=1; i<=m; i++) {
		fact = fact*i;
		}
	System.out.print(fact);    
	
}
	
		public static void main(String[] args) {
			LoopTasks loop = new LoopTasks();
			loop.printNumber();
			loop.EvenNumber(20);
			loop.SumOfNo(5);
			loop.ReverseNumbers();
			loop.factorial(5);
		}
}