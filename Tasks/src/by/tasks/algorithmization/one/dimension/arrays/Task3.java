package by.tasks.algorithmization.one.dimension.arrays;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-5,0,-3,1,2,3,0,4,5,6,-1,7,8,9};
		int countMin=0;
		int countPlus=0;
		int countZero=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]>0) {
				countPlus++;
			}
			if (a[i]==0) {
				countZero++;
			}
			if (a[i]<0) {
				countMin++;
			}
		}
		System.out.println("Положительных:"+countPlus);
		System.out.println("Отритцательных:"+countMin);
		System.out.println("Нулевых:"+countZero);
	}

}
