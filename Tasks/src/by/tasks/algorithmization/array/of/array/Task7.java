package by.tasks.algorithmization.array.of.array;

//7. Сформировать квадратную матрицу порядка N по правилу:
//и подсчитать количество положительных элементов в ней

public class Task7 {

	public static void main(String[] args) {
		int n=3;
		double matrix[][]=new double[n][n];
		int count=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				double d=Math.sin((i*i-j*j)/n);
				matrix[i][j]=d;
				if (d>0) {
					count++;
				}
			}
		}
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(matrix[i][j]+" ");	
			}
			System.out.println();
		}
		System.out.println("count of positive:"+count);
	}


}
