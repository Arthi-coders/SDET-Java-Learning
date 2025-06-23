package myEmployeeDetails;

public class EmployeeDB {
	Integer EmployeeID = 123;
	String EmployeeName = "Megha";
	String EmployeeDomain = "QA";
	
	public void getEmployeeDetails() {
		System.out.println("Employee Details given");
	}
	

	public static void main(String[] args) {
		EmployeeDB details = new EmployeeDB();
		Integer datas = details.EmployeeID;
		System.out.println(datas);

	}

}
