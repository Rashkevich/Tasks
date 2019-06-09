package by.tasks.algorithmization.array.of.array;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов

public class Task12 {
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
			sortUp(matrix[i]);
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
			sortDown(matrix[i]);
		}
		System.out.println("---------------------");
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
	public static int[] sortUp(int[] row) {
		int temp=row[0];
		for (int i=0;i<row.length;i++) {
			for (int j=i;j<row.length;j++) {
				if (row[i]>row[j]) {
					temp=row[i];
					row[i]=row[j];
					row[j]=temp;
				}
			}
		}
		
			return row;
	}

	
	
	public static int[] sortDown(int[] row) {
		int temp=row[0];
		for (int i=0;i<row.length;i++) {
			for (int j=i;j<row.length;j++) {
				if (row[i]<row[j]) {
					temp=row[i];
					row[i]=row[j];
					row[j]=temp;
				}
			}
		}
		
			return row;
	}

		
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(5,5);
		sortMatrixUp(matrix);
		sortMatrixDown(matrix);
	}
}
