package by.tasks.simple.classes.aggregation.task4;

import java.util.LinkedList;
import java.util.Optional;

public class BankofNY {
private LinkedList<Account> storage;

public BankofNY() {
	this.storage = new LinkedList<Account>();
}

public void addAccount(Account account) {
	storage.add(account);
}

public void find(String clientName) {
	storage
	.stream()
	.filter(s->s.getClientName().equals(clientName))
	.map(s->s.getClientName()+" счет:"+s.getId()+" Остаток:"+s.getMoney())
	.forEach(System.out::println);
	System.out.println("-----------------------------------");
}

public void find(long id) {
	storage
	.stream()
	.filter(s->s.getId()==id)
	.map(s->s.getClientName()+" счет:"+s.getId()+" Остаток:"+s.getMoney())
	.forEach(System.out::println);
	System.out.println("-----------------------------------");
}

public void sumByClient(String clientName) {
	Optional<Long> sum = storage.stream().filter(s->s.getClientName().equals(clientName)).map(s->s.getMoney()).reduce((x,y)->x+y);
	System.out.println("Общая сумма по счетам "+clientName+" :"+sum.get());
	System.out.println("-----------------------------------");
}

public void sumPlusByClient(String clientName) {
	Optional<Long> sum = storage
			.stream()
			.filter(s->s.getClientName().equals(clientName))
			.filter(s->s.getMoney()>0)
			.map(s->s.getMoney()).reduce((x,y)->x+y);
	System.out.println("Общая сумма по положительным счетам "+clientName+" :"+sum.get());
	System.out.println("-----------------------------------");
}

public void sumMinusByClient(String clientName) {
	Optional<Long> sum = storage
			.stream()
			.filter(s->s.getClientName().equals(clientName))
			.filter(s->s.getMoney()<=0)
			.map(s->s.getMoney()).reduce((x,y)->x+y);
	System.out.println("Общая сумма по отритцательным счетам "+clientName+" :"+sum.get());
	System.out.println("-----------------------------------");
}

}
