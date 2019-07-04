package by.tasks.simple.classes.task4;

import java.time.LocalDate;
import java.time.LocalDateTime;

//4. Создайте класс Train, содержащий поля: 
//название пункта назначения, номер поезда, время отправления. 
//Создайте данные в массив из пяти элементов типа Train, 
//добавьте возможность сортировки элементов массива по номерам поездов. 
//Добавьте возможность вывода информации о поезде, номер которого введен пользователем. 
//Добавьте возможность сортировки массив по пункту назначения, причем поезда с 
//одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

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
