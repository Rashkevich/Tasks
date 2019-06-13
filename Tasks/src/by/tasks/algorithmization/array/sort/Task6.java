package by.tasks.algorithmization.array.sort;


//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
//на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class Task6 {
	
	public static void prnt(int[] arrOne) {
		for (int i=0;i<arrOne.length;i++) {
			System.out.print(arrOne[i]+" |");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arrOne[]={20,1,14,9,3,4,9,2,6};
		prnt(arrOne);
		int temp;
		
		for (int i=0;i<arrOne.length;i++) {
			for (int j=0;j<arrOne.length;j++) {
				if (((j+2)<arrOne.length)&&(arrOne[j]<=arrOne[j+1])) {
					temp=arrOne[j+2];
					arrOne[j+2]=arrOne[j+1];
					arrOne[j+1]=arrOne[j];
					arrOne[j]=temp;
				}
				prnt(arrOne);
			}
			
		}
		
//		for(int i=0;i<arrOne.length;i++) {
//			for (int j=0;j<arrOne.length;j++) {
//				if (((j+1)<arrOne.length)&&(arrOne[j]>arrOne[j+1])) {
//					
//				}
//			}
//		}
		
		
//		
//		for (int k=0;k<arrOne.length;k++) {
//			for (int i=0;i<arrOne.length-k;i++) {
//				if ((i+1)<arrOne.length) {
//					if (arrOne[i]>arrOne[i+1]) {
//						temp=arrOne[i+1];
//						arrOne[i+1]=arrOne[i];
//						arrOne[i]=temp;
//						prnt(arrOne); 
//						if (i>0) {
//							for (int j=i;j>arrOne.length;j++) {  //*****
//								temp=arrOne[i-1];
//								arrOne[i-1]=arrOne[i];
//								arrOne[i]=temp;
//							}
//						}
//					}
//					if ((i+2)<arrOne.length) {
//						if(arrOne[i]<=arrOne[i+1]) {
//							temp=arrOne[i+2];
//							arrOne[i+2]=arrOne[i+1];
//							arrOne[i+1]=arrOne[i];
//							arrOne[i]=temp;
//							
//						}
//						prnt(arrOne);
//					}
//
//				}
//				
//			}
//		}
//
//		
//		prnt(arrOne);

	}

}
