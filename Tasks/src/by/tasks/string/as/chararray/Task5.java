package by.tasks.string.as.chararray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. ������� � ������ ��� ������ �������, �� ���� ����� ������ ������ �������� �������� �� ��������� �������.
//������� ������� � ������ �������.

public class Task5 {

	public static void main(String[] args) {
		String text=" 5. ������� � ������     ��� ������ �������,            �� ���� ����� ������ ������ �������� �������� �� ��������� �������.\r\n" + 
				"������� ������� � ������ �������. ";
		String str=text.replaceAll("\\s{2,}"," ");
		str=str.trim();
		System.out.println(str);
		
	}

}
