package by.tasks.simple.classes.task8;

//8. —оздать класс Customer, спецификаци€ которого приведена ниже. 
//ќпределить конструкторы, set- и get- методы и метод toString(). 
//—оздать второй класс, агрегирующий массив типа Customer, с подход€щими конструкторами и методами. 
//«адать критерии выбора данных и вывести эти данные на консоль.
// ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Ќайти и вывести:
//a) список покупателей в алфавитном пор€дке;
//b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале


public class Customer {
private int id;
private String surname;
private String name;
private String secondName;
private String address;
private long cardNumber;
private long bankCounter;

public Customer(int id, String surname, String name, String secondName, String address, long cardNumber,
		long bankCounter) {
	this.id = id;
	this.surname = surname;
	this.name = name;
	this.secondName = secondName;
	this.address = address;
	this.cardNumber = cardNumber;
	this.bankCounter = bankCounter;
}

public Customer(int id, String surname, String name, String secondName) {
	this.id = id;
	this.surname = surname;
	this.name = name;
	this.secondName = secondName;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSecondName() {
	return secondName;
}

public void setSecondName(String secondName) {
	this.secondName = secondName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getCardNumber() {
	return cardNumber;
}

public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}

public long getBankCounter() {
	return bankCounter;
}

public void setBankCounter(long bankCounter) {
	this.bankCounter = bankCounter;
}

@Override
public String toString() {
	String s="id:"+id+"| surname:"+surname+"| name:"+name+"| second name:"+secondName+"| address:"+address+"| card number:"+cardNumber+"| bank counter:"+bankCounter;
	return s;
}


}
