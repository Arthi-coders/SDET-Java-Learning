package myEmployeeDetails;

public class GradeChecker {
	String Testing = "Do Test in API Testing";// Input which is given in datatype should be same as case statement

	public void Test() {
		switch(Testing){
		case "Do Test in Manual Testing":
			System.out.println("Manual Testing");
			break;
		case "Do Test in Automation Testing":
			System.out.println("Automation Testing");
			break;
		case "Do Test in API Testing":
			System.out.println("API Testing");
			break;
		default:
			System.out.println("Invalid choice");
			
	}
	}
	public static void main(String[] args) {
		GradeChecker DoTest = new GradeChecker();
         DoTest.Test();
	}
}