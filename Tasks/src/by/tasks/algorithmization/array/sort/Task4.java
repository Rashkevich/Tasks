package by.tasks.algorithmization.array.sort;

//4. Сортировка обменами. Дана последовательность чисел n a a a     1 2 .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task4 {
		
	public static void main(String[] args) {
		int arrOne[]={4,7,6,1,5,3,2};
		int temp;
		int count=0;
		for (int i=0;i<arrOne.length;i++) {
			for (int j=1;j<arrOne.length;j++) {
				if (arrOne[j-1]>arrOne[j]) {
					temp=arrOne[j-1];
					arrOne[j-1]=arrOne[j];
					arrOne[j]=temp;
					count++;
				}
			}
		}
		
		System.out.println("Количество перестановок:"+count);

		for (int i=0;i<arrOne.length;i++) {
			System.out.print(arrOne[i]+" ");
		}
	}

}
