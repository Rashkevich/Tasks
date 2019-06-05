package by.tasks.basics.cycles;

public class Task5 {

	public static void main(String[] args) {
		double e=0.1;
		
		int infinity=Integer.MAX_VALUE;
		
		double result=calcMember(0);
		double resultOld=result;
		
		for (int j=1;j<infinity;j++) {
			result=result+calcMember(j);
			double modul=Math.abs(result-resultOld);
			
			if (modul<(0.00000000001)) {
				break;
			}
			resultOld=result;
		}
		
		
		if (result<e) {
			System.out.println("There is no such sum >="+e);
		} else {
			int i=0;
			result=calcMember(0);
			while (result<e) {
				i++;
				result=result+calcMember(i);
			}
			System.out.println("There is sum "+result+">="+e+" i="+i);
		}
			
		
	}
	
	public static double calcMember(int n) {
		return 1/(Math.pow(2, n))+1/(Math.pow(3, n));
	}
	
	public static double calcMember(double n) {
		return 1/(Math.pow(2, n))+1/(Math.pow(3, n));
	}

}
