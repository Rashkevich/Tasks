package by.tasks.simple.classes.task8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomerStorage {
private ArrayList<Customer> list=new ArrayList<Customer>();

public boolean add(Customer c) {
	list.add(c);
	return true;
}

public void sort() {
	Comparator<Customer> comp=new Comparator<Customer>() {

		@Override
		public int compare(Customer o1, Customer o2) {
			int res = String.CASE_INSENSITIVE_ORDER.compare(o1.getSurname(), o2.getSurname());
	        if (res == 0) {
	            res = o1.getSurname().compareTo(o2.getSurname());
	        }
	        return res;
		}
		
	};
	Collections.sort(list, comp);
}

public void cardInRange(long a, long b) {
	list.stream()
	.filter(s->(s.getCardNumber()>=a)&&(s.getCardNumber()<=b))
	.forEach(System.out::println);
}

public void print() {
	list.forEach(System.out::println);
	System.out.println("------------------------------");
}

}
