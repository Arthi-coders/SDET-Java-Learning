package myEmployeeDetails;

public class StudentOperations {
 
	public void printGrade(int marks, int studentNumber) {
		System.out.print("Student " + studentNumber + ": ");
		if(marks>=90) {
			System.out.println("Grade A");
		}
		else if(marks>=75) {
			System.out.println("Grade B");
		}
		else if(marks>=60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}
	public int sum(int[] marks) {
		int total=0;
		for(int i=0;i<marks.length;i++) {
			total=total+marks[i];
		}
		return total;
	}
	public static void main(String[] args) {
		StudentOperations so = new StudentOperations();
		int[] studentmarks = {85, 90, 72, 60};
		int total=so.sum(studentmarks);
		System.out.println("Student marks: " +total);
		
		for(int i=0;i<studentmarks.length;i++) {
			so.printGrade(studentmarks[i], i+1);
		}
	}
	

}
