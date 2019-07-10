package by.tasks.simple.classes.aggregation.task5;

public enum Type {
REST("Rest"),
EXCURSION("Excursion"),
TREATMENT("Treatment"),
SHOPPING("Shopping"),
CRUISE("Cruise");
	
private String type;

Type(String type){
		this.type=type;
}

@Override
public String toString() {
	return type;
}

}
