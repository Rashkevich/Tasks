package by.tasks.string.as.chararray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4. � ������ ����� ���������� �����.

public class Task4 {

	public static void main(String[] args) {
		String text="3. � ������ 41 ����� 123���������� 0����";
		Pattern p=Pattern.compile("[0-9]+");
		Matcher m=p.matcher(text);
		int counter=0;
		while(m.find()) {
			System.out.println(m.group());
			counter++;
		}
		System.out.println("���������� �����="+counter);
	}

}
