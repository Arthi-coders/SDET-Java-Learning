package myEmployeeDetails;

public class StringOperations {

	public static void main(String[] args) {
		String name = "Arthi Gurumoorthi";
		System.out.println("Print number of Characters :" +name.length());
		System.out.println("Print in Uppercase :" +name.toUpperCase());
		System.out.println("Print Character Index value  :" +name.charAt(11));
		System.out.println("Print Character First three values :" +name.substring(2));
		System.out.println("Print Character First/End three values :" +name.substring(2, 10));
		System.out.println("Check whether the word contains in database :" +name.contains("moo"));
		System.out.println("Reverse String :");
		for(int i=name.length()-1;i>=0;i--) {
		System.out.print(name.charAt(i));
	}

}
}