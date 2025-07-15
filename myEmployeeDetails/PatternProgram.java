package myEmployeeDetails;

public class PatternProgram {

	public void startraingle(int rows) {
		System.out.println("Print Star Traingle: ");
		for(int i=1; i<=rows; i++) { //outer loop
		   for(int j=1; j<=i; j++) { //inner loop
			   System.out.print("* ");
		   }
		   System.out.println();
		}
	}
	public void Numbertraingle(int rows) {
		System.out.println("Print Number Traingle: ");
		for(int i=1; i<=rows; i++) { //outer loop
		   for(int j=1; j<=i; j++) { //inner loop
			   System.out.print(j + " ");
			   //System.out.print(1 * j);
		   }
		   System.out.println();
		}
	}
	public void MultiplicationTable(int rows) {
		System.out.println("Print Multiplication Table: ");
		for(int i=1; i<=10; i++) {
			System.out.println("5 x " + i + " = " +(5 * i));
		}
		System.out.println();
	}
	public void FullTriangle(int rows) {
		System.out.println("Print FullTriangle: ");
		for(int i=1; i<=rows; i++) {
			for(int k=i; k<rows; k++) { // this help to give spaces
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");	
			}
		System.out.println();
	}
	}
	public void ReverseTriangle(int rows) {
		System.out.println("Print ReverseTriangle: ");
		for(int i=rows; i>=1; i--) { //outer loop increases
			for(int j=1; j<=i; j++) { //inner loop decreases
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		PatternProgram patternit = new PatternProgram();
		patternit.startraingle(7);
		patternit.Numbertraingle(7);
		patternit.MultiplicationTable(7);
		patternit.FullTriangle(7);
		patternit.ReverseTriangle(7);
	}

}
