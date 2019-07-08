package by.tasks.simple.classes.aggregation.task2;

public class CarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wheel wheel=new WheelBridgeStone("R19 summer");
		Engine engine=new EngineVW("2.0TSi");
		CarImplVW carImplVW=new CarImplVW();
		carImplVW.setWheel(wheel);
		carImplVW.setEngine(engine);
		carImplVW.drive();
		carImplVW.fuel();
		carImplVW.getEngine().printModel();
		carImplVW.getWheel().changeWheel();;
		
	}

}
