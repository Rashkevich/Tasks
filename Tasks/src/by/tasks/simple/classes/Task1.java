package by.tasks.simple.classes;
//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//Добавьте метод, который находит сумму значений этих переменных, и метод, 
//который находит наибольшее значение из этих двух переменных.


public class Task1 {
	private int i,j;
	
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

	public int summing() {
		return i+j;
	}
	
	public void print() {
		System.out.println("i="+i+" j="+j);
	}
	
	public int max () {
		return i>j?i:j;
	}

	public static void main(String[] args) {
		Task1 task=new Task1();
		task.setI(1);
		task.setJ(2);
		System.out.println("sum="+task.summing());
		System.out.println("max="+task.max());
		task.print();
	}

}
