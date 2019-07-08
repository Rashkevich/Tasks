package by.tasks.simple.classes.task9;

public class BookRunner {

	public static void main(String[] args) {
		Book b1=new Book(1,"Дети мои","Гузель Яхина","Редакция Елены",2018,496,594,"Твердый переплет");
		Book b2=new Book(2,"Муму","Иван Тургенев","Издательский дом Мещерякова",2017,64,328,"Тонированная бумага");
		Book b3=new Book(3,"Талорис","Алексей Пехов","Альфа-книга",2019,375,343,"Твердый переплет");
		Book b4=new Book(4,"Мятная сказка","Александр Полярный","АСТ",2019,160,396,"Клеевое швейное скрепление");
		Book b5=new Book(5,"Благие знамения","Пратчетт, Гейман","Эксмо",2019,512,327,"Твердый переплет");
		BookStorage storage=new BookStorage();
		storage.add(b1);
		storage.add(b2);
		storage.add(b3);
		storage.add(b4);
		storage.add(b5);
		storage.getByAuthor("Александр Полярный");
		System.out.println("--------------------");
		storage.getByPublishHouse("Эксмо");
		System.out.println("--------------------");
		storage.getByYear(2018);
		System.out.println("--------------------");
	}

}
