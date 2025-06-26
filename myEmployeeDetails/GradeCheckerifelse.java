package myEmployeeDetails;

import java.util.Scanner;

public class GradeCheckerifelse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks :");
		int marks = sc.nextInt();
		
		if(marks>=90) {
		System.out.println("Print A");
		}
		
		else if(marks>=75) {
			System.out.println("Print B");
		}
		
		else if(marks>=60) {
				System.out.println("Print C");
			}
		
		else{
					System.out.println("Print Fail");
			}
		sc.close();
	}
			
}




