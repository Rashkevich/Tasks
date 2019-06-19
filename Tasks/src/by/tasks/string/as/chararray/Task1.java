package by.tasks.string.as.chararray;

//1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ar[]= {"CamelSuperCase","SpiderMan","SuperMan","ZukerMan"};
		for (String str:ar) {
			str=convert(str);
		}
		}

	public static String convert(String str) {
		Pattern p=Pattern.compile("[A-Z]+[a-z]+");
		Matcher m=p.matcher(str);
		String newStr=new String();
		while(m.find()) {
			newStr=newStr+m.group().toLowerCase()+"_";
		}
		str=newStr.substring(0,newStr.length()-1);
		System.out.println(str);
		return str;
	}

}
