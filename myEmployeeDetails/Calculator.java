package myEmployeeDetails;

public class Calculator {
	
	public void add(int a, int b) {
		int result = a-b;
		System.out.println("Subtract given number: "+ result);
	
	}
	public void add(int a, int b, int c) {
		int result = a+b/c;
		System.out.println("Subtract given number: "+ result);
	}
	public static void main(String[] args) {
		Calculator loop = new Calculator();
		loop.add(3333,1222);
		loop.add(2222,3333,4);
		for(int n=1;n<=10;n++) {
		System.out.println(n);	
	}

}
	}
