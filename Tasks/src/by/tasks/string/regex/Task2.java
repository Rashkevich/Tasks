package by.tasks.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
//	2. Дана строка, содержащая следующий текст (xml-документ):
//		<notes>
//		<note id = "1">
//		<to>Вася</to>
//		<from>Света</from>
//		<heading>Напоминание</heading>
//		<body>Позвони мне завтра!</body>
//		</note>
//		<note id = "2">
//		<to>Петя</to>
//		<from>Маша</from>
//		<heading>Важное напоминание</heading>
//		<body/>
//		</note>
//		</notes>
//		Напишите анализатор, позволяющий последовательно возвращать содержимое узлов xml-документа и его тип (открывающий
//		тег, закрывающий тег, содержимое тега, тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи
//		нельзя.
	public static void main(String[] args) {
		String str="<notes>\r\n" + 
				"<note id = \"1\">\r\n" + 
				"<to>Вася</to>\r\n" + 
				"<from>Света</from>\r\n" + 
				"<heading>Напоминание</heading>\r\n" + 
				"<body>Позвони мне завтра!</body>\r\n" + 
				"</note>\r\n" + 
				"<note id = \"2\">\r\n" + 
				"<to>Петя</to>\r\n" + 
				"<from>Маша</from>\r\n" + 
				"<heading>Важное напоминание</heading>\r\n" + 
				"<body/>\r\n" + 
				"</note>\r\n" + 
				"</notes>";
		String tag[]=findTag(str,"<.*>");
		//prnt(tag);
		getContentAndType(tag);
		//findTag(str,"<[a-z]+.*>.*</[a-z]+>");
	}
	
	public static String[] findTag(String str,String regex) {
		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(str);
		int count=0;
		while(m.find()) {
			count++;
		}
		String tag[]=new String[count];
		count=0;
		m.reset();
		while(m.find()) {
			tag[count]=m.group();
			count++;
		}
		return tag;
	}

	public static void getContentAndType(String tag[]) {//строки с тэгами
		System.out.println("----------------Массив тэгов-----------------");
		String tagArr[]=new String[tag.length];//Только тэги to   /to или to или только /to
		for(int i=0;i<tag.length;i++) {
			String regexStart="/*[a-z0-9]+\\s*[a-z0-9]*\\s*=*\\s*[\\\"]*[a-z0-9]*[\\\"]*/*";//стартовый тэг
			String start[]=findTag(tag[i],regexStart);//отбор только тэгов
				tagArr[i]=start[0];
				if (start.length>1) {
					tagArr[i]=tagArr[i]+" "+start[1];
					//System.out.println("tag="+tagArr[i]);
				}
				System.out.println("tag="+tagArr[i]);
		}
		System.out.println("---------------------------------");
		for (int i=0;i<tagArr.length;i++) {
			String tagStartEnd[]=findTag(tagArr[i],"[a-z0-9]+/");//поиск старт-эндовых тэгов <bla/>
			if(tagStartEnd.length!=0) {
				System.out.println("Узел+++:"+tagStartEnd[0]);//если есть стартэндовый тэг-вывод
				System.out.println("Содержимое узла:"+tag[i]);
			} else if (tagStartEnd.length==0) {//если нет <bla/> - поиск эндового тэга </bla>
				if (tagArr[i].contains("/")) {
					String tagStartEndInOneStr[]=findTag(tagArr[i],"/*[a-z0-9]+");
					if (tagStartEndInOneStr.length>1) {
						System.out.println("Узел---:"+tagStartEndInOneStr[0]);//вывод тэга <bla> </bla> в одной строке
						tag[i]=tag[i].replace("<"+tagStartEndInOneStr[0]+">", "").replace("</"+tagStartEndInOneStr[0]+">", "");
						System.out.println("Содержимое узла:"+tag[i]);
					}
				} else if (!tagArr[i].contains("/")) {//поиск тэгов <bla> </bla>
					String startEndTagInOneStr[]=findTag(tagArr[i],"/*[a-z0-9]+");
					System.out.println("Узел!!!:"+tagArr[i]);
					for (int j=i;j<tagArr.length;j++) {
						if(tagArr[j].contains("/"+startEndTagInOneStr[0])) {//поиск закрыавющего тэга
							System.out.println("Содержимое узла:");
							for (int k=i+1;k<j;k++) {
								System.out.println(tag[k]);
							}
							break;
						}
					}
				}
			}
			System.out.println("==================================");
		}
	}
	
	public static void prnt(String a[]) {
		for (String string : a) {
			System.out.println(string);
		}
	}

}
