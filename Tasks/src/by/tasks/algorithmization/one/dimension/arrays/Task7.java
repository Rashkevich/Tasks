package by.tasks.algorithmization.one.dimension.arrays;

public class Task7 {
public static void main(String[] args) {
	int a[]= {1,2,18,4,5,6,7,8,9,10};
	
	int sum[]=new int[a.length-1];
	int indSum=0;
	
	for (int i=1;i<a.length;i++) { 
		//System.out.println("indSum "+indSum);
		sum[indSum]=a[i-1]+a[i]; 
		System.out.println(sum[indSum]);
		indSum++; 
	}
	
	int max=a[0];
	for (int i=0;i<sum.length;i++) {
		if (max<sum[i]) {
			max=sum[i];
		}
	}
	System.out.println("Максимальная сумма:"+max);
}
}
