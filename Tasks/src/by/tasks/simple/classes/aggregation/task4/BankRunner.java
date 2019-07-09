package by.tasks.simple.classes.aggregation.task4;

public class BankRunner {

	public static void main(String[] args) {
		Account account1=new Account(123456789, "Rogovcev Konstantin", 100L);
		Account account2=new Account(123456788, "Rogovcev Konstantin", -10L);
		Account account3=new Account(123456787, "Rogovcev Konstantin", 30L);
		Account account4=new Account(123456786, "Penkrat Alexey", 30L);
		Account account5=new Account(123456785, "Budashkina Ekaterina", 100L);
		BankofNY bank=new BankofNY();
		bank.addAccount(account1);
		bank.addAccount(account2);
		bank.addAccount(account3);
		bank.addAccount(account4);
		bank.addAccount(account5);
		
		bank.find("Rogovcev Konstantin");
		bank.find(123456789);
		bank.sumByClient("Rogovcev Konstantin");
		bank.sumMinusByClient("Rogovcev Konstantin");
		bank.sumPlusByClient("Rogovcev Konstantin");
	}

}
