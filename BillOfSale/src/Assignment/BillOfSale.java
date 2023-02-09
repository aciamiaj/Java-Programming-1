package Assignment;

public class BillOfSale {
	
	//Declare instance variables for attributes
				
	public static final double TAX = 0.13; 
	private double subTotal ;
	
	
	//Method to get the tax charges
	public double getnetPay() {
		return (subTotal * TAX);
	}
	
	//Method to set the charges
	
	public void setTax (double newTax) {
		subTotal = newTax;
	}
		
}
		


