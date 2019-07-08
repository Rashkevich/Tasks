package by.tasks.simple.classes.task10;

public class AirlineRunner {
public static void main(String[] args) {
	Fly fly1=new Fly("21:30:10",Week.MONDAY);
	Fly fly2=new Fly("15:00:10",Week.THURSDAY);
	Fly fly3=new Fly("08:00:10",Week.FRIDAY);
	Airline pl1=new Airline("PRAGUE", 120001, "Airbus A310", fly1,fly2,fly3);
	
	Fly fly4=new Fly("20:30:10",Week.THURSDAY);
	Fly fly5=new Fly("14:00:10",Week.WEDNESDAY);
	Fly fly6=new Fly("07:00:10",Week.SATURDAY);
	Airline pl2=new Airline("BRUSSELS", 220117, "Airbus A330", fly4,fly5,fly6);
	
	Fly fly7=new Fly("19:30:10",Week.MONDAY);
	Fly fly8=new Fly("13:00:10",Week.THURSDAY);
	Fly fly9=new Fly("06:00:10",Week.SUNDAY);
	Airline pl3=new Airline("ODESSA", 320150, "Airbus A330", fly7,fly8,fly9);
	
	Fly fly10=new Fly("18:30:10",Week.THURSDAY);
	Fly fly11=new Fly("12:00:10",Week.TUESDAY);
	Fly fly12=new Fly("05:00:10",Week.SATURDAY);
	Airline pl4=new Airline("TASHKENT", 567333, "Boeing-747", fly10,fly11,fly12);
	
	Fly fly13=new Fly("17:30:10",Week.FRIDAY);
	Fly fly14=new Fly("11:00:10",Week.MONDAY);
	Fly fly15=new Fly("04:00:10",Week.THURSDAY);
	Airline pl5=new Airline("BRUSSELS", 648777, "Boeing-747", fly13,fly14,fly15);
	
	AirlineStorage storage=new AirlineStorage();
	storage.add(pl1);
	storage.add(pl2);
	storage.add(pl3);
	storage.add(pl4);
	storage.add(pl5);
	
	storage.listByDestination("TASHKENT");
	storage.listByDayOfWeek("Суббота");
	storage.listByDayOfWeek("Суббота","04:00:10");
}
}
