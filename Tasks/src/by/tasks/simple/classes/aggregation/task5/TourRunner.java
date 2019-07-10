package by.tasks.simple.classes.aggregation.task5;

public class TourRunner {

	public static void main(String[] args) {
		Tour t1=new Tour(Region.MONTENEGRO, Type.REST, "Seaside Ulquin reviera", Transport.AIRPLAIN, Food.UAI, 15);
		Tour t2=new Tour(Region.MONTENEGRO, Type.REST, "Sea coast, Rafailovichi", Transport.AIRPLAIN, Food.FB, 9);
		Tour t3=new Tour(Region.GERMANY, Type.EXCURSION, "Berlin museums", Transport.BUS, Food.HB, 3);
		Tour t4=new Tour(Region.GREECE, Type.CRUISE, "Круиз по средиземному морю", Transport.TRAIN, Food.AI, 3);
		Tour t5=new Tour(Region.POLAND, Type.SHOPPING, "Шопинг по Белостоку", Transport.BUS, Food.NO, 2);
		Tour t6=new Tour(Region.FINLAND, Type.EXCURSION, "Sea coast, Rafailovichi", Transport.TRAIN, Food.FB, 10);
		Tour t7=new Tour(Region.UKRAINE, Type.TREATMENT, "Лечение в Прикарпатье", Transport.TRAIN, Food.HB, 11);
		Tour t8=new Tour(Region.MONTENEGRO, Type.TREATMENT, "Sea coast, Rafailovichi, treatment", Transport.AIRPLAIN, Food.HB, 10);
		//System.out.println(t1);
		TourStorage storage=new TourStorage();
		storage.add(t1);
		storage.add(t2);
		storage.add(t3);
		storage.add(t4);
		storage.add(t5);
		storage.add(t6);
		storage.add(t7);
		storage.add(t8);
		
		storage.find(Command.DAY, "10", Command.REGION);//параметр по которому искать, значение параметра поиска, параметр сортировки
		storage.find(Command.REGION, "MONTENEGRO", Command.DAY);
	}

}
