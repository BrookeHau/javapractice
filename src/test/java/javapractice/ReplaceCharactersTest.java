package javapractice;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ReplaceCharactersTest {

//replace certain characters from string

	@Test
	public void replaceChar() {
		ReplaceChar rc = new ReplaceChar("Hello");
		String check = rc.replace("e", "a");
		assertThat(check, is("Hallo"));
	}
	
	@Test 
	public void replace2() {
		ReplaceChar rc = new ReplaceChar("Brooke Hauser");
		String check = rc.replace("e", "a");
		assertThat(check, is("Brooka Hausar"));
	}
	
	@Test
	public void replaceAtIndex() {
		ReplaceChar rc = new ReplaceChar("Hello");
		String check = rc.replaceIndex(1, "a");
		assertThat(check, is("Hallo"));
	}
}
