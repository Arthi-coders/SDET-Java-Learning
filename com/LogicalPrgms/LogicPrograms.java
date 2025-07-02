package com.LogicalPrgms;

public class LogicPrograms {
	public void checkEvenOdd(int n) {
		System.out.print(n);
		for(int i=0;i<=0;i++) {
			if(i%2==0) {
				System.out.print(" is Even Number");
			}
		}
	}
	
public void isPrime(int n) {
	System.out.println();
	boolean isprime = true; //we are creating a data type that prime no is true
	if(n<=1) { //if condition is 0 or 1 then is prime is false
		isprime = false;
	}
		for(int i=2;i<=n/2;i++) // i is assign a value 2 and no which are divide by 2 is not prime no
			if(n%i==0) { // 5/2 we are not divide by 2 then it is prime suppose 6/2 then it is non prime
				isprime=false; //if condition is false then break the loop
				break;
			}

if(isprime) {
	System.out.println( n + " is a Prime number");
	}else {
		System.out.println( n + " is not a Prime number");
	}
}

public void getFactorial(int n) {
	int fact = 1;
	for(int i=1;i<=n;i++) {
		fact *=i; //fact=fact*i;
	}
		System.out.println(fact + " is a factorial Number");
	}
public void isPalindrome(String str) {
	String reversed = ""; // we are creating a dummy data
	for(int i = str.length()-1;i>=0;i--) {
		reversed += str.charAt(i);
	}
if(str.equals(reversed)) { // we are using equals() method to find whether actual content match the string
	//Megha.equals(ahgeM)
	//== compares memory reference (whether both are the exact same object)
    //equals() compares actual content of the string (character by character)
	System.out.println(str + " is a palidrom");
	}else {
		System.out.println(str + " is a palidrom");
	}
}
public void swapNumbers(int a, int b) {
    System.out.println("Before Swap: a = " + a + ", b = " + b);
    a = a + b;
    b = a - b;
    a = a - b;
  //a = 242+243=485; b = 485-243=242; a = 485-242=243
    System.out.println("After Swap: a = " + a + ", b = " + b);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LogicPrograms Logical =  new LogicPrograms();
Logical.checkEvenOdd(10);
Logical.isPrime(5);
Logical.getFactorial(4);
Logical.isPalindrome("Megha");
Logical.swapNumbers(242, 243);

	}
}
