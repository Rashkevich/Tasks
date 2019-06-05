package by.tasks.algorithmization.one.dimension.arrays;

public class Task6 {
public static void main(String[] args) {
	
	int n=7;
	double a[]=new double[n];
	a[0]=1.1;
	System.out.println(a[0]);
	for (int i=1; i<n;i++) {
		a[i]=0.1+a[i-1];
		System.out.println(a[i]);
	}

	double sum=0;
	
	for (int i=1;i<a.length;i++) {
		int count=0;
		for (int j=1;j<=i;j++) {
			if (i%j==0) {
				count++;
				
			}
		}
		if (count==2) {
			sum=sum+a[i];
		}
	}

	System.out.println("Сумма элементов "+sum);

}
}
