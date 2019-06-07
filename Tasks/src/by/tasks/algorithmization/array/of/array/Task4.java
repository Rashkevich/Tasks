package by.tasks.algorithmization.array.of.array;

//4. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):

public class Task4 {
	public static void main(String[] args) {
		int n=4;
		int matrix[][]=new int[n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i%2==0) {
					matrix[i][j]=j+1;
				} else {
					matrix[i][j]=n-j;
				}
			}
		}
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
}
