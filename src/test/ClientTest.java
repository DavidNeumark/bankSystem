package test;

import core.Account;
import core.Client;

public class ClientTest {
	public static void main(String[] args) {
		
		Client client1 = new Client(1, "client 1", 100);
		Client client2 = new Client(2, "client 2", 200);
		
		Account account1 = new Account(1, 10);
		Account account2 = new Account(2, 20);
		Account account3 = new Account(3, 30);
		
		client1.addAccount(account1);
		client1.addAccount(account2);
		
		client1.withdraw(131, 2);
		client1.deposit(22, 1);
//		
		client1.getFortune();
	}

}
