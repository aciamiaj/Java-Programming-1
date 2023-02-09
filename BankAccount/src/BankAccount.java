
public class BankAccount {
	
	private static int nextAccountNumber = 5001;
	protected String accountNumber; //child should be able to use it
	private double amount, balance;
	private String name;
	
	//Mutator methods
	public void setName(String newName) {
		name = newName;
	}
	
	public void setAmount(double newAmount) {
		amount = newAmount;
	}
	
	public void setAccountNumber(String newAccountNumber) {
		accountNumber = newAccountNumber;
	}
	
	//Constructor
	public BankAccount() {
		name = "TBA";
		accountNumber = nextAccountNumber+"";
		nextAccountNumber++;
		balance = 0;
	}
	
	//Accessor methods
	public String getName() {
		return name;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}

	//Method for deposit
    public void deposit(double amount) {
        if (amount>0) {
        	balance = balance + amount;  
            System.out.println("Amount deposited: " + "$" + amount);  
        }      
        else {
        	System.out.println("Amount should be greater than 0." + "\n");         	
        }        
    }
    
    //Method for withdrawal
    public void withdraw(double amount) {
       	if (amount <= 0 || amount > balance)
       		System.out.println("Withdrawal can't be completed.\n");
       	else {
       		balance = balance - amount;
        	System.out.println("Amount withdrawn: " + "$" + amount);
       	}   	
    }
    
    //Method for toString()
	public String toString() {
		String result = "\nAccount number: " + accountNumber + "\nAccount name: " + name + "\nAccount balance: " + "$" + balance +  "";
		return result;
		
	}
	
	//Method to compare name and account number
	public boolean equals(BankAccount b) {
		if (b.name == this.name)
			if (b.accountNumber == this.accountNumber)
				return true;
		return false;  
	}
	
}
