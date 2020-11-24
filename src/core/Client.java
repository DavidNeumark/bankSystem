package core;

public class Client {
	
	private int id;
//	private String rank;
	private String name;
	private float balance;
	private Account[] accounts = new Account[5];
	private float commission_rate = 0;
	private float interest_rate = 0;
	private Logger logger;
	
	public Client(int id, String name, float balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accounts = new Account[5];
		logger = new Logger(null);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public Account[] getAccounts() {
		return accounts;
	}
	
	//TODO what happen if the client already have 5 accounts and the array is full?
	public void addAccount(Account account) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i] == null) {
				accounts[i] = account;
				Log log = new Log(System.currentTimeMillis(), this.id, "addAccount", account.getBalance());
				logger.log(log);
				break;
			}
		}
	}
	
	public Account getAccount(int index) {
		return accounts[index];
	}

	public void remove_account (int id) {
		for (int i = 0; i < accounts.length; i++) {
			if(accounts[i].getId() == id){
				balance = balance + accounts[i].getBalance();
				Log log = new Log(System.currentTimeMillis(), this.id, "remove_account", accounts[i].getBalance());
				logger.log(log);
				accounts[i] = null;
				
				
			}
		}
	}
	
}
