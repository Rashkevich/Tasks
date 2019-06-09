package by.tasks.algorithmization.array.of.array;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
	public static int[][] createMatrix(int n,int m) {
				 //rows n
				 //columns m
				int matrix[][]=new int[n][m];
				
				for (int i=0;i<n;i++) {
					for (int j=0;j<m;j++) {
						matrix[i][j]=(int)(Math.random()*10);
						System.out.print(matrix[i][j]+" ");
						if(matrix[i][j]<10) {
							System.out.print(" ");
						}
					}
					System.out.println();
				}
		return matrix; 
	}
	
	public static int max(int[][] matrix) {
		int max=matrix[0][0];
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				if (max<matrix[i][j]) {
					max=matrix[i][j];
				}
			}
		}
		
		return max;
	}
	
	public static void changeOdd(int[][] matrix, int num) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				if(j%2==0) {
					matrix[i][j]=num;
				}
			}
		}
	}
	
	public static void print(int[][] matrix) {
		System.out.println("--------------------");
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix.length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(5,5);
		int max=max(matrix);
		changeOdd(matrix, max);
		print(matrix);
		
	}

}
