package core;

public class Bank {
	
	Client[] clients = new Client[100];
	Logger logService;
//	account updater
	Logger logger;
	
	
	public Bank() {
		super();
	}
	
	// this operation returns the bank balance.
	// The balance is calculated by summing the total
	//	clients balance and the total accounts balance – you should
	//	use Client.getFortune() method of each client.
	public void setBalance() {
		
	}
	
	public float getBalance() {
		float balance = 0;
		return balance;
	}
	
	public void adddClient(Client client) {
		
		
	}
	
	public void removeClient(int id) {
		
	}
	
	public Client[] getClients() {
		return clients;
	}
	
	public void viewLogs() {
		
	}
	
	public void startAccountUpdater() {
		
	}
	
	

}
