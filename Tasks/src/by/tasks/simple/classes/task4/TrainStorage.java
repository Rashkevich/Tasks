package by.tasks.simple.classes.task4;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TrainStorage {
	private Train[] storage;
	
	public void setTrains(Train ...tr) {
		storage=tr;
	}
	
	
	public Train[] sortTrainByNum() {
		Comparator<Train> comp=new Comparator<Train>() {
			
			@Override
			public int compare(Train o1, Train o2) {
				
				return Integer.compare(o1.getNumber(),o2.getNumber());
			}
		};
			Arrays.sort(storage,comp);
		return storage;
	}
	
	
	public Train[] sortTrainByTime() {
		Comparator<Train> comp=new Comparator<Train>() {
			
			@Override
			public int compare(Train o1, Train o2) {
				int first=o1.getTime().getMinute()+60*o1.getTime().getHour()+60*24*o1.getTime().getDayOfYear();
				int second=o2.getTime().getMinute()+60*o2.getTime().getHour()+60*24*o2.getTime().getDayOfYear();
				return Integer.compare(first, second);
			}
		};
			Arrays.sort(storage,comp);
		return storage;
	}
	
	
	public void print() {
		for (Train t:storage) {
			System.out.println(t.getNumber());
		}
	}
	
	
	public void trainInfoByNum(int num) {
		boolean hasTrain=false;
		for (Train t:storage) {
			if (t.getNumber()==num) {
				hasTrain=true;
				System.out.println(" Train number:"+t.getNumber()+" Destination:"+t.getDestination()+" time:"+t.getTime());
			} 
		}

		if (!hasTrain){
			System.out.println("There is no such train");
		}
		System.out.println("--------------------");
	}
	
	public void trainInfoByDestination(String destination) {
		sortTrainByTime();
		for (Train t:storage) {
			if (t.getDestination().equals(destination)) {
				System.out.println(" Train number:"+t.getNumber()+" Destination:"+t.getDestination()+" time:"+t.getTime());
			}
		}
		System.out.println("--------------------");
	}
	
}
