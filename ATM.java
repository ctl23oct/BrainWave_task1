package taskB;

class ATM {
	private double balance;
	private int pin;
	
	public ATM(double initialBalance,int pin) {
		this.balance=initialBalance;
		this.pin=pin;
	}
	
	public void checkBalance() {
		System.out.println("Your current balance is : Rs." + balance);
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount <=balance) {
			balance -=amount;
			System.out.println("Rs." + amount + "withdrawn successfully");
		}
		else if (amount>balance) {
			System.out.println("Insuficient balance!");
			
		}else {
			System.out.println("Invalid withdrawal amaount.");
		}
	}
	
	public boolean verifyPIN(int enteredPin) {
		return enteredPin==this.pin;
	}
	

	
}
