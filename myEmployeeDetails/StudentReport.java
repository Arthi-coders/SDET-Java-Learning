package myEmployeeDetails;

public class StudentReport {
	
	//Get a Total Mark of Each student
	public int getTotal(int[] marks) {
		int total = 0;
		for(int mark : marks) {
			total = total + mark;
		}
		return total;
		}
	//Get a Average of Each student
	public double getAverage(int[] marks) {
		int total = getTotal(marks); //90+80+70 = 240
		return (double) total/marks.length; //(double) 250 / 3 = 83.33, before doing math we are telling java to give o/p in decimal
	}
	//Get a Grade of Each student
	public String getGrade(double average) {
		if(average>=90) {
			return "A";
		}else if(average>=75){
			return "B";
		}else if(average>=60){
			return "C";
		}else return "Fail";
	}
	//Get a Print a Report of Students
	public void printReport(String StudentName, int[] marks) {
		int totalmark = getTotal(marks);
		double averagemark = getAverage(marks);
		String Grade = getGrade(averagemark);
		System.out.println("Student_Name : " +StudentName);
		System.out.print("Student_Marks : ");
		for(int mark : marks) { // Help to print a marks by index positions
			System.out.print(mark + " ");
		}
		System.out.println("| Total Mark of Student : " + totalmark);
		System.out.printf("Average: %.2f\n", averagemark);
		System.out.println("Grade of Student :" +Grade);
		System.out.println("***************************************");
		
	}
	
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   StudentReport student = new StudentReport();
	String StudentName1 = "Megha";
	int marks1[] = {100, 100, 100};
	student.printReport(StudentName1, marks1);
	
	String StudentName2 = "Vasanth";
	int marks2[] = {90, 80, 75};
	student.printReport(StudentName2, marks2);
	
	String StudentName3 = "Arthi";
	int marks3[] = {55, 60, 75};
	student.printReport(StudentName3, marks3);
	
	
	
	}
}