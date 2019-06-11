package by.tasks.algorithmization.array.sort;

//2. Даны две последовательности n m a  a  a и b  b  b 1 2 1 2 . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

public class Task2 {

	public static void main(String[] args) {
		int arrOne[]={1,2,3,4,5,6,7};
		int arrTwo[]={2,4,6,8,10,12,14};
		
		for (int i=0;i<arrOne.length;i++) {
			arrOne[i]=arrOne[i]+arrTwo[i];
		}
		
		for (int i=0;i<arrOne.length;i++) {
			System.out.print(arrOne[i]+" ");
		}
	}

}
