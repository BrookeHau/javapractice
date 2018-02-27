package javapractice;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class VendingItemTest {

	@Test
	public void items() {
		VendingItem item = new VendingItem(5.50, "Chips");
		String check = item.getName();
		assertThat(check, is("Chips"));
		
		double priceCheck = item.getPrice();
		assertThat(priceCheck, is(5.50));
	}

}
