package by.tasks.simple.classes.task10;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AirlineStorage {
private ArrayList<Airline> airlineList;

public AirlineStorage() {
	airlineList=new ArrayList<Airline>();
}

public void add(Airline airline) {
	airlineList.add(airline);
}

public void listByDestination(String destination) {
	airlineList.stream().filter(s->s.getDestination().equals(destination)).forEach(System.out::println);
	System.out.println("---------------------------");
}

public void listByDayOfWeek(String day) {
	System.out.println("Day:"+day);
	for (Airline a:airlineList) {
		Fly list[]=a.getFlyList();
		for (Fly fly:list) {
			if (fly.getDay().getTitle().equals(day)) {
				System.out.println("Flight number:"+a.getNumber()+" Destination:"+ a.getDestination()+" Type:"+a.getType()+" Time:"+fly.getTime());
			}
		}
	}
	System.out.println("---------------------------");
}

public void listByDayOfWeek(String day, String time) {
	System.out.println("Day:"+day+ " Time:"+time);
	LocalTime getTime=LocalTime.parse(time);
	int timeInSeconds=getTime.toSecondOfDay();
	for (Airline a:airlineList) {
		Fly list[]=a.getFlyList();
		for (Fly fly:list) {
			if (fly.getDay().getTitle().equals(day)) {
				int storageTimeInSeconds=fly.getTime().toSecondOfDay();
				if (timeInSeconds<storageTimeInSeconds) {
					System.out.println("Flight number:"+a.getNumber()+" Destination:"+ a.getDestination()+" Type:"+a.getType()+" Time:"+fly.getTime());
				}
			}
		}
	}
	System.out.println("---------------------------");
}

}
