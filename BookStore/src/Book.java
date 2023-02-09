
public abstract class Book {

	protected String title;
	
	protected double price;
	
	public Book(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract double setPrice();

	public String toString() {
		return "Title: " + this.title + ", Price: $" + this.price ;
	}	
	
	public boolean equals(Object obj) {
	
		if(obj instanceof Book) {
			if (((Book) obj).getTitle().equalsIgnoreCase(this.title))
				return true;
		}
		return false;
	}
}
