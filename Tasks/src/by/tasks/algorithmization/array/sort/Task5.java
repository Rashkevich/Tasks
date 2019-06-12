package by.tasks.algorithmization.array.sort;

//5. Сортировка вставками. Дана последовательность чисел n a ,a , ,a 1 2  . Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть i a ,a , ,a 1 2  - упорядоченная последовательность, т. е.
//n a  a  a 1 2 . Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {
	
	public static int sortPartOfArray(int arrOne[],int markedNum) { //частичная сортировка
		
		int temp;
		for (int i=0;i<markedNum;i++) {
			for (int j=1;j<markedNum;j++) {
				if (arrOne[j-1]>arrOne[j]) {
					temp=arrOne[j-1];
					arrOne[j-1]=arrOne[j];
					arrOne[j]=temp;
				}
			}
		}
		return markedNum;
	}
	
	
	public static int binaryFind(int arrOne[], int markedNum) {//частично отсортированный массив, число для нахождения, индекс числа стоящего после отсортированной части массива
		int startInd=0;
		int endInd=markedNum-1;
		int startIndBuf=startInd;
		int endIndBuf=endInd;
		boolean finding=true;
		
	
			while (finding) {
				int averageInd=(startInd+endInd)/2;  //поиск через среднее
				int count=0;
				if (arrOne[markedNum]<arrOne[averageInd]) {
					endInd=averageInd;						//конец диапазона=среднее
					if (endInd==endIndBuf) {				//настоящий конец сравниваем с предыдущим
						count++;							//если уже был такой то диапазон возможно не изменяется и следовательно найден элемент после которого будет вставка отмеченного элемента
					}
					//System.out.println(startInd+"  "+endInd);
				} else if (arrOne[markedNum]>=arrOne[averageInd]) { //начало диапазона=среднее
					startInd=averageInd;
					if (startInd==startIndBuf) {  					//настоящий конец сравниваем с предыдущим
						count++;
					}
					//System.out.println(startInd+"  "+endInd);
				}
				if (count>0) {								//если начало и конец одинаковые из предыдущего поиска то диапазон найден
					finding=false;
				}
				startIndBuf=startInd;
				endIndBuf=endInd;
			}
		
		return endInd;  //конец искомого диапазона место для вставки отмеченного элемента и сдвига массива
	}
	
	
public static int inputAndOffset(int[] arrOne, int markedNum, int findIndToInput) {
	int temp=arrOne[markedNum];   System.out.println("arrOne[markedNum]="+arrOne[markedNum]);
	for (int i=markedNum;i>findIndToInput;i--) {
		arrOne[i]=arrOne[i-1];	  System.out.println("arrOne[i]="+arrOne[i]+"arrOne[i-1]="+arrOne[i-1]);
	}
	arrOne[findIndToInput]=temp;
	System.out.println("arrOne[findIndToInput]="+arrOne[findIndToInput]);
	return markedNum;
}
	

public static void prnt(int[] arrOne) {
	for (int i=0;i<arrOne.length;i++) {
		System.out.print(arrOne[i]+" |");
	}
			
}
	
	public static void main(String[] args) {
		int arrOne[]={20,1,14,9,3,4,9,2,6,14,21,7,34,23,19,35,27,24,18,5};
		int markedNum=arrOne.length/4;
		System.out.println("marked num="+markedNum);
		sortPartOfArray(arrOne, markedNum);
		prnt(arrOne);
		for (int i=markedNum;i<arrOne.length;i++) {
			int findIndToInput=binaryFind(arrOne, i);
			System.out.println("само число "+arrOne[i]+" куда вставлять "+findIndToInput);
				inputAndOffset(arrOne, i, findIndToInput);
			prnt(arrOne);
		}
		
		int findIndToInputEnd=binaryFind(arrOne, arrOne.length-1);
		inputAndOffset(arrOne,arrOne.length-1 , findIndToInputEnd);
		prnt(arrOne);
	}
	
}
