package multithreading;

public class raceCondn {
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + ": Main thread started..");
		BankAccount bankAccount = new BankAccount();
		
		Thread max = new Thread(bankAccount);
		max.setName("Max");
		
		Thread anna = new Thread(bankAccount);
		anna.setName("Anna");
		
		max.start();
		anna.start();
		
		System.out.println(Thread.currentThread().getName() + ": Main thread ended...");
	}

}
class BankAccount implements Runnable{
	private int balance;
	public BankAccount(){
		this.balance= 100;
	}
	
	public synchronized void withdrawMoney(int amount) {
		System.out.println(Thread.currentThread().getName() + ": Wants to withdraw: " +amount);
		if (balance>=amount) {
			System.out.println(Thread.currentThread().getName() + ": About to withdraw: " +amount);
			balance-=amount;
			System.out.println(Thread.currentThread().getName() + ": withdrawn: " +amount + "balance is"+this.balance);
			}else {
				System.out.println(Thread.currentThread().getName() + " :not enough money" + " balance: "+this.balance);
			}
	}
	
	
	
	
	

	@Override
	public void run() {
		withdrawMoney(75);
		if (this.balance<0) {
			System.out.println(Thread.currentThread().getName() + ":money overdrawn");

		}
		
	}
	
}