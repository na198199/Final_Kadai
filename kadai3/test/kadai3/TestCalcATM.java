package kadai3;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


public class TestCalcATM {

	
	@Test
	public void testDeposit() {
		MyAccount ma = new MyAccount();
		ma.setBalance(0);
		CalcATM ta = new CalcATM(ma);
		
		int expected = 1000;
		//計算
		ta.deposit(1000);
		int actual = ma.getBalance();
		assertThat(actual, is(expected));
	}

	@Test
	public void testWithdraw() {
		
		MyAccount ma = new MyAccount();
		ma.setBalance(100000);
		CalcATM ta = new CalcATM(ma);
		
		int expected = 90000;//答え
		//計算
		ta.withdraw(10000,false);
		int actual = ma.getBalance();//実際の答え
		assertThat(actual, is(expected));

	}
	
	@Test
	public void testWithdraw2() {
		
		MyAccount ma = new MyAccount();
		ma.setBalance(100000);
		CalcATM ta = new CalcATM(ma);
		
		int expected = 100000;//答え
		//計算
		ta.withdraw(500,false);
		int actual = ma.getBalance();//実際の答え
		assertThat(actual, is(expected));

	}

}
