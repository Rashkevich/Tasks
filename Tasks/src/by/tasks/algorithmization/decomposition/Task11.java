package by.tasks.algorithmization.decomposition;

//11. �������� �����(������), ������������, � ����� �� ������ ���� ����� ������ ����.

public class Task11 {
	
	public static int longerNumber(int a, int b) {
		int longer=a;
		int lengthA=numLength(a);
		int lengthB=numLength(b);
		if (lengthA<lengthB) {
			longer=b;
			System.out.println("����� ����� ������� ������:"+b);
		}else if(lengthA==lengthB){
			System.out.println("����� ����� ���������� ������");
		} else {
			System.out.println("����� ����� ������� ������:"+a);
		}
		
		
		return longer;
	}
	
	public static int numLength(int a) {
		
		int count=0;
			while(a!=0) {
				a=a/10;
				count++;
			}
		return count;
	}

	public static void main(String[] args) {
		int a=12544;
		int b=2234;
		longerNumber(a,b);

	}

}
