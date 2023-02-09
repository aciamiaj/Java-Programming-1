
public class NonFictionBook extends Book {
	
	@Override
	public double setPrice() {
		return price = 37.99;
	}
	
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setTitle(String title) {
		super.setTitle(title);
	}

	@Override
	public String getTitle() {
		return super.getTitle();
	}

	public NonFictionBook(String title, double price) {
		super(title);
		this.setPrice();
		}

	@Override
	public String toString() {
		String res = "NonFiction";
		res +=  ", " + super.toString();
		return res;
	}
}
