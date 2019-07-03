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
//		System.out.println(i+" int");  //если просто pr(1) -> будет метод с int
//	}
//	
//	public static void pr(Integer i) {
//		System.out.println(i+" Integer");
//	}
	
//	public static void pr (double i) { //если просто pr(1.0) -> будет метод с double
//		System.out.println(i+" double");
//	}
	
	public static void pr (Double i) { //если Double d=1.0 pr(d) -> будет метод с Double т.е. явно указать враппер
		System.out.println(i+" Double");
	}

	public static void pr (Object i) { //если pr(1) и есть pr(Double i) есть pr(Оbject i) -> выберет с Object
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
//		System.out.println("final static"); //в parent классe этот метод final
//	}

public static void ex() {
		System.out.println("ex in Ext-Override ");
	}
	
	public static void ex(String s) {
		System.out.println("ex in Ext - Overload "+s);
	}
}
