package by.tasks.simple.classes.task10;


import java.util.ArrayList;

//10. ������� ����� Airline, ������������ �������� ��������� ����. 
//���������� ������������, set- � get- ������ � ����� toString(). 
//������� ������ �����, ������������ ������ ���� Airline, 
//� ����������� �������������� � ��������. 
//������ �������� ������ ������ � ������� ��� ������ �� �������.
//Airline: ����� ����������, ����� �����, ��� ��������, ����� ������, ��� ������.
//����� � �������:
//a) ������ ������ ��� ��������� ������ ����������;
//b) ������ ������ ��� ��������� ��� ������;
//c) ������ ������ ��� ��������� ��� ������, ����� ������ ��� ������� ������ ���������.

public class Airline {
private String destination;
private int number;
private String type;
private Fly flyList[];

public Airline(String destination, int number, String type, Fly...flyList) {
	this.destination = destination;
	this.number = number;
	this.type = type;
	this.flyList = flyList;
}

public String getDestination() {
	return destination;
}

public void setDestination(String destination) {
	this.destination = destination;
}

public int getNumber() {
	return number;
}

public void setNumber(int number) {
	this.number = number;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Fly[] getFlyList() {
	return flyList;
}

public void setFlyList(Fly[] flyList) {
	this.flyList = flyList;
}

@Override
public String toString() {
	String s="Airline [destination=" + destination + ", number=" + number + ", type=" + type+"]";
	for (Fly fly:flyList) {
		s=s+"\n Day: "+fly.getDay().getTitle()+" Time:"+fly.getTime();
	}
	return s;
}

 

}
