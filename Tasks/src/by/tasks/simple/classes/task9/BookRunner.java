package by.tasks.simple.classes.task9;

public class BookRunner {

	public static void main(String[] args) {
		Book b1=new Book(1,"���� ���","������ �����","�������� �����",2018,496,594,"������� ��������");
		Book b2=new Book(2,"����","���� ��������","������������ ��� ����������",2017,64,328,"������������ ������");
		Book b3=new Book(3,"�������","������� �����","�����-�����",2019,375,343,"������� ��������");
		Book b4=new Book(4,"������ ������","��������� ��������","���",2019,160,396,"������� ������� ����������");
		Book b5=new Book(5,"������ ��������","��������, ������","�����",2019,512,327,"������� ��������");
		BookStorage storage=new BookStorage();
		storage.add(b1);
		storage.add(b2);
		storage.add(b3);
		storage.add(b4);
		storage.add(b5);
		storage.getByAuthor("��������� ��������");
		System.out.println("--------------------");
		storage.getByPublishHouse("�����");
		System.out.println("--------------------");
		storage.getByYear(2018);
		System.out.println("--------------------");
	}

}
