package by.tasks.algorithmization.one.dimension.arrays;

public class Task2 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
	int z=5;
	int count=0;
	
	for (int i=0;i<a.length;i++) {
		if(a[i]>z) {
			count++;
			a[i]=z;
		}
	}
	
	System.out.println("Количество замен "+count);
	for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
