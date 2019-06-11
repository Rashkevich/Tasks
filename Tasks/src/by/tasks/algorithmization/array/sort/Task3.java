package by.tasks.algorithmization.array.sort;

//3. Сортировка выбором. Дана последовательность чисел n a a a     1 2 .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

public class Task3 {
	
	public static int[] changeNum(int arrOne[], int num) {
		int max=arrOne[num];
		int maxInd=num;
		int temp;
	
		for (int i=num;i<arrOne.length;i++) {
			if (max<arrOne[i]) {
				max=arrOne[i];
				maxInd=i;
			}
		}
		temp=arrOne[num];
		arrOne[num]=max;
		arrOne[maxInd]=temp;
		
		return arrOne;
	}

	
	public static void main(String[] args) {
		int arrOne[]={1,7,6,4,5,3,2};
		
		for (int i=0;i<arrOne.length;i++) {
			changeNum(arrOne, i);
		}

		for (int i=0;i<arrOne.length;i++) {
			System.out.print(arrOne[i]+" ");
		}
	}

}
