package kadai3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class ExamTestATM {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testDeposit() {
		MyAccount ma = new MyAccount();
		ma.setBalance(0);
		TestATM ta = new TestATM(ma);
		
		int expected = 100;
		//計算
		ta.deposit(100);
		int actual = ma.getBalance();
		assertThat(actual, is(expected));
	}

}
