package by.tasks.string.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
//	2. ���� ������, ���������� ��������� ����� (xml-��������):
//		<notes>
//		<note id = "1">
//		<to>����</to>
//		<from>�����</from>
//		<heading>�����������</heading>
//		<body>������� ��� ������!</body>
//		</note>
//		<note id = "2">
//		<to>����</to>
//		<from>����</from>
//		<heading>������ �����������</heading>
//		<body/>
//		</note>
//		</notes>
//		�������� ����������, ����������� ��������������� ���������� ���������� ����� xml-��������� � ��� ��� (�����������
//		���, ����������� ���, ���������� ����, ��� ��� ����). ������������ �������� ��������� XML ��� ������� ������ ������
//		������.
	public static void main(String[] args) {
		String str="<notes>\r\n" + 
				"<note id = \"1\">\r\n" + 
				"<to>����</to>\r\n" + 
				"<from>�����</from>\r\n" + 
				"<heading>�����������</heading>\r\n" + 
				"<body>������� ��� ������!</body>\r\n" + 
				"</note>\r\n" + 
				"<note id = \"2\">\r\n" + 
				"<to>����</to>\r\n" + 
				"<from>����</from>\r\n" + 
				"<heading>������ �����������</heading>\r\n" + 
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

	public static void getContentAndType(String tag[]) {//������ � ������
		System.out.println("----------------������ �����-----------------");
		String tagArr[]=new String[tag.length];//������ ���� to   /to ��� to ��� ������ /to
		for(int i=0;i<tag.length;i++) {
			String regexStart="/*[a-z0-9]+\\s*[a-z0-9]*\\s*=*\\s*[\\\"]*[a-z0-9]*[\\\"]*/*";//��������� ���
			String start[]=findTag(tag[i],regexStart);//����� ������ �����
				tagArr[i]=start[0];
				if (start.length>1) {
					tagArr[i]=tagArr[i]+" "+start[1];
					//System.out.println("tag="+tagArr[i]);
				}
				System.out.println("tag="+tagArr[i]);
		}
		System.out.println("---------------------------------");
		for (int i=0;i<tagArr.length;i++) {
			String tagStartEnd[]=findTag(tagArr[i],"[a-z0-9]+/");//����� �����-������� ����� <bla/>
			if(tagStartEnd.length!=0) {
				System.out.println("����+++:"+tagStartEnd[0]);//���� ���� ������������ ���-�����
				System.out.println("���������� ����:"+tag[i]);
			} else if (tagStartEnd.length==0) {//���� ��� <bla/> - ����� �������� ���� </bla>
				if (tagArr[i].contains("/")) {
					String tagStartEndInOneStr[]=findTag(tagArr[i],"/*[a-z0-9]+");
					if (tagStartEndInOneStr.length>1) {
						System.out.println("����---:"+tagStartEndInOneStr[0]);//����� ���� <bla> </bla> � ����� ������
						tag[i]=tag[i].replace("<"+tagStartEndInOneStr[0]+">", "").replace("</"+tagStartEndInOneStr[0]+">", "");
						System.out.println("���������� ����:"+tag[i]);
					}
				} else if (!tagArr[i].contains("/")) {//����� ����� <bla> </bla>
					String startEndTagInOneStr[]=findTag(tagArr[i],"/*[a-z0-9]+");
					System.out.println("����!!!:"+tagArr[i]);
					for (int j=i;j<tagArr.length;j++) {
						if(tagArr[j].contains("/"+startEndTagInOneStr[0])) {//����� ������������ ����
							System.out.println("���������� ����:");
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
