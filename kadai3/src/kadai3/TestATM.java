
package kadai3;

public class TestATM {

	private MyAccount m_myAcc;// 口座クラス

	public TestATM(MyAccount ma) {// ここでm_myAccを初期化
		this.m_myAcc = ma;
	}

	public void deposit(int cash_deposit) {// 入金
		if (cash_deposit > 300000) {
			System.out.println("金額が大きすぎます。");
		} else {
			m_myAcc.setBalance(m_myAcc.getBalance() + cash_deposit);
		}
	}

	public void withdraw(int cash_want) {

		if (cash_want > m_myAcc.getBalance()) {
			System.out.println("Can’t withdraw: " + m_myAcc.getBalance() + " JPY");
			System.out.println("Your current balance is: " + m_myAcc.getBalance() + " JPY");

		} else if (cash_want < m_myAcc.getBalance()) {
			m_myAcc.setBalance(m_myAcc.getBalance() - cash_want);

		}

	}

	public void showCurrentBalance() {
		System.out.println("Current Balance： " + m_myAcc.getBalance() + " JPY");

	}

}
