package by.tasks.algorithmization.one.dimension.arrays;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,8,9};
		int k=3;
		int sum=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]%k==0) {
				sum=sum+a[i];
			}
		}
		System.out.println(sum);
		
	}

}
