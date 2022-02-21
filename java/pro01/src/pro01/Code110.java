package pro01;

class BankAccount {
	String name;
	double balance;
	static int count;
	
	BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		count++;
	}
}

public class Code110 {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Alice", 100000);
		BankAccount ba2 = new BankAccount("Paul", 50000);
		BankAccount ba3 = new BankAccount("Cindy", 30000);
		BankAccount ba4 = new BankAccount("David", 150000);
		BankAccount ba5 = new BankAccount("Tom", 200000);
		
		System.out.println("number of accounts: " + BankAccount.count);
	}

}
