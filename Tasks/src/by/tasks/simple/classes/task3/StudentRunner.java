package by.tasks.simple.classes.task3;

public class StudentRunner {

	public static void main(String[] args) {
		StudentStorage storage=new StudentStorage(); 
		
		int marksOne[]={9,10,9,10,9};
		int marksTwo[]={9,10,9,10,9};
		int marksThree[]={3,10,9,10,9};
		int marksFour[]={2,10,9,10,9};
		int marksFive[]={7,10,9,10,9};
		
		Student stOne=new Student(1, "Popov", "A.L.", 114361,marksOne);
		Student stTwo=new Student(2, "Gromov", "T.S.", 114341,marksTwo);
		Student stThree=new Student(3, "Johnson", "A.H.", 114321,marksThree);
		Student stFour=new Student(4, "Ace", "M.S.", 114341,marksFour);
		Student stFive=new Student(0, "Vint", "O.F.", 114341,marksFive);
		
		
		storage.pritnMarkBetween(9, 10, stOne,stTwo,stThree, stFour, stFive);
	}

}
