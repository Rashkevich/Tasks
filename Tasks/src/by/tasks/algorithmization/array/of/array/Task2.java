package by.tasks.algorithmization.array.of.array;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matrix[][]= {{5,2,3,4},{6,8,9,11},{12,4,9,4},{3,0,8,12}};
		for (int i=0;i<matrix.length;i++) {
			for (int j=0; j<matrix[i].length;j++) {
				if (i==j) {
					System.out.println(matrix[i][j]);
				} 
			}
		}
	}

}
