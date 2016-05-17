package kadai5;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void translateEngTest() {
		IntToEng ite = new IntToEng();
		String expected = "ninehundred";
		String actual = ite.translateEng(900);
		assertThat(actual, is(expected));
	}

}
