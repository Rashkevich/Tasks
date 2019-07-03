package examples;

public class ReloadMethod {
	static{
		System.out.println("static block one");
	}
	
	public ReloadMethod() {
		{
			System.out.println("dynamic block in constructor");
		}
	}
	public static void main(String[] args) {
		//Integer i=1;
		pr(1);
		Ext.ex();
		//Ext.ex("Yes");
		ReloadMethod rm=new ReloadMethod();
		{
			System.out.println("dynamic block one");
		}
	}
	static{
		System.out.println("static block two");
	}
	
	{
		System.out.println("dynamic block two");
	}
	
//	public static void pr(int i) {
//		System.out.println(i+" int");  //���� ������ pr(1) -> ����� ����� � int
//	}
//	
//	public static void pr(Integer i) {
//		System.out.println(i+" Integer");
//	}
	
//	public static void pr (double i) { //���� ������ pr(1.0) -> ����� ����� � double
//		System.out.println(i+" double");
//	}
	
	public static void pr (Double i) { //���� Double d=1.0 pr(d) -> ����� ����� � Double �.�. ���� ������� �������
		System.out.println(i+" Double");
	}

	public static void pr (Object i) { //���� pr(1) � ���� pr(Double i) ���� pr(�bject i) -> ������� � Object
		System.out.println(i+" Object");
		{
			System.out.println("dynamic block one");
		}
	}
	
	public static final void prnt(String s) {
		System.out.println("final static");
	}
	
	public static void ex() {
		System.out.println("ex in ReloadMethod");
	}
}

class Ext extends ReloadMethod{
//	public static void prnt(String s) {
//		System.out.println("final static"); //� parent �����e ���� ����� final
//	}

public static void ex() {
		System.out.println("ex in Ext-Override ");
	}
	
	public static void ex(String s) {
		System.out.println("ex in Ext - Overload "+s);
	}
}
