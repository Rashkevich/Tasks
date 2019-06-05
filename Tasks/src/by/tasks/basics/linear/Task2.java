package by.tasks.basics.linear;
import java.util.Scanner;

public class Task2 {
	private double a;
	private double b;
	private double c;
	
	
	public static void main(String[] args) {
		Task2 function=new Task2();
		function.inputNumbers();
		System.out.println("(b+sqrt(b*b+4*a*c))/(2*a)-(pow(a,3.0))*c+(pow(b, -2.0))="+function.calculate());
		
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
		
		return (b+Math.sqrt(b*b+4*a*c))/(2*a)-(Math.pow(a,3.0))*c+(Math.pow(b, -2.0));
	}
	
	
}
