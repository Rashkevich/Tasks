package by.tasks.algorithmization.array.of.array;

//11. ћатрицу 10x20 заполнить случайными числами от 0 до 15. ¬ывести на экран саму матрицу и номера строк, в
//которых число 5 встречаетс€ три и более раз

public class Task11 {
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
	
		
	public static void findRow(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			int countRow=0;
			for (int j=0;j<matrix[i].length;j++) {
				if (matrix[i][j]==5) {
					countRow++;
				}
			}
			if (countRow>=5) {
				System.out.println("The row number where 5 has been found 3 or more times:"+i);
			}
		}
	}
	
	//---------------------------------------
	public static void main(String[] args) {
		int matrix[][]=createMatrix(10,20);
		findRow(matrix);
		
	}

}
