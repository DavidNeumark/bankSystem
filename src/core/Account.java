package core;

public class Account {
	
	private int id;
	private float balance;
	private Logger logger = new Logger("driver 1");
	
	public Account(int id, float balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public float getBalance() {
		return this.balance;
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
		this.setBalance(this.getBalance() + deposit);
	}
	
	public void withdraw(float withdraw) {
		this.setBalance(this.getBalance() - withdraw);
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", logger=" + logger + "]";
	}
	
	
	
	
	
}
