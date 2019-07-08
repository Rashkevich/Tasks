package by.tasks.simple.classes.aggregation.task3;

public class StateRunner {

	public static void main(String[] args) {
		State state=new State("Minsk");
		Region regionGrodno=new Region("Grodno");
		Region regionBrest=new Region("Brest");
		Region regionVitebsk=new Region("Vitebsk");
		
		SmallRegion srPinsk=new SmallRegion();
		SmallRegion srMosty=new SmallRegion();
		SmallRegion srVolkovisk=new SmallRegion();
		SmallRegion srPolotsk=new SmallRegion();
		
		srPinsk.add("Pinsk");
		srPinsk.add("Pinkovichi");
		srPinsk.setSquare(3261);
		srMosty.add("Mosty");
		srMosty.add("Peski");
		srMosty.setSquare(1300);
		srVolkovisk.add("Volkovisk");
		srVolkovisk.add("Izabelin");
		srVolkovisk.setSquare(1192);
		srPolotsk.add("Polotsk");
		srPolotsk.add("Solonicky");
		srPolotsk.setSquare(3179);
		
		regionGrodno.add(srVolkovisk);
		regionGrodno.add(srMosty);
		regionBrest.add(srPinsk);
		regionVitebsk.add(srPolotsk);
		
		state.add(regionVitebsk);
		state.add(regionBrest);
		state.add(regionGrodno);
		
		state.printState();
	}

}
