package myEmployeeDetails;

import java.util.Scanner;

public class Day10_OfferCalculator {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter userName: ");
		String User_Name = sc.nextLine();
		
		System.out.print("Enter userAge: ");
		int User_Age = sc.nextInt();
		
		System.out.print("Enter userGender(M/F): ");
		String User_Gender = sc.next();
		
		System.out.print("Enter userShopping Amount: ₹");
        double User_Amount = sc.nextDouble();

       System.out.println("\nHello " + User_Name + "!");

     
        if (User_Age >= 60) {
            System.out.println("Senior Citizen Offer Applied.");
        }
        else {
            System.out.println("No senior citizen offer.");
        }
 
   
        if (User_Amount > 1000) {
            double discount = User_Amount * 0.10;
            System.out.printf("You get a 10%% discount on ₹%.2f = ₹%.2f\n", User_Amount, discount);
        }
        else {
        	System.out.printf("No discount applied on ₹%.2f\n", User_Amount);
        }

    
        if (User_Gender.trim().equalsIgnoreCase("F")) {
            System.out.println("Hello Madam!, you get a 5% bonus gift! 🎁");
        }else if (User_Gender.trim().equalsIgnoreCase("M")){
            System.out.println("Hello Sir!, you get a 5% bonus gift! 🎁");
        }
        else {
            System.out.println("Invalid Gender");
        }

        sc.close();
    }
}

