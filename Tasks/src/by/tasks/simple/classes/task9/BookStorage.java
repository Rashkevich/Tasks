package by.tasks.simple.classes.task9;

import java.util.ArrayList;

public class BookStorage {
private ArrayList<Book> storage;

public BookStorage() {
	storage=new ArrayList<Book>();
}

public void add(Book book) {
	storage.add(book);
}

public void getByAuthor(String author) {
	storage.stream().filter(s->s.getAuthor()==author).forEach(System.out::println);
}

public void getByPublishHouse(String publish) {
	storage.stream().filter(s->s.getPublishHouse()==publish).forEach(System.out::println);
}

public void getByYear(int year) {
	storage.stream().filter(s->s.getYear()>=year).forEach(System.out::println);
}

}
