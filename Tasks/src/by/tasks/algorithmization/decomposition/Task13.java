package by.tasks.algorithmization.decomposition;

//13. ��� ������� ����� ���������� �����������, ���� ��� ���������� ���� �� ����� �� 2 (��������, 41 � 43).
//����� � ���������� ��� ���� ���������� �� ������� [n,2n], ��� n - �������� ����������� ����� ������ 2. ���
//������� ������ ������������ ������������.

public class Task13 {
	
	
	public static void prnt(int i) {
		System.out.println("�����:"+i+" �������:"+(i+2));
	}
 	
	 
	public static void prnt() {
		System.out.println("����� �������");
	}
	
	
	public static void findTwin(int n) {
		
		for (int i=n;i<2*n;i++) {
			if((i+2)<2*n) {
				prnt(i);
			} else {
				prnt();
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n=30;
		findTwin(n);
	}
}
