package by.tasks.simple.classes.aggregation.task5;

public class Tour {
private Region region;
private Type type;
private String description;
private Transport transport;
private Food food;
private int day;

public Tour(Region region, Type type, String description, Transport transport, Food food, int day) {
	this.region = region;
	this.type = type;
	this.description = description;
	this.transport = transport;
	this.food = food;
	this.day = day;
}

public Region getRegion() {
	return region;
}

public void setRegion(Region region) {
	this.region = region;
}

public Type getType() {
	return type;
}

public void setType(Type type) {
	this.type = type;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Transport getTransport() {
	return transport;
}

public void setTransport(Transport transport) {
	this.transport = transport;
}

public Food getFood() {
	return food;
}

public void setFood(Food food) {
	this.food = food;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

@Override
public String toString() {
	return "Tour [region=" + region + ", type=" + type + ", description=" + description + ", transport=" + transport
			+ ", food=" + food + ", day=" + day + "]";
}



}
