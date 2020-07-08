
package kadai3;

public class CalcATM {

	private MyAccount m_myAcc;// 口座クラス

	public CalcATM(MyAccount ma) {// ここでm_myAccを初期化
		this.m_myAcc = ma;
	}

	public void deposit(int cash_deposit) {// 入金
		
		if(kozeni(cash_deposit) == true) {
		
		if (cash_deposit > 300000) {
			System.out.println("金額が大きすぎます。");
		} else {
			m_myAcc.setBalance(m_myAcc.getBalance() + cash_deposit);
		}
		}
		
	}
	
	public boolean kozeni(int cash) {
		if(cash%1000 != 0 ) {
			
			System.out.println("小銭は受け付けません");
			return false;		
		}
		else {
			return true;
		}
		
	}

	public void withdraw(int cash_want, boolean bill) {
		if(kozeni(cash_want)==true) {

		if (cash_want > m_myAcc.getBalance()) {
			System.out.println("Can’t withdraw: " + m_myAcc.getBalance() + " JPY");
			System.out.println("Your current balance is: " + m_myAcc.getBalance() + " JPY");

		} else if (cash_want < m_myAcc.getBalance()) {
			if(cash_want>=10000) {
				int th;
				int tenth;
				if(bill==true) {
					tenth=cash_want/10000;
					th=cash_want%10000/1000;
					System.out.println("万円札で出金");
					System.out.println("一万円札:"+tenth+"枚と千円札"+th+"枚");
				}else {
					th=cash_want/1000;
					System.out.println("千円札で出金");
					System.out.println("千円札"+th+"枚");
				}
				m_myAcc.setBalance(m_myAcc.getBalance() - cash_want);
			}else {
				m_myAcc.setBalance(m_myAcc.getBalance() - cash_want);
			}
		}
		}

	}
	

	public void showCurrentBalance() {
		System.out.println("Current Balance： " + m_myAcc.getBalance() + " JPY");

	}

}
