package javapractice;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
	
	List<VendingItem> items = new ArrayList<>();

	public void add(VendingItem item) {
		items.add(item);
		
	}

}
