package week3.day1;

public class Ass4AxisBank extends Ass3BankInfo {

	public void deposit() { 
		int depositAmount=20000;
		System.out.println("User A deposited " +depositAmount); 
	}

	public static void main(String[] args) {

		Ass4AxisBank bank = new Ass4AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
	}

}
