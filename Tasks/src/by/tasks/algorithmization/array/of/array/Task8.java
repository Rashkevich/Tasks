package by.tasks.algorithmization.array.of.array;

import java.util.Scanner;

//8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

public class Task8 {
	
	static void prntMatrix(int[][] matrix, int n, int m) {
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void changeColumn(int[][] matrix, int n, int m, int first, int second) {
		int temp[]=new int[n];
		int count=0;
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				if (first==j) {
					temp[count]=matrix[i][j];
					matrix[i][first]=matrix[i][second];
					matrix[i][second]=temp[count];
					count++;
				}
			}
		}
	} 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5; //rows
		int m=6; //columns
		int matrix[][]=new int[n][m];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<m;j++) {
				matrix[i][j]=i*10+j;
			}
		}
		prntMatrix(matrix, n, m);
		
		System.out.println("input first column number 0-5:");
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		System.out.println("input second column number 0-6:");
		int second=sc.nextInt();
		
		changeColumn(matrix, n,m, first, second);
		prntMatrix(matrix, n, m);
	}




}
