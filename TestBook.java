public class Book implements Comparable {
	
	double price;
	public Book(double price) {
		this.price = price;
	}
	
	public int compareTo(Object args) {
		Book b = (Book)args;
		if(price>b.price) return 1;
		if(price<b.price) return -1;
		return 0;
	}
	
	public String toString() {
		return "book[price = "+price+ "]";
	}


}
public class TestBook {

	public static void main(String[] args) {

		Book b1 = new Book(100);
		Book b2 = new Book(499);
		
		int res = b1.compareTo(b2);
		System.out.println(res);
	}

}
