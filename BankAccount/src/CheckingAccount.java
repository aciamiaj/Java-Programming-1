

public class CheckingAccount extends BankAccount { //Bank Account inherited in Checking Account //BankAccount is the super class
	//1. Constructors/privates are NOT inherited
	//2. Subclass constructors invokes the super class constructor. This could be implicit or explicit using the "super" statement
	//   as the first statement in the sub class constructor.
	//	 implicit is not writing any statement
	//	 explicit is writing the "super" 
	
	public CheckingAccount() { //subclass, To call parent class constructor we write the word super
		//implicit call to super class constructor
		super.accountNumber = "C" + super.accountNumber;
		
	}
	
	public CheckingAccount(String name) {
		super();  //explicit call to super class constructor  //needs parameter Java provides default constructor if no constructor is given
		super.accountNumber = "C" + super.accountNumber; //Accessing protected member
	}
	
	//Overriding toString method = method name from super class remains the same. redefining super class method to a sub class
	public String toString() {
		String result = "Account # : " + super.getAccountNumber();
		//result += ", " + super.toString(); 
		result += super.toString(); //calling super class method, use keyword super
		return result;
	}
}
