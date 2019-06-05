package by.tasks.basics.linear;
import java.util.Scanner;

public class Task1 {
	private double a;
	private double b;
	private double c;
	
	
	public static void main(String[] args) {
		Task1 task1=new Task1();
		task1.inputNumbers();
		System.out.println("z=((a-3)*b/2)+c="+task1.calculate());
		
	}
	
	private void inputNumbers() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number a: ");
		a = in.nextDouble();
        System.out.println("a="+a);
        
        System.out.println("Input number b: ");
        b = in.nextDouble();
        System.out.println("b="+b);
        
        System.out.println("Input number c: ");
        c = in.nextDouble();
        System.out.println("b="+c);
        in.close();
	}
	
	public double calculate() {
		return ((a-3)*b/2)+c;
	}
	
	
}
