package by.tasks.algorithmization.decomposition;

//12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, элементами которого
//являются числа, сумма цифр которых равна К и которые не большее N.

public class Task12 {
	
	public static int[] createArray(int k, int n) {
		int length = getLengthArray(k, n);
		int a[]=new int[length];
		int count=0;
		for (int i=0;i<=n;i++) {
			int num=i;
			int sum=0;
			while(num!=0) {
				sum=sum+num%10;
				num=num/10;
			}
			if (sum==k) {
				a[count]=i;
				count++;
			}
		}
		
		return a;
	}


	private static int getLengthArray(int k, int n) {
		int count=0;
		for (int i=0;i<=n;i++) {
			int num=i;
			int sum=0;
			while(num!=0) {
				sum=sum+num%10;
				num=num/10;
			}
			if (sum==k) {
				count++;
			}
		}
		return count;
	}

	
	public static void prnt(int a[]) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args) {
		int k=8;
		int n=32;
		int a[]=createArray(k, n);
		prnt(a);
	}

}
