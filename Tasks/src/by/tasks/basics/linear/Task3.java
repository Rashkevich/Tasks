package by.tasks.basics.linear;
import java.util.Scanner;

public class Task3 {
	private double x;
	private double y;
	
	
	
	public static void main(String[] args) {
		Task3 function=new Task3();
		function.inputNumbers();
		System.out.println("(sin(x)+cos(y))/(cos(y)-sin(y))*(tan(x*y))"+function.calculate());
		
	}
	
	private void inputNumbers() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number x: ");
		x = in.nextDouble();
        System.out.println("x="+x);
        
        System.out.println("Input number y: ");
        y = in.nextDouble();
        System.out.println("y="+y);
        
        in.close();
	}
	
	public double calculate() {
		
		return (Math.sin(x)+Math.cos(y))/(Math.cos(y)-Math.sin(y))*(Math.tan(x*y));
	}
	
	
}
