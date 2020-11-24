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

	public void transaction(Client client, float deposit) {
		float new_balance = client.getBalance() + deposit;
		client.setBalance(new_balance);
	}
	
	public void autoUpdateAccounts() {
		
	}

}
