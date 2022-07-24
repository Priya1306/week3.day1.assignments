package assignment3;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit in Axis bank");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.fixed();
		a.saving();
		a.deposit();
		BankInfo b=new BankInfo();
		b.deposit();
	}
}
