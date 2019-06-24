package by.tasks.string.regex;

//1. C������ ����������, ����������� ����� (����� �������� � ������) � ����������� ��������� � ������� ��� ���������
//��������: ������������� ������ �� ���������� �����������; � ������ ����������� ������������� ����� �� �����;
//������������� ������� � ����������� �� �������� ���������� ��������� ��������� �������, � � ������ ��������� � ��
//��������.


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
		String text='\u2029'+"�������������� �������� ���� Error ��������� ������ �� ����� ���������� ���������. ����� ���������� ������� � ���������� ��������, � �������, � ������������� �����, �� �������� ����������� � �� ����� �������������� �����������. ��������� ������ �� �������� ����������� �� ������ Error\r\n" + 
				"��������� �� �������.\r\n" + 
				'\u2029'+"���� ��������� �������� ������� ����������� ����������, �����������\r\n" + 
				"�� ������ Exception ��� ���������� � ������� ������������ ������\r\n" + 
				"RuntimeException. ����������� ������������� ������������ ����������\r\n" + 
				"����� ���� ��������� ��� �� ����� ���������� ����. ���������� ���������,\r\n" + 
				"����� �� ������ ����� ������������ ��� ������������ ����������.\r\n" + 
				'\u2029'+"����������� ���������� ������ ���� ���������� � ������, ������� ����� �� ������������, ��� �������� � throws-������ ������ ��� ����������\r\n" + 
				"��������� � ���������� �������.\r\n" + 
				'\u2029'+"�� ����� ���������� ����� �������������� ����� ����������, �������\r\n" + 
				"����� ���� ���������� ��� ������ ��� ���������� ���������. ������ ����\r\n" + 
				"���������� �������� �� �������. � ������� �� ����������� ����������, �����\r\n" + 
				"RuntimeException � ����������� �� ���� ������ ��������� � �������������\r\n" + 
				"�����������. ���������� �� ���������, ����� �� ������������ �/��� ������������ ����� ��� ����������. ���������� ���� RuntimeException ������������ ��� ������������� ������ �� ����� ���������� ���������";
//		System.out.println(text);
		String paragraph[]=getParagraph(text);
		String newParagraph[]=sortParagraph(paragraph);
		prnt(newParagraph);
		System.out.println("----------------------");
		String paragraphSortWordSent[]=sortWordsInSentence(newParagraph);
		prnt(paragraphSortWordSent);
		System.out.println("*******SORTED BY CHAR*******");
		String sortBychar[]=sortWordsInSentenceByChar(newParagraph,'�');
		prnt(sortBychar);
	}
}
