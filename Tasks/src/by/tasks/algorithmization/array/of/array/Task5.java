package by.tasks.algorithmization.array.of.array;

//5. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):
public class Task5 {

	public static void main(String[] args) {
		int n=8;
		int matrix[][]=new int[n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				matrix[i][j]=i+1;
			}
		}
		
		int m=n-1;
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
					if(j>m) {
						matrix[i][j]=0;
					}
			}
			m--;
		}
		
		
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
