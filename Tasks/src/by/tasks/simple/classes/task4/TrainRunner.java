package by.tasks.simple.classes.task4;


import java.time.LocalDateTime;

public class TrainRunner {

	public static void main(String[] args) {
		TrainStorage ts=new TrainStorage();
		Train tr1=new Train("London", 382852, LocalDateTime.parse("2019-02-20T16:30:00"));
		Train tr2=new Train("Minsk", 484851, LocalDateTime.parse("2019-01-20T07:30:00"));
		Train tr3=new Train("Brest", 435942, LocalDateTime.parse("2019-02-20T08:30:00"));
		Train tr4=new Train("London", 368597, LocalDateTime.parse("2019-02-20T09:30:00"));
		Train tr5=new Train("London", 875641, LocalDateTime.parse("2019-02-20T10:30:00"));
		ts.setTrains(tr1,tr2,tr3,tr4,tr5);
		ts.sortTrainByNum();
		ts.print();
		ts.trainInfoByNum(484851);
		ts.trainInfoByDestination("London");
	}

}
