package by.tasks.algorithmization.decomposition;

//13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

public class Task13 {
	
	
	public static void prnt(int i) {
		System.out.println("число:"+i+" близнец:"+(i+2));
	}
	
	
	public static void prnt() {
		System.out.println("поиск окончен");
	}
	
	
	public static void findTwin(int n) {
		
		for (int i=n;i<2*n;i++) {
			if((i+2)<2*n) {
				prnt(i);
			} else {
				prnt();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n=30;
		findTwin(n);
	}
}
