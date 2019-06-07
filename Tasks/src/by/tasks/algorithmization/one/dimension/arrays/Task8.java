package by.tasks.algorithmization.one.dimension.arrays;


//8. Дана последовательность целых чисел n a ,a , ,a 1 2  . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min( , , , ) 1 2 n a a  a .

public class Task8 {
public static void main(String[] args) {
	int a[]= {0,1,2,3,4,5};
	int length=a.length/2+a.length%2;
	int arr[]=new int[length];
	int count=0;
	for (int i=0;i<a.length;i++) {
		
		if((i+1)%2!=0) {
			arr[count]=a[i];
			count++;
		}
		
	}
	
	for (int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
}
}
