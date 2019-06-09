package by.tasks.algorithmization.array.of.array;

//10. Ќайти положительные элементы главной диагонали квадратной матрицы

public class Task10 {
	public static int[][] createMatrix(int n,int m) {
				 //rows n
				 //columns m
				int matrix[][]=new int[n][m];
				
				for (int i=0;i<n;i++) {
					for (int j=0;j<m;j++) {
						matrix[i][j]=(int)(Math.random()*18-9);
						System.out.print(matrix[i][j]+" ");
					}
					System.out.println();
				}
		return matrix; 
	}
	
		
	public static void positiveElementDiagonal(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				if (i==j) {
					if (matrix[i][j]>0) {
						System.out.println(matrix[i][j]);
					}
				}
			}
		}
	}
	
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(6,6);
		positiveElementDiagonal(matrix);
		
	}

}
