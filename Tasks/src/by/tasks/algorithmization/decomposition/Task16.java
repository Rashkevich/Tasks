package by.tasks.algorithmization.decomposition;

public class Task16 {

//	16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//	Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
	
	public static int findEndNum(int n) {
		int endNum=0;
		for(int i=1;i<=n;i++) {
			endNum=endNum*10+9;
		}
		
		return endNum;
	}
	
	public static int findStartNum(int n) {
		int start=(int)Math.pow(10.0, (n-1));
		return start;
	}
	
	public static int sumOdd(int start, int end) {
		int sum=0;
		int count=0;
		for (int i=start;i<=end;i++) {
			if (i%2!=0) {
				sum=sum+i;
			} 
		}
		return sum;
	}
	
	public static int countEvenNum(int sum) {
		int count=0;
		while(sum!=0) {
			int number=sum%10;
			if ((number%2==0)&&(number!=0)) {
				count++;
			}
			sum=sum/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int n=1;
		int start=findStartNum(n);
		int end=findEndNum(n);
		int sum=sumOdd(start,end);
		System.out.println("Сумма n - значных чисел, содержащих только нечетные цифр:"+sum);
		int count=countEvenNum(sum);
		System.out.println(count+" четных цифры в найденной сумме");
	}


}
