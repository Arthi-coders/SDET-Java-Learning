package myEmployeeDetails;

import java.util.Scanner;

public class BillingSystem {
	
	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double subtotal = 0;
		String bill = "";
		 
		System.out.println("Welcome to Java Mart!");
		 System.out.print("Enter customer name: ");
		 String CustomerName = sc.nextLine();
		 
		 boolean moreItems = true;
		 
		 while (moreItems) {
		 System.out.println("Available Items:");
		    System.out.println("1. Pen - ₹10");
		    System.out.println("2. Notebook - ₹50");
		    System.out.println("3. Bag - ₹500");
		    System.out.println("4. Bottle - ₹150");
			
		   System.out.print("Enter item: ");
			int itemNumber = sc.nextInt();
		   
			String itemName = "";
		    int price = 0;
		   
		    switch(itemNumber) {
            case 1:
                itemName = "Pen";
                price = 10;
                break;
            case 2:
                itemName = "Notebook";
                price = 50;
                break;
            case 3:
                itemName = "Bag";
                price = 500;
                break;
            case 4:
                itemName = "Bottle";
                price = 150;
                break;
            default:
                System.out.println("Invalid item selected.");
                return;
        }

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        int itemtotal = price * quantity;
        subtotal = subtotal+itemtotal;
        
        bill += itemName + " x " + quantity + " = ₹" + itemtotal + "\n";
        
        System.out.print("Do you want to add another item? (yes/no): ");
        sc.nextLine(); // consume newline
        String response = sc.nextLine();
        if (!response.equalsIgnoreCase("yes")) {
            moreItems = false;
        }
    }
        double tax = (subtotal > 500) ? subtotal * 0.05 : 0;
        double discount = (subtotal > 1000) ? subtotal * 0.10 : 0;
        double finalTotal = subtotal + tax - discount;

        System.out.println("\n========== INVOICE ==========");
        System.out.println("Customer: " + CustomerName);
        System.out.println("\nItems:");
        System.out.print(bill);
        System.out.printf("\nSubtotal: ₹%.2f\n", subtotal);
        System.out.printf("Tax (5%%): ₹%.2f\n", tax);
        System.out.printf("Discount (10%%): ₹%.2f\n", discount);
        System.out.printf("Final Total: ₹%.2f\n", finalTotal);
        System.out.println("==============================");

        sc.close();
    }
}
	

	


