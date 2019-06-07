package by.tasks.algorithmization.array.of.array;

//1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.



public class Task1 {

	public static void main(String[] args) {
		int matrix[][]= {{5,2,3},{6,8,9},{12,4,9},{3,0,8},{13,10,14}};
		for (int i=0;i<matrix.length;i++) {
			if ((i==0)||(i%2==0)){
				if (matrix[i][0]>matrix[i][matrix[i].length-1]) {
					for (int j=0;j<matrix[i].length;j++) {
						System.out.print(matrix[i][j]+" ");
					}
					System.out.println();
				}
			}
		}

	}

}
