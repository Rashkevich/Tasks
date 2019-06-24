package by.tasks.string.regex;

//1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных
//операции: отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по
//алфавиту.


public class Task1 {
	
	public static String[] getParagraph(String text) {
		String paragraph[]=text.split("\\u2029");
		return paragraph;
	}
	
	public static String[] sortParagraph(String paragraph[]) {
		String temp=paragraph[0];
		for (int i=1;i<paragraph.length;i++) {
			if (countSentence(paragraph[i-1])<countSentence(paragraph[i])){
				temp=paragraph[i-1];
				paragraph[i-1]=paragraph[i];
				paragraph[i]=temp;
			}
		}
		return paragraph;
	}
	
	public static int countSentence(String string) {
		int count=0;
		String sentence[]=string.split("[.!?]\\s*");
		count=sentence.length;
		return count;
		
	}
	
	public static String[] sortWordsInSentence(String paragraph[]) {
		for (int i=0;i<paragraph.length;i++) {
			String sentence[]=paragraph[i].split("[.!?]\\s*");
			for (int j=0;j<sentence.length;j++) {
				sentence[j]=sortWord(sentence[j]);
			}
			paragraph[i]="\u2029";
			for (int k=0;k<sentence.length;k++) {
				paragraph[i]=paragraph[i]+sentence[k];
			}
		}
		
		return paragraph;
	}
	
	public static String[] sortWordsInSentenceByChar(String paragraph[], char c) {
		for (int i=0;i<paragraph.length;i++) {
			String sentence[]=paragraph[i].split("[.!?]\\s*");
			for (int j=0;j<sentence.length;j++) {
				sentence[j]=sortWordByChar(sentence[j],c);
			}
			paragraph[i]="\u2029";
			for (int k=0;k<sentence.length;k++) {
				paragraph[i]=paragraph[i]+sentence[k];
			}
		}
		
		return paragraph;
	}

	public static String sortWordByChar(String string,char c) {
		String word[]=string.split("\\s+");
		String tmp=new String();
		for (int i=1;i<word.length;i++) {
			for (int j=1;j<word.length;j++) {
				if (countChar(word[j-1],c)>countChar(word[j],c)) {
					tmp=word[j-1];
					word[j-1]=word[j];
					word[j]=tmp;
				}
			}
		}
		string=new String();
		for (int i=0;i<word.length;i++) {
			string=string+word[i]+" ";
		}
		string=string.trim()+". ";
	return string;
}
	
	public static int countChar(String word, char c) {
		int count=0;
		char ch[]=word.toCharArray();
		for (int i=0;i<word.length();i++) {
			if (ch[i]==c) {
				count++;
			}
		}
		return count;
	}

	public static String sortWord(String string) {
			String word[]=string.split("\\s+");
			String tmp=new String();
			for (int i=1;i<word.length;i++) {
				for (int j=1;j<word.length;j++) {
					if (word[j-1].trim().length()>word[j].trim().length()) {
						tmp=word[j-1];
						word[j-1]=word[j];
						word[j]=tmp;
					}
				}
			}
			string=new String();
			for (int i=0;i<word.length;i++) {
				string=string+word[i]+" ";
			}
			string=string.trim()+". ";
		return string;
	}

	
	public static void prnt(String string[]) {
		for (int i=0;i<string.length;i++) {
			System.out.println(string[i]);
		}
	}

	public static void main(String...hello) {
		String text='\u2029'+"Исключительные ситуации типа Error возникают только во время выполнения программы. Такие исключения связаны с серьезными ошибками, к примеру, с переполнением стека, не подлежат исправлению и не могут обрабатываться приложением. Некоторые классы из иерархии наследуемых от класса Error\r\n" + 
				"приведены на рисунке.\r\n" + 
				'\u2029'+"Ниже приведена иерархия классов проверяемых исключений, наследуемых\r\n" + 
				"от класса Exception при отсутствии в цепочке наследования класса\r\n" + 
				"RuntimeException. Возможность возникновения проверяемого исключения\r\n" + 
				"может быть отслежена еще на этапе компиляции кода. Компилятор проверяет,\r\n" + 
				"может ли данный метод генерировать или обрабатывать исключение.\r\n" + 
				'\u2029'+"Проверяемые исключения должны быть обработаны в методе, который может их генерировать, или включены в throws-список метода для дальнейшей\r\n" + 
				"обработки в вызывающих методах.\r\n" + 
				'\u2029'+"Во время выполнения могут генерироваться также исключения, которые\r\n" + 
				"могут быть обработаны без ущерба для выполнения программы. Список этих\r\n" + 
				"исключений приведен на рисунке. В отличие от проверяемых исключений, класс\r\n" + 
				"RuntimeException и порожденные от него классы относятся к непроверяемым\r\n" + 
				"исключениям. Компилятор не проверяет, может ли генерировать и/или обрабатывать метод эти исключения. Исключения типа RuntimeException генерируются при возникновении ошибок во время выполнения приложени";
//		System.out.println(text);
		String paragraph[]=getParagraph(text);
		String newParagraph[]=sortParagraph(paragraph);
		prnt(newParagraph);
		System.out.println("----------------------");
		String paragraphSortWordSent[]=sortWordsInSentence(newParagraph);
		prnt(paragraphSortWordSent);
		System.out.println("*******SORTED BY CHAR*******");
		String sortBychar[]=sortWordsInSentenceByChar(newParagraph,'а');
		prnt(sortBychar);
	}
}
