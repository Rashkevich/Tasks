package by.tasks.string.as.chararray;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//Крайние пробелы в строке удалить.

public class Task5 {

	public static void main(String[] args) {
		String text=" 5. Удалить в строке     все лишние пробелы,            то есть серии подряд идущих пробелов заменить на одиночные пробелы.\r\n" + 
				"Крайние пробелы в строке удалить. ";
		String str=text.replaceAll("\\s{2,}"," ");
		str=str.trim();
		System.out.println(str);
		
	}

}
