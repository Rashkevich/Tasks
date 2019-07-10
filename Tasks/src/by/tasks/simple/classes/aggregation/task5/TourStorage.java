package by.tasks.simple.classes.aggregation.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TourStorage {
	
private ArrayList<Tour> tourList;

public TourStorage() {
	tourList=new ArrayList<Tour>();
}

public void add(Tour tour) {
	tourList.add(tour);
}

public void find(Command cmd, String value, Command cmdToSort) {
	List<Tour> list=new ArrayList<Tour>();
	
	try {
		switch(cmd) {
		case FOOD: Food food=Food.valueOf(value);
			list = tourList.stream().filter(s->s.getFood().equals(food)).collect(Collectors.toList());
			//list.forEach(System.out::println);
			break;
		case REGION: Region region=Region.valueOf(value);
			list = tourList.stream().filter(s->s.getRegion().equals(region)).collect(Collectors.toList());
			//list.forEach(System.out::println);
			break;
		case TRANSPORT: Transport transport=Transport.valueOf(value);
			list = tourList.stream().filter(s->s.getTransport().equals(transport)).collect(Collectors.toList());
			//list.forEach(System.out::println);
			break;
		case TYPE: Type type=Type.valueOf(value);
			list = tourList.stream().filter(s->s.getType().equals(type)).collect(Collectors.toList());
			//list.forEach(System.out::println);
			break;
		case DAY: int i=(int)Integer.valueOf(value);
			list = tourList.stream().filter(s->s.getDay()==i).collect(Collectors.toList());
			//list.forEach(System.out::println);
		break;
}
			
			if (list.size()>0) {
				switch(cmdToSort) {
				case FOOD:
					list=list.stream().sorted((o1,o2)->o1.getFood().toString().compareTo(o2.getFood().toString())).collect(Collectors.toList());
//					list.forEach(System.out::println);
					break;
				case REGION:
					list=list.stream().sorted((o1,o2)->o1.getRegion().toString().compareTo(o2.getRegion().toString())).collect(Collectors.toList());
//					list.forEach(System.out::println);
					break;
				case TRANSPORT:
					list=list.stream().sorted((o1,o2)->o1.getTransport().toString().compareTo(o2.getTransport().toString())).collect(Collectors.toList());
//					list.forEach(System.out::println);
					break;
				case TYPE:
					list=list.stream().sorted((o1,o2)->o1.getType().toString().compareTo(o2.getType().toString())).collect(Collectors.toList());
//					list.forEach(System.out::println);
					break;
				case DAY:
					list.sort((Tour t1, Tour t2)->((Integer)t1.getDay()).compareTo(((Integer)t2.getDay())));
//					list.forEach(System.out::println);
					break;
				}
				System.out.println("Found by "+cmd.toString()+" ="+value+", sorted by "+cmdToSort);
				list.forEach(System.out::println);
			}
	} catch(IllegalArgumentException e) {
		System.out.println("Incorrect parameters in find method:"+e.getMessage());
	}
	
	
}




}
