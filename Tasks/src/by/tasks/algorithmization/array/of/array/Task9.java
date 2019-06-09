package by.tasks.algorithmization.array.of.array;

//9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {
	public static int[][] createMatrix(int n,int m) {
				 //rows n
				 //columns m
				int matrix[][]=new int[n][m];
				
				for (int i=0;i<n;i++) {
					for (int j=0;j<m;j++) {
						matrix[i][j]=(int)(Math.random()*10);
						System.out.print(matrix[i][j]+" ");
					}
					System.out.println();
				}
		return matrix; 
	}
	
	public static int[] sumColumnMatrix(int matrix[][]) {
		int m=matrix[0].length;
		int columnMatrix[]=new int[m];
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				columnMatrix[j]=columnMatrix[j]+matrix[i][j];
			}
		}
		return columnMatrix;
	}
	
	public static void max(int[] matrix) {
		int max=matrix[0];
		int maxInd=0;
		for (int i=0;i<matrix.length;i++) {
			if(max<matrix[i]) {
				max=matrix[i];
				maxInd=i;
			}
		}
		System.out.println("Maximal sum is: "+max+" column: "+maxInd);
	}
	
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(5,6);
		int sumColumnMatrix[]=sumColumnMatrix(matrix);
		max(sumColumnMatrix);
	}

}
