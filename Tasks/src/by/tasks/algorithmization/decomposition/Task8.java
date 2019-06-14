package by.tasks.algorithmization.decomposition;

//8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов 
//массива с номерами от k до m.

public class Task8 {
	
	public static int[] create(int n) {
		
		int a[]=new int[n];
		for (int i=0;i<a.length;i++) {
			a[i]=i+1;
			System.out.print(a[i]+" ");
		}
		System.out.println();
		return a;
	}
	
	public static int sum(int a[], int k, int m) {
		int sum=0;
		int count=0;
		int x=1;
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			sum=sum+a[i];
			count++;
			if (count==m) {
				System.out.println(" Сумма="+sum+" ");
				count=0;
				sum=0;
				if (i==a.length-1) {
					break;
				}
				i=i-x;
				x++;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		int n=6;
		int a[]=create(n);
		int k=1;
		int m=k+2;
		sum (a,k,m);

	}

}
