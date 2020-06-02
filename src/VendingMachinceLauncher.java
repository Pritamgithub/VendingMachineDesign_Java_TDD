import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendingMachinceLauncher {

	public static void main(String[] args) {

		List<Vending> vendingList = new ArrayList<>();
		vendingList.add(new Vending("Banana", 200, 10));
		vendingList.add(new Vending("Apple", 100, 2));
		vendingList.add(new Vending("Strawberry", 300, 5));

		System.out.println(vendingList);
		
		Collections.sort(vendingList);
		System.out.println(vendingList);
		for(Vending v:vendingList)
		{
			System.out.println(v);
		}
		
		
	}

}
