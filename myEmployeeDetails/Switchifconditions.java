package myEmployeeDetails;

import java.util.Scanner;

public class Switchifconditions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks:");
		int marks = sc.nextInt();
		
		if(marks>=90) {
			System.out.println("Print A");
		}
		else if(marks>=75){
			System.out.println("Print B");
		}
		else if(marks>=	60){
			System.out.println("Print C");
		}
		System.out.println("choose the test type:");
		System.out.println("1 - Manual Testing");
		System.out.println("1 - Automation Testing");
		System.out.println("1 - API Testing");
		
		System.out.println("Enter the Test Type whether 1/2/3:");
		int Testingtype = sc.nextInt();
		switch(Testingtype) {
		case 1:
			System.out.println("Manual Testing");
			break;
		case 2:
			System.out.println("Automation Testing");
			break;
		case 3:
			System.out.println("API Testing");
			break;
			default:
				System.out.println("Invalid choice");
		}
			sc.close();
		
		
		
		}
	}


