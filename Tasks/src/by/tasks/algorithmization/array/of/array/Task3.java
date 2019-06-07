package by.tasks.algorithmization.array.of.array;
//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {
public static void main(String[] args) {
	int matrix[][]= {{5,2,3,4},{6,8,9,11},{12,4,9,4},{3,0,8,12}};
	int k=2;
	int p=3;

	for (int j=0;j<matrix[k].length;j++) {
		
			System.out.print(matrix[k][j]+" ");
	}
	System.out.println();
	
	for (int i=0;i<matrix.length;i++) {
		for (int j=0;j<matrix[i].length;j++) {
				if(j==p) {
					System.out.println(matrix[i][j]);
				}
		}
	}
}
}
