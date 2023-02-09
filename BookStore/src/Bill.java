
public class Bill {

	protected String custName;
	
	protected double billAmount;
	
	private final int CAPACITY = 10;
	
	Book[] books = new Book[CAPACITY];

	Book fiction = new FictionBook(custName, billAmount);
	
	FictionBook f = new FictionBook(fiction.getTitle(), fiction.getPrice());
	
	Book b;
		
	protected int count = 0;
		
	public Bill(String custName) {
		this.custName = custName;
	}
	
	public String getCustName() {
		return this.custName;
	}
	
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	public double getBillAmount() {
		return this.billAmount;
	}
	
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	
	public Book[] getBook() {
		return this.books;
	}
	
	public void setBook(Book[] books) {
		this.books = books;
	}
	
	public boolean addBook(Book b) {
		if (count==CAPACITY) 
			return false;
		books [count++] =  b;
		return true;	
	}
	
	public Bill() {
		Book fiction = new FictionBook(custName, billAmount);
		books = new Book[CAPACITY];
		for(int i=0; i<CAPACITY; i++)
		books[i] = new FictionBook(custName, billAmount);
		for(int j=0; j<CAPACITY; j++)
		books[j] = new NonFictionBook(custName, billAmount);
	}
		
	@Override
	public String toString() {
		String res = "Customer Name: " + this.custName + ", Book: " + fiction.title + ", Bill amount: " + this.getBillAmount();
		res += ", " + super.toString();
		return res;	
	}
	
	public static void printBill(Bill books) {
		System.out.println(books.toString());				
    }

	
}
