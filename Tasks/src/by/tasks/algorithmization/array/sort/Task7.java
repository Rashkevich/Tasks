package by.tasks.algorithmization.array.sort;


//7. Пусть даны две неубывающие последовательности действительных чисел n m a  a  a и b  b  b 1 2 1 2 .
//Требуется указать те места, на которые нужно вставлять элементы последовательности m b  b  b 1 2 в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

public class Task7 {
	
	public static void findIndInput(int a[], int b[]) {
		for (int i=0;i<a.length;i++) {
			for (int j=i;j<a.length;j++) {
				if ((b[j]>=a[i])&&(b[j]<a[i+1])) {
					System.out.println("b[j]="+b[j]+" input in a[i]="+a[i]+", index="+(i+1));
				}
			}
		}
		
		if (a.length<b.length) {
			for (int j=a.length;j<b.length;j++) {
				if (b[j]>=a[a.length-1]) {
					System.out.println("b[j]="+b[j]+" input in a[] index="+(j));
				}
				
				if (b[j]<a[a.length-1]) {
					for (int i=0;i<a.length;i++) {
						if ((b[j]>=a[i])&&(b[j]<a[i+1])) {
							System.out.println("b[j]="+b[j]+" input in a[i]="+a[i]+", index="+(i+1));
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int a[]= {1,5,10,14,19,20,23,23,34};
		int b[]= {3,8,9,11,15,20,21,21,31,42,43};
		findIndInput(a, b);
	}
	

}
