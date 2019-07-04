package by.tasks.simple.classes.task3;

//3. Создайте класс с именем Student, 
//содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. 
//Добавьте возможность вывода фамилий и номеров групп студентов, 
//имеющих оценки, равные только 9 или 10.

public class Student {
	private int id;
	private String name;
	private String initial;
	private int group;
	private int progress[]=new int[5];
	
	public Student(int id, String name, String initial, int group, int[] progress) {
		this.name = name;
		this.initial = initial;
		this.group = group;
		this.progress = progress;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int[] getProgress() {
		return progress;
	}

	public void setProgress(int[] progress) {
		this.progress = progress;
	}
	
	
		
	
}
