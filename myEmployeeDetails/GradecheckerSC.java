package myEmployeeDetails;

import java.util.Scanner;

public class GradecheckerSC {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Test whether mannual/Automation/API: ");
		String Testing = sc.nextLine();
		switch(Testing) {
		case "Do Manual Testing":
			System.out.println("Manual Testing");
			break;
		case "Do Automation Testing":
			System.out.println("Automation Testing");
			break;
		case "Do API Testing":
			System.out.println("API Testing");
			break;
			default:
				System.out.println("Invalid choice");
			sc.close();
			
			
		}

	}

}
