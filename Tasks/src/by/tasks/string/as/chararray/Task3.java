package by.tasks.string.as.chararray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//3. В строке найти количество цифр

public class Task3 {

	public static void main(String[] args) {
		String text="3. В строке 41 найти 1количество 0цифр";
		Pattern p=Pattern.compile("[0-9]{1}");
		Matcher m=p.matcher(text);
		int counter=0;
		while(m.find()) {
			System.out.println(m.group());
			counter++;
		}
		System.out.println("Количество цифр="+counter);
	}

}
