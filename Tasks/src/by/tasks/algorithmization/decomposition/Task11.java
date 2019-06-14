package by.tasks.algorithmization.decomposition;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Task11 {
	
	public static int longerNumber(int a, int b) {
		int longer=a;
		int lengthA=numLength(a);
		int lengthB=numLength(b);
		if (lengthA<lengthB) {
			longer=b;
			System.out.println("Число имеет большую длинну:"+b);
		}else if(lengthA==lengthB){
			System.out.println("Числа имеют одинаковую длинну");
		} else {
			System.out.println("Число имеет большую длинну:"+a);
		}
		
		
		return longer;
	}
	
	public static int numLength(int a) {
		
		int count=0;
			while(a!=0) {
				a=a/10;
				count++;
			}
		return count;
	}

	public static void main(String[] args) {
		int a=12544;
		int b=2234;
		longerNumber(a,b);

	}

}
