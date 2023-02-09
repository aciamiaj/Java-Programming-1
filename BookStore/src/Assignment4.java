import java.util.Scanner;

public class Assignment4 {
	
	Scanner kbd = new Scanner(System.in); 
	
	Bill bill = new Bill();

	private final static int CAPACITY = 10;

	public static void main(String[] args) {
			
			Book fiction = new FictionBook(null, 0);
			Book nonfiction = new NonFictionBook(null, 0);
			Book[] books = new Book[CAPACITY];
		    
		    Scanner kbd = new Scanner(System.in);
			System.out.print("Enter customer name: ");
			String custName = kbd.nextLine();		
			Bill bill = new Bill(custName);
			do {
				System.out.println("-------------Menu--------------");
				System.out.println("1. Purchase a Book");
				System.out.println("2. Display Bill");
				System.out.println("3. Exit");
				System.out.print("Enter your choice: ");
				int choice = kbd.nextInt();
				kbd.nextLine();
				books = bill.getBook();
				
			if (choice==1) {
				for (int i=0; i<CAPACITY; i++) {
					System.out.print("Enter name of the book: ");
					String bName = kbd.nextLine();
					System.out.print("Enter category of the book (Fiction or NonFiction) : ");
					String bCat = kbd.nextLine();
					kbd.nextLine();
					if (bCat.equalsIgnoreCase("Fiction")) {
						fiction =  new FictionBook(bCat, fiction.setPrice());
						bill.addBook(fiction);
						bill.setBook(books);
					}
					else if (bCat.equalsIgnoreCase("NonFiction")) {
						nonfiction =  new NonFictionBook(bCat, nonfiction.setPrice());
						bill.addBook(nonfiction);
						bill.setBook(books);
					}
					else 
						System.out.println("Invalid category!");
					fiction.setTitle(bName);
					nonfiction.setTitle(bName);
					System.out.println(books[i]);
					bill.printBill(bill); 
				}
			} 
						
			else if (choice==2) {
				for (int j=0; j<CAPACITY; j++) {
					System.out.println(books[j]);
					bill.printBill(bill);
				}
			}
			else if (choice==3) {
				System.exit(0);
			}
				
			else 
				System.out.println("Invalid choice!");	
			
		} while(true);	
	}
}

	



