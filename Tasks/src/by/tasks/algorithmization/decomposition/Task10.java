package by.tasks.algorithmization.decomposition;

//10. Дано натуральное число N. Написать метод(методы) 
//для формирования массива, элементами которого являются цифры числа N

public class Task10 {
	public static int[] create(int n) {
		int a[];
		int num=n;
		int count=0;
		while (num!=0) {
			num=num/10;
			count++;
		}
		
		a=new int[count];
	
		System.out.println(count);
		while(n!=0) {
			a[count-1]=n%10;
			n=n/10;
			count--;
		}
		return a;
	}
	
	public static void prnt(int a[]) {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int n=656554873;
		int a[]=create(n);
		prnt(a);
	}

}
