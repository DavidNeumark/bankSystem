package core;

public class Bank {
	
	private static Bank bank_instance = null;
	private static float commissionSum;
	
	private Client[] clients = new Client[100];
	private Logger logService;
//	account updater
	private Logger logger;
	private float bankBalance;
	
	
	private Bank() {
		super();
	}
	
	public static Bank getInstance() { 
		if (bank_instance == null) 
			bank_instance = new Bank(); 
	  
	        return bank_instance; 
	} 
	
	// this operation returns the bank balance.
	// The balance is calculated by summing the total
	// clients balance and the total accounts balance – you should
	// use Client.getFortune() method of each client.
	public void setBalance() {
		bankBalance = 0;
		for (int i = 0; i < clients.length; i++) {
			bankBalance = clients[i].getFortune();
		}
	}
	
	public float getBalance() {
		return bankBalance;
	}
	
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
			if(clients[i] == null) {
				clients[i] = client;
				break;
			}
		}
	}
	
	public void removeClient(int id) {
		for (int i = 0; i < clients.length; i++) {
			if(clients[i].getId() == id) {
				clients[i] = null;
				break;
			}
		}
	}
	
	public Client[] getClients() {
		return clients;
	}
	
	public void viewLogs() {
		
	}
	
	public void startAccountUpdater() {
		
	}

}
