package by.tasks.basics.linear;

public class Task5 {

	public static void main(String[] args) {
		int seconds=906101;
		int save=seconds;
		int hours=seconds/(60*60);
		seconds=seconds-hours*60*60;
		int minutes=seconds/60;
		seconds=seconds-minutes*60;
		System.out.println(save+" seconds converted in hh/mm/ss:"+hours+":"+minutes+":"+seconds);
		
	}

}
