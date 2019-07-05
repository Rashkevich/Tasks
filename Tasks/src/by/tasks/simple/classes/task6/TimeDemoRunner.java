package by.tasks.simple.classes.task6;

public class TimeDemoRunner {

	public static void main(String[] args) {
		TimeDemo time=new TimeDemo(1, 2, 35);
		System.out.println(time.toString());
		time.setHour(24);
		time.setMinute(66);
		time.setSecond(-1);
		System.out.println(time.toString());
	}

}
