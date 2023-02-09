import java.util.Scanner;

public class AccountInterface {
	
	public static void main(String[] args) {	
	
	System.out.println("\nDeveloped by Jaimaica Daisy Eugenio");
		
    Scanner kbd = new Scanner(System.in);
    BankAccount b = new BankAccount();
    String choice;
    double amount;
        
    do {
		System.out.println("\n(O)pen an account");
		System.out.println("(D)eposit");
		System.out.println("(W)ithdraw");
		System.out.println("(C)heck balance");
		System.out.println("(E)xit");
		System.out.print("Please select transaction: ");
		choice = kbd.nextLine();
				
	 if (choice.equalsIgnoreCase("o")) {
   		System.out.print("\nPlease enter your name: ");
   		String name = kbd.nextLine();
   		b.setName(name);
   		System.out.println("\nThank you for opening an account.\n");
   		System.out.println("Your account details:");
   		printBank(b);
	 }
	 
	 else if (choice.equalsIgnoreCase("d")) {
  		System.out.print("\nEnter amount: $");
  		amount = kbd.nextDouble();
  		b.deposit(amount); 
  		printBank(b);
	 }
	 
	 else if (choice.equalsIgnoreCase("w")) {
  		System.out.print("\nEnter amount: $");
  		amount = kbd.nextDouble();
  		b.withdraw(amount);
  		printBank(b);
	 }
	 
	 else if (choice.equalsIgnoreCase("c")) 
	    printBank(b);
	
	 else if (choice.equalsIgnoreCase("e")) {
   		System.out.println("\nThank you for banking with us!");
   		System.out.println("Goodbye!\n");
		break;
	 }
	 else
		 System.out.println("Invalid option!"); 
	 
	 kbd.nextLine();
	 
     } while(true);
    
    kbd.nextLine();
    
   }  
	
    public static void printBank(BankAccount bObject) {
	System.out.println(bObject.toString());
	
  }
    
}




