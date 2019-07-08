package by.tasks.simple.classes.aggregation.task2;

public class CarImplVW  implements Car{
private String modelname="VW Passat";
private Engine engine;
private Wheel wheel;

@Override
public void drive() {
	System.out.println("VW dirves");
	
}

@Override
public void fuel() {
	System.out.println("VW is fueled");
	
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public Wheel getWheel() {
	return wheel;
}

public void setWheel(Wheel wheel) {
	this.wheel = wheel;
}



}
