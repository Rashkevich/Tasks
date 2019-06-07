package by.tasks.algorithmization.one.dimension.arrays;


//5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {
public static void main(String[] args) {
	int a[]= {15,1,14,2,3,4,11,5,6,10,7,8,9};
	
	
	for (int i=0;i<a.length;i++) {
		if(a[i]>i) {
			System.out.println("a="+a[i]+" >"+i);
		}
	}
	
	
}
}
