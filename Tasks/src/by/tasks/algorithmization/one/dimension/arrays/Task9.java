package by.tasks.algorithmization.one.dimension.arrays;

public class Task9 {
public static void main(String[] args) {
	int a[]= {1,2,1,0,3,5,2};
	int arr[]=new int[a.length];
	
	for (int i=0;i<a.length;i++) {
		arr[i]=0; 	//���������� ���������� �����
	}
	
	for (int i=0;i<a.length;i++) { //������ ����������
		for (int j=0;j<a.length;j++) {
			if (a[i]==a[j]) { 
				arr[i]=arr[i]+1; 
			}
		}
	}
	

	for (int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println();
	
	
	
		int countMostRepeat=0;
		int mostRepeat=arr[0];
		
	for (int i=0;i<arr.length;i++) { //
		if (mostRepeat<arr[i]) {
			mostRepeat=arr[i];      //������������ ����� ���������� ������ �����
		}
	}
	
	
	
	
	for (int i=0;i<arr.length;i++) { //���������� ����� � ���������� ����������� ������������ ����������
		if(arr[i]==mostRepeat) {
			countMostRepeat++;
		}
	}
	
	System.out.println(countMostRepeat);
	
	int numMostRepeat[]=new int[countMostRepeat];//����� ������ � ������� ������� ����������� ����� �����������
	int countNumMostRepeat=0;
	for (int i=0;i<arr.length;i++) {
		if (arr[i]==mostRepeat) {
			numMostRepeat[countNumMostRepeat]=a[i];
			countNumMostRepeat++;
		}
	}
	
	for (int i=0;i<numMostRepeat.length;i++) {
		System.out.print(numMostRepeat[i]);
	}
	System.out.println();
	
	int min=numMostRepeat[0];
	for (int i=0;i<numMostRepeat.length;i++) {  //����������� ����� ����� ������������� �����
		if(min>numMostRepeat[i]) {
			min=numMostRepeat[i];
		}
	}
	
	System.out.println("����������� ����� ����� ������������� �����:"+ min);
}
}
