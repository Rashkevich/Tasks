package by.tasks.simple.classes.task8;

public class CustomerRunner {

	public static void main(String[] args) {
		Customer c1=new Customer(1, "Vovilov", "Vlad", "Vitalievich","Pritickogo, 12",1234123412341234L,4321432143214321L);
		Customer c2=new Customer(2, "Domingo", "Danila", "Dovnarovich","Nezavisimosti, 22",5443869001153211L,1235946782156812L);
		Customer c3=new Customer(3, "Rashod", "Boris", "Nickolaevich","Leschinskogo, 3",5555444466667891L,1111222233334444L);
		Customer c4=new Customer(4, "Vovilov", "Vlad", "Vitalievich","Gedroica, 122",1234098237490787L,4545454545455612L);
		Customer c5=new Customer(5, "Lubimov", "Linur", "Ahmedovich","Shirockaya, 18",3333333333333331L,2354569875142356L);
		
		CustomerStorage storage=new CustomerStorage();
		storage.add(c1);
		storage.add(c2);
		storage.add(c3);
		storage.add(c4);
		storage.add(c5);
		
		storage.sort();
		storage.print();
		
		storage.cardInRange(1111111111111111L, 4300000000000000L);
	}

}
