package by.tasks.simple.classes.task4;

import java.time.LocalDate;
import java.time.LocalDateTime;

//4. �������� ����� Train, ���������� ����: 
//�������� ������ ����������, ����� ������, ����� �����������. 
//�������� ������ � ������ �� ���� ��������� ���� Train, 
//�������� ����������� ���������� ��������� ������� �� ������� �������. 
//�������� ����������� ������ ���������� � ������, ����� �������� ������ �������������. 
//�������� ����������� ���������� ������ �� ������ ����������, ������ ������ � 
//����������� �������� ���������� ������ ���� ����������� �� ������� �����������.

public class Train {
	private String destination;
	private int number;
	private LocalDateTime time;
	
	public Train(String destination, int number, LocalDateTime time) {
		this.destination = destination;
		this.number = number;
		this.time = time;
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

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
}
