package by.tasks.simple.classes.task9;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

public class Book {
private int id;
private String title;
private String author;
private String publishHouse;
private int year;
private int countPage;
private int price;
private String bindingType;

public Book(int id, String name, String author, String publishHouse, int year, int countPage, int price,
		String bindingType) {
	this.id = id;
	this.title = name;
	this.author = author;
	this.publishHouse = publishHouse;
	this.year = year;
	this.countPage = countPage;
	this.price = price;
	this.bindingType = bindingType;
}

public Book(int id, String name, String author, String publishHouse, int year, int countPage) {
	this.id = id;
	this.title = name;
	this.author = author;
	this.publishHouse = publishHouse;
	this.year = year;
	this.countPage = countPage;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return title;
}

public void setName(String name) {
	this.title = name;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public String getPublishHouse() {
	return publishHouse;
}

public void setPublishHouse(String publishHouse) {
	this.publishHouse = publishHouse;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public int getCountPage() {
	return countPage;
}

public void setCountPage(int countPage) {
	this.countPage = countPage;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public String getBindingType() {
	return bindingType;
}

public void setBindingType(String bindingType) {
	this.bindingType = bindingType;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "id:"+id+" title:"+title+" author:"+author+" publish house:"+publishHouse+" year:"+year+" count page:"+countPage+" price"+price+" binging type:"+bindingType;
}

}
