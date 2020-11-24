package core;

public class Account {
	
	private int id;
	private float balance;
	private Logger logger;
	
	public Account(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		Log log = new Log(System.currentTimeMillis(), this.id, "setBalance", balance);
		logger.log(log);
	}

	public int getId() {
		return id;
	}

	public void deposit(float deposit) {
		float new_balance = this.getBalance() + deposit;
		this.setBalance(new_balance);
	}
	
	public void withdraw(Client client, float withdraw) {
		float new_balance = client.getBalance() - withdraw;
		client.setBalance(new_balance);
	}
	
}
