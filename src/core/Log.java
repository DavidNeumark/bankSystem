package core;

public class Log {
	private long timestamp;
	private int client_id;
	private String description;
	private float amount;
	
	public Log(long timestamp, int client_id, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.client_id = client_id;
		this.description = description;
		this.amount = amount;
	}
	
	// This constructor doesn't take timestamp parameter because it will be filled automatically
	public Log(int client_id, String description, float amount) {
		this(System.currentTimeMillis(), client_id, description, amount);
	}
	
	
	public String getData() {
		String data = "Log [timestamp=" + timestamp + ", " + "client id: " + client_id + ", description: " + description + ", amount: " + amount + "]";
		return data;
	}

}
