package com.mahesh.automation.corejava;

abstract interface BankAtm
{
         String bankName = "AXIS BANK";
         void pinChange();
         void miniStmt();
         double cashWithDraw();
         double cashDeposit(); 
         public abstract void setPin();
}
 abstract class BankAtmImpl implements BankAtm {

	@Override
	public void pinChange() {
		System.out.println("PC");	
	}

	@Override
	public void miniStmt() {
		System.out.println("MS");	
	}

	@Override
	public double cashWithDraw() {
		System.out.println("CWD");
		return 456456;
	}

	@Override
	public double cashDeposit() {
		System.out.println("CD");
		return 9456456;
	}

	public void Loans() {
		System.out.println("Loans");	
	}
 }	
 class BankAtmImplOne extends BankAtmImpl {
	
	@Override
	public void setPin() {
		System.out.println("SP");	
	}
	public void carLoan() {
		System.out.println("CAR LOAN");
		}
	}
 

public class InterfaceTest {
public static void main(String[] args) {
	
	BankAtmImplOne atm = new BankAtmImplOne();

	//BankAtm bankAtm = new BankAtmImplOne ();(want to access only interface specific)
  // (interfacename varname = new calssname();)    
	atm.carLoan();
    atm.cashDeposit();
    atm.cashWithDraw();
     atm.Loans();
     atm.miniStmt();
     atm.pinChange();
     atm.setPin();
	
	//bankAtm.
	//bankAtm.cashDeposit();
	//bankAtm.cashWithDraw();
	//bankAtm.miniStmt();
	
  String bankNameResp =  BankAtm.bankName;
    // System.out.println("Bank name is:" +bankNameResp);
    	 
}
}