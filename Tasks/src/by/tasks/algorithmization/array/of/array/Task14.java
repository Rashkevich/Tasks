package by.tasks.algorithmization.array.of.array;

//14. —формировать случайную матрицу m x n, состо€щую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task14 {
	public static int[][] createMatrix(int n,int m) {
				 //rows n
				 //columns m
				int matrix[][]=new int[n][m];
				
				for (int i=0;i<n;i++) {
					for (int j=0;j<m;j++) {
						matrix[i][j]=0;
						System.out.print(matrix[i][j]+" ");
					}
					System.out.println();
				}
		return matrix; 
	}
	
	public static void generateOne(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				if(j<i) {
					matrix[i][j]=1;
				}
			}
		} 
		System.out.println();
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
		
		
	//---------------------------------------
	public static void main(String[] args) {
		int m=(int)(Math.random()*3+3);
		int n=(int)(Math.random()*3+3);
		int matrix[][]=createMatrix(m,n);
		generateOne(matrix);	
	}
}
