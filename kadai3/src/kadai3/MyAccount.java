
package kadai3;

public class MyAccount {
	private int m_accNum;
	private int m_password;
	private int m_balance;

	public MyAccount() {

	}

	public int getAccNum() {// 口座番号
		return this.m_accNum;
	}

	public void setAccNum(int accnum) {
		this.m_accNum = accnum;
	}

	public int getPass() {// 暗証番号
		return this.m_password;
	}

	public void setPass(int pass) {
		this.m_password = pass;
	}

	public int getBalance() {// 残高
		return this.m_balance;

	}

	public void setBalance(int balance) {
		this.m_balance = balance;
	}

}
