package by.tasks.simple.classes.task5;

public class CounterRunner {

	public static void main(String[] args) {
		Counter counter=new Counter();
		System.out.println(" Counter state:"+ counter.getCounter());
		counter.counterPlus();
		System.out.println(" Counter plus:"+ counter.getCounter());
		counter.counterMinus();
		System.out.println(" Counter minus:"+ counter.getCounter());
		counter.counterMinus();
		System.out.println(" Counter minus:"+ counter.getCounter());
		counter.counterPlus();
		System.out.println(" Counter plus:"+ counter.getCounter());
		counter.setCounter(5);;
		System.out.println(" Counter set:"+ counter.getCounter());
	}

}
