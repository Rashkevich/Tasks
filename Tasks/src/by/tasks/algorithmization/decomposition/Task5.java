package by.tasks.algorithmization.decomposition;

//5. Составить программу, которая в массиве A[N] находит 
//второе по величине число (вывести на печать число, 
//		которое меньше максимального элемента массива, 
//		но больше всех других элементов).


public class Task5 {
	
	public static int findMax(int a[]) {
		int max=a[0];
		for (int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static int findSecondMax(int a[], int max) {
		int secondMax=a[0];
		for(int i=0;i<a.length;i++) {
			if ((secondMax<max)&&(secondMax<a[i])) {
				if (a[i]!=max) {
					secondMax=a[i];
				}
			}
		}
		return secondMax;
	}
	
	public static void main(String[] args) {
		int a[]= {2,5,4,6,3,1,2,8};
		int max=findMax(a);
		System.out.println("Максимальное число :"+max);
		int secondMax=findSecondMax(a, max);
		System.out.println("Второе максимальное число:"+secondMax);

	}

}
