
package kadai3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount acc  = new MyAccount();
		
		acc.setAccNum(14);
		acc.setPass(18914);
		acc.setBalance(18914*10);
		
		System.out.println("Account Number: "+acc.getAccNum());
		System.out.println("Password: "+acc.getPass());
		System.out.println("Balance: "+acc.getBalance()+" JPY");
	
		
		
		TestATM atm = new TestATM(acc);
		
		int deposit = 2500;//入金額
		System.out.println("Start deposit: " +deposit + " JPY");
		 atm.deposit(deposit);
		 atm.showCurrentBalance();
		  	 
		int withdraw = 1100;
		System.out.println("Start withdraw: " +withdraw + " JPY");
		atm.withdraw(withdraw);
		atm.showCurrentBalance();
		
		withdraw = 1000000000;
		System.out.println("Start withdraw: " + withdraw + " JPY");
		atm.withdraw(withdraw);
		atm.showCurrentBalance();
		
		
	}

}
