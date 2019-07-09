package by.tasks.simple.classes.aggregation.task4;

public class Account {
	private long id;
	private String clientName;
	private long money;
	private boolean isBlocked;
	
	public Account(long id, String clientName, long money) {
		this.id = id;
		this.clientName = clientName;
		this.money = money;
		this.isBlocked = false;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public long getMoney() {
		long m=money;
		if (isBlocked) {
			m=0;
			System.out.println("Account is blocked");
		}
		return m;
	}

	public void setMoney(long money) {
		this.money = money;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	

}
