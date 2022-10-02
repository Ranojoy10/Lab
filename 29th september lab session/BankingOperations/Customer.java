package BankingOperations;

public class Customer { 
	int accountNumber;
	String accountName;
	double accountBalance;
	
	public void createAccount(int accnumber,String accname,double accbal) { // For creating account
		this.accountNumber=accnumber;
		this.accountName=accname;
		this.accountBalance=accbal;
	}
	public void setAmount (double amount) {// for adding Amount
		accountBalance+=amount;
	}
	public void getAmount() { // for printing account details
	System.out.println("Account Holder: "+accountName);
	System.out.println("Account Balance: "+accountBalance);
	}
	public void withDrawAmount(double amount) { // For withdraw
		accountBalance-=amount;
		System.out.println("withdraw of INR "+amount+" is Succesful. \nyour updated balance is:"+accountBalance);
	}
}
 class Customers_BankAccount {
	public static void main(String[] args) {
		Customer c1Ranojoy =new Customer(); // Creating 1st Account
		c1Ranojoy.createAccount(734462726,"Ranojoy Banerjee",100000);
		c1Ranojoy.setAmount(200000.00);//Calling setAmount method
		c1Ranojoy.getAmount();// Calling getAmount method
		c1Ranojoy.withDrawAmount(50000.00);//Calling withDrawAmount method
		
		System.out.println("________________________");
		Customer c2Sayan =new Customer();
		c2Sayan.createAccount(734462728,"Sayan Mukherjee",100000);
		c2Sayan.setAmount(40000.00);//Calling setAmount method
		c2Sayan.getAmount();// Calling getAmount method
		c2Sayan.withDrawAmount(5000.00);//Calling withDrawAmount method
	}
}



