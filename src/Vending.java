import lombok.Data;

@Data
public class Vending implements Comparable<Vending> {

	private String NameofProduct;

	private int price;

	private int quantity;

	public Vending(String nameofProduct, int price, int quantity) {
		super();
		NameofProduct = nameofProduct;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public int compareTo(Vending vend2) {

		if (this.price >= vend2.price) {
			return 1;
		} else
			return -1;

	}

}
