
public class FictionBook extends Book {
	
	@Override
	public double setPrice() {
		return this.price = 24.99;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public FictionBook(String title, double price) {
		super(title);
		this.setPrice();
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	@Override
	public String toString() {
		String res = "Fiction";
		res +=  ", " + super.toString();
		return res;
	}



}
