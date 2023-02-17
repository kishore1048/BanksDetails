package org.bank;

public class AxisBank extends BankInfo{
@Override
public void saving() {
System.out.println("Savings");
}
@Override
	public void fixed() {
	System.out.println("Fixed");
}
@Override
	public void deposit() {
System.out.println("Deposit");

}
public static void main(String[] args) {
	AxisBank n = new AxisBank();
	n.saving();
	n.fixed();
	n.deposit();
}
}
