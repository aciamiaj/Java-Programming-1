package Assignment;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	   //Creates an object of class BillOfSale
	    	
		BillOfSale b1 = new BillOfSale(); 
		
		// Declaration of variables
		String student, store, name, phone, email;
		double unitPrice1, unitPrice2, unitPrice3, p1total, p2total, p3total, subtotal, HST, netTotal;
		long itemCode1, itemCode2, itemCode3;
		int qty1, qty2, qty3;
		
		
		student = "Jaimaica Daisy Eugenio";
		
		store = "Humber Campus Store";
				
		System.out.printf("Developed and Created by: %s\n\n", student);
		
		//Creates Scanner class
		Scanner kbd = new Scanner(System.in);
		
		//Input customer's information   
		System.out.printf("Enter your name: ");
	    name = kbd.nextLine();
	    System.out.printf("Enter your phone number: ");
	    phone = kbd.nextLine();
	    System.out.printf("Enter your email address: ");
	    email = kbd.nextLine();
	    
	    //Input Item 1 information  
	    System.out.printf("Enter item code #1: ");
	    itemCode1 = kbd.nextLong();
	    System.out.printf("Enter the quantity for item code #1: ");
	    qty1 = kbd.nextInt();  
	    System.out.printf("Enter the unit price for item code #1: ");
	    unitPrice1 = kbd.nextDouble();
	  
	    //Input Item 2 information  
	    System.out.printf("Enter item code #2: ");
	    itemCode2 = kbd.nextLong();
	    System.out.printf("Enter the quantity for item code #2: ");
	    qty2 = kbd.nextInt();    
	    System.out.printf("Enter the unit price for item code #2: ");
	    unitPrice2 = kbd.nextDouble();
	   
	    //Input Item 3 information  
	    System.out.printf("Enter item code #3: ");
	    itemCode3 = kbd.nextLong();
	    System.out.printf("Enter the quantity for item code #3: ");
	    qty3 = kbd.nextInt();
	    System.out.printf("Enter the unit price for item code #3: ");
	    unitPrice3 = kbd.nextDouble();
	    
	    
	    //Compute formula of unit price for each item and sub total
	    p1total = qty1 * unitPrice1;
		p2total = qty2 * unitPrice2;
		p3total = qty3 * unitPrice3;
		subtotal = p1total + p2total + p3total;
			
		//Format the date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		 
	    
		System.out.println("\n\n");
		
		
		//Output of the program
	    System.out.println(store);
	    System.out.println(dtf.format(now));     
	    System.out.printf("Customer name: %s\n", name);
	    System.out.printf("Phone: %s\n", phone);
	    System.out.printf("Email: %s\n", email);
	    System.out.printf("Item 1: Code %5s %3d item(s) $%3.2f ea $%3.2f\n", itemCode1, qty1, unitPrice1, p1total);
	    System.out.printf("Item 2: Code %5s %3d item(s) $%3.2f ea $%3.2f\n", itemCode2, qty2, unitPrice2, p2total);
	    System.out.printf("Item 3: Code %5s %3d item(s) $%3.2f ea $%3.2f\n", itemCode3, qty3, unitPrice3, p3total);
	    System.out.printf("Subtotal: $%.2f\n", subtotal);
	    b1.setTax(subtotal);
	    System.out.printf("HST: $%.2f\n", b1.getTax());
	    System.out.printf("Net Total: $%.2f\n", subtotal + b1.getTax());
	    

		kbd.close(); 
		System.exit(0);
	    
	}
}
