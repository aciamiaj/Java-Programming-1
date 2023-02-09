import week12.CheckingAccount;
import week12.SavingsAccount;

public class MainClass extends BankAccount {

	public static void main(String[] args) {
		CheckingAccount ck = new CheckingAccount();
		
		ck.getAccountHolderName();
		ck.getAccountBalance();
		ck.getAccountNumber();
		System.out.println(ck);
		//System.out.println(ck + "[" + ck.getAccountNumber() + "]");


		SavingsAccount sa = new SavingsAccount();
		
		sa.getAccountHolderName();
		sa.getAccountBalance();
		sa.getAccountNumber();
		System.out.println(sa);
}

}
