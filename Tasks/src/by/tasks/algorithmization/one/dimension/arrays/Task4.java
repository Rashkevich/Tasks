package by.tasks.algorithmization.one.dimension.arrays;

//4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.


public class Task4 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,9,6,7,8,5};
	int tempMin=a[0];
	int tempMax=a[0];
	int indMin=0;
	int indMax=0;
	
	for (int i=0;i<a.length;i++) {
		if (tempMin>a[i]) {
			tempMin=a[i];
			indMin=i;
		}
		if(tempMax<a[i]) {
			tempMax=a[i];
			indMax=i;
		}
	}
	
	a[indMin]=tempMax;
	a[indMax]=tempMin;
	
	for (int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
}
}
