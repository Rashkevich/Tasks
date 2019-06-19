package by.tasks.string.stringbuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//1. ƒан текст (строка). Ќайдите наибольшее количество подр€д идущих пробелов в нем

public class Task1 {

	public static void main(String[] args) {
	String text="1. ƒан текст (строка).       Ќайдите    наибольшее   количество подр€д идущих пробелов в нем";
	Pattern p=Pattern.compile("\\s+");
	Matcher m=p.matcher(text);
	int count=0;
	int max=0;
	while(m.find()) {
		String str=m.group();
		count=str.length();
		if (max<count) {
			max=count;
		}
	}
	System.out.println("Ќаибольшее количество подр€д идущих пробелов:"+max);
	}

}
