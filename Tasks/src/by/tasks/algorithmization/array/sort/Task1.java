package by.tasks.algorithmization.array.sort;

//1. ������ ��� ���������� ������� � ��������� ����������� ��������� � ����������� ����� k. ���������� �� �
//���� ������, ������� ������ ������ ����� k-� � (k+1) - � ���������� �������, ��� ���� �� ���������
//�������������� ������.

public class Task1 {

	public static void main(String[] args) {
		int arrOne[]= {1,2,5,4,7,9,5};
		int arrTwo[]={1,2,3,4};
		int k=4;
		
		int length=arrOne.length+arrTwo.length;
		int arrThree[]=new int[length];
		
		for (int i=0;i<k;i++) {
			arrThree[i]=arrOne[i];
		}
		for (int i=k;i<k+arrTwo.length;i++) {
			arrThree[i]=arrTwo[i-k];
		}
		for (int i=k+arrTwo.length;i<length;i++) {
			arrThree[i]=arrOne[k];
			k++;
		}
		
		for (int i=0;i<arrThree.length;i++) {
			System.out.print(arrThree[i]+" ");
		}
	}

}
