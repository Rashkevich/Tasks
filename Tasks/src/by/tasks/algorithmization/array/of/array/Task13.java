package by.tasks.algorithmization.array.of.array;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

public class Task13 {
	public static int[][] createMatrix(int n,int m) {
				 //rows n
				 //columns m
				int matrix[][]=new int[n][m];
				
				for (int i=0;i<n;i++) {
					for (int j=0;j<m;j++) {
						matrix[i][j]=(int)(Math.random()*15);
						System.out.print(matrix[i][j]+" ");
						if(matrix[i][j]<10) {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
		return matrix; 
	}
	
		
	public static void sortMatrixUp(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) { 
			for(int j=1;j<matrix[i].length;j++) {
				for(int k=0;k<matrix.length;k++) {
					if (matrix[j-1][k]<matrix[j][k]) {
						int temp=matrix[j-1][k];
						matrix[j-1][k]=matrix[j][k];
						matrix[j][k]=temp;
					}
				}
			}
		}
		System.out.println("---------------------");
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public static void sortMatrixDown(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) { 
			for(int j=1;j<matrix[i].length;j++) {
				for(int k=0;k<matrix.length;k++) {
					if (matrix[j-1][k]>matrix[j][k]) {
						int temp=matrix[j-1][k];
						matrix[j-1][k]=matrix[j][k];
						matrix[j][k]=temp;
					}
				}
			}
		}
		System.out.println("---------------------");
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
		
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(5,5);
		sortMatrixUp(matrix);
		sortMatrixDown(matrix);
	}
}
