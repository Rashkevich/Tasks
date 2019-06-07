package by.tasks.algorithmization.array.of.array;

//6. —формировать квадратную матрицу пор€дка n по заданному образцу(n - четное):

public class Task6 {

	public static void main(String[] args) {
		int n=10;
		int matrix[][]=new int[n][n];
		
		for (int i=0;i<n;i++) {       //fill one
			for (int j=0;j<n;j++) {
				matrix[i][j]=1;
			}
		}
		
		int m=n-1;
		int l=0;
		
		for (int i=0;i<n;i++) {  //fill 0  both sides of matrix
			for (int j=0;j<n;j++) {
					if(j>m) {
						matrix[i][j]=0;
					}
					if (j<l) {
						matrix[i][j]=0;
					}
			}
			m--;
			l++;
		} 
		
		
		int o=n/2-1;
		for (int i=n/2;i<n;i++) { //copy up side to down side
			matrix[i]=matrix[o];
			o--;
		}
		
		
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}


}
