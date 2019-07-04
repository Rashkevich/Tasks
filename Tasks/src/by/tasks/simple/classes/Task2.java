package by.tasks.simple.classes;

//2. Создйте класс Test2 двумя переменными. 
//Добавьте конструктор с входными параметрами. Добавьте конструктор, 
//инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.

public class Task2 {
	private int i;
	private int j;
	
	public Task2(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public Task2() {
		this.i = 1;
		this.j = 2;
	}
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public static void main(String[] args) {
		Task2 task=new Task2();
		System.out.println(task.getI()+" "+task.getJ());
		
		Task2 taskSecond=new Task2(3, 4);
		System.out.println(taskSecond.getI()+" "+taskSecond.getJ());

	}

}
