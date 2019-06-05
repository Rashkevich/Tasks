package by.tasks.basics.branches;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int conerOne=89;
		int conerTwo=90;
		
		int sumConers=conerOne+conerTwo;
		
		if ((conerOne>0)&(conerOne<180)){
			if ((conerTwo>0)&(conerTwo<180)) {
				if(sumConers<180) {
					System.out.println("Triangle exists");
					 if ((conerOne==90)|(conerTwo==90)) {
							System.out.println("Right triangle");
						}
				} else {
					System.out.println("Trinangle doesn't extist");
				}
			}
		}
	}

}
