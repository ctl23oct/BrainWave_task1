package taskB;

import java.util.Scanner;

public class ATMInterface {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		ATM atm=new ATM(5000,1234);
		
		System.out.println("Enter your PIN: ");
		int enteredPin=sc.nextInt()	;
		
		if(atm.verifyPIN(enteredPin)) {
			System.out.println("PIN verified successfully. \n");
		
		while(true) {
			System.out.println("\n====  ATM MENU ====");
			System.out.println("1. Check balance");
			System.out.println("2. Withdraw money");
			System.out.println("3. Exit");
			System.out.println(" Choose an option: ");
			
			int choice=sc.nextInt();
			
			switch(choice) {
			
			case 1: atm.checkBalance();
			break;
			
			case 2: System.out.println("Enter withdrawal amount:Rs.");
			double withdrawAmount=sc.nextDouble();
			atm.withdraw(withdrawAmount);
			break;
			
			case 3: System.out.println("THANK YOU  for using the ATM...");
			sc.close();
			System.exit(0);
			
			default:
				System.out.println("Invalid choice. Please try again.");
			
		
			}
		}
				
	}else {
		System.out.println("Incorrect PIN. Access denied");
		sc.close();
	}

}
}
