package by.tasks.string.stringbuilder;


//4. � ������� ������� ����������� � �������� ������������ ��������� �� ������ ����� ������������� ����� �����.

public class Task4 {

	public static void main(String[] args) {
		String str="�����������";
		String end=new String();
		String strT=str.substring(7, 8);
		String strOp=str.substring(3,5);
		
		end=end.concat(strT);
		end=end.concat(strOp);
		end=end.concat(strT);
		System.out.println(end);
	}

}
