package by.tasks.algorithmization.array.of.array;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат.

public class Task16 {

	public static void printMatrix(int[][] matrix) {
		for (int i=0;i<matrix.length;i++) {
			for (int j=0;j<matrix[i].length;j++) {
				if((matrix[i][j]>=0)&&(matrix[i][j]<10)) {
					System.out.print(matrix[i][j]+"    ");
				}
				if (matrix[i][j]>=10) {
					System.out.print(matrix[i][j]+"   ");
				}
			}
			System.out.println();
			System.out.println();
		}
	}
	
	
	public static int[][] createMatrix(int n) {//порядок матрицы
		 //rows n
		 //columns m
		int m=n;
		int matrix[][]=new int[n][m];
		int counter=1;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				matrix[i][j]=counter;
				counter++;
			}
		}
		return matrix; 
	}
	
	public static int[][] createBigMatrix(int n){
		int bigMatrix[][]=new int[(2*n-1)][(2*n-1)];
		return bigMatrix;
	}
	
	public static int[][] smallInBigMatrix(int big[][],int small[][]) {//поворот квадрата на 45градусов
		int row=(big.length-1)/2;
		int startRow=row;
		int column=0;
		int startColumn=column;
		int endRow=0;
		int endCoulumn=0;
		for(int i=0;i<small.length;i++) {
			row=startRow;
			column=startColumn;
			for (int j=0;j<small[i].length;j++) {
				if((row>=endRow)&&(column>=endCoulumn)&&(column<big.length)) {
					big[row][column]=small[i][j];
					row=row-1;
					column=column+1;
					
				}
				 
			}
			
			startRow++;
			startColumn++;
			endRow++;
			endCoulumn++;
		}
		//--------------------------------------
		
		//--------------------------------------
		return big;
	}
	
	
	public static int[][] farNearAverage(int[][] big, int n) { //крайние к центру n- порядок
		int rowCentral=(big.length-1)/2;
		int colCentral=rowCentral;
		int row=rowCentral;
		
		n=n/2;//территория вне магического квадрата в клетках
		for (int i=0;i<n;i++) {       //верх перенос внутрь
			row++;
			for (int j=0;j<big[i].length;j++) {
				if (big[i][j]!=0) {
					big[row][j]=big[i][j];
					big[i][j]=0;
				}
			}
		}
		
		row=rowCentral;
		for (int i=big.length-1;i>big.length-1-n;i--) {   //низ
			row--;
			for (int j=0;j<big[i].length;j++) {
				if (big[i][j]!=0) {
					//System.out.println(big[i][j]);
					big[row][j]=big[i][j];
					big[i][j]=0;
				}
			}
		}
		
		int col=colCentral; //Левая
		for (int i=0;i<big.length;i++) {
			for (int j=0;j<n;j++) {
				if (big[i][j]!=0) {
					big[i][col+j+1]=big[i][j];
					big[i][j]=0;
				}
			}
		}
		
		for (int i=0;i<big.length;i++) {
			for (int j=big[i].length-1;j>big[i].length-1-n;j--) {
				if (big[i][j]!=0) {
					big[i][j-col-1]=big[i][j];
					big[i][j]=0;
				}
			}
		}
		
		return big;
		}
	
		
		public static int[][] delZero(int[][] matrix, int n) {
			int arr[][]=new int[n][n];
			int m=n/2;
			for (int i=0;i<arr.length;i++) {
				for (int j=0;j<arr[i].length;j++) {
					arr[i][j]=matrix[i+m][j+m];
				}
			}
			
			return arr;
		}
	
	
	
	public static void main(String[] args) {
		int n=5;
		int matrix[][]=createMatrix(n);
		int bigMatrix[][]=createBigMatrix(n);
		bigMatrix=smallInBigMatrix(bigMatrix, matrix);
		farNearAverage(bigMatrix,n);
		int arr[][]=delZero(bigMatrix,n);
		//printMatrix(bigMatrix);
		System.out.println();
		printMatrix(arr);
	}



}
