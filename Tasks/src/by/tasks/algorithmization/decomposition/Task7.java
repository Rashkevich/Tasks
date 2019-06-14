package by.tasks.algorithmization.decomposition;

//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
public class Task7 {
	
	public static int factorial(int n) {
	    int result = 1;
	    if (n == 1 || n == 0) {
	        return result;
	    }
	    result = n * factorial(n-1);
	    return result;
	}
	
	public static int sumFactorialOdd(int a, int b) {
		int sum=0;
		for (int i=a;i<=b;i++) {
			if (i%2!=0) {
				System.out.println(i);
				sum=sum+factorial(i);
			}
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int sum=sumFactorialOdd(1, 9);
		System.out.println("Сумма факториалов нечетных чисел: " + sum);
	}

}
