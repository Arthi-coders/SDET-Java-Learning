package myEmployeeDetails;

public class EmployeeNoargConstructor {
	Integer EmpRollno;
	Long EmpSalary;
	String Domain;
	EmployeeNoargConstructor(){
		EmpRollno=201;
		EmpSalary=100000l;
		Domain="SDET";
	}
	public void getEmployeeNoargConstructor() {
		System.out.println("Practicing NoArugment Constructor");
	}
	public static void main(String[] args) {
		EmployeeNoargConstructor Noarg = new EmployeeNoargConstructor();
		String data=Noarg.Domain;
		System.out.println("Collect Datas: " + data);
		Noarg.getEmployeeNoargConstructor();
		}
	}
