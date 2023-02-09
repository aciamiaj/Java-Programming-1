import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kbd = new Scanner(System.in);
		String choice;
		
		do {
		   AccountInterface.main(null);
		   System.out.print("Do you want to make another transaction? (y)"); 
		   choice = kbd.nextLine();
		 
		   if (!(choice.equalsIgnoreCase("y"))) {
			  break;
		     }
		   	
		  } while(true);
	}
}
	

	
	
	

