package atm_management;

public class ATM {
	
private String statement = "";

public double getBalance() {
	return balance;
}
	
	//instance variable
	private int pin;
	private double balance;
	
	//parameterized constructor
	public ATM(int pin, double balance) {
		this.pin = pin;
		this.balance = balance;
	}
	
	//Login method
	public boolean login(int enteredPin) {
		if(enteredPin == pin) {
			return true;
		}
		return false;
	}
	
	//checked balance method
	public void checkBalance() {
		System.out.println("Your Balance: Rs." + balance);
		
		System.out.println("------------------------");
	}
	
	//Deposit money
	public void depositMoney(double amount) {
		
		balance = balance + amount;
		
		System.out.println("Rs." + amount + " deposited successfully");
		System.out.println("Updated Balance : Rs." + balance);
		
		statement = statement + "Deposited : Rs." + amount + "\n";
		
		System.out.println("------------------------");
	}
	
	
	//Withdraw Method
	public void withdrawMoney(double amount) {
		
		if (amount <= balance) {
			
			balance = balance - amount;
			
			System.out.println("Rs." + amount +" withdraw successfully");
			System.out.println("Remaining Balance : Rs." + balance);
			
			statement = statement + "Withdraw : Rs." + amount + "\n";
		
		}else {
			System.out.println("Insufficient Balance!");
		}
		
		System.out.println("------------------------");
	}
	
	//Mini Statement method
	public void miniStatement() {
		
		System.out.println("----Mini Statement----");
		
		if (statement.isEmpty()) {
			
			System.out.println("No transaction available.");
			
		}else {
			System.out.println(statement);
		}
		
		System.out.println("--------------------------");
	}
	
	//Change Pin Method
	public void changePin(int oldPin, int newPin) {
		
		if(oldPin == pin) {
			
			pin = newPin;
			
			System.out.println("PIN changed successfully.");
			
		}else {
			System.out.println("Wrong current PIN!");
		}
		
		System.out.println("--------------------------");
	}
	
	public String getStatement() {
	    return statement;
	}
}
