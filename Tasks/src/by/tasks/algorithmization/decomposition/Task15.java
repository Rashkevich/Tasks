package by.tasks.algorithmization.decomposition;

//15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую
//последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию

public class Task15 {

	public static void main(String[] args) {
		int n=4;
		int endNum=findEndNum(n);
		for(int i=0;i<=endNum;i++) {
			if(check(i)) {
			System.out.println("цифры в числе образуют строго возрастающую последовательность "+i);	
			}
		}

	}

	public static boolean check(int i) {//проверка возрастающей последовательности цифр
		int num=i;
		boolean isAsc=false;
		isAsc=i<=9?true:false;
		if (i>9) {
			while(num!=0) {
				int  second=num%10; //System.out.println("second "+second);
				int first=(num/10)%10; //System.out.println("first "+first);
				if (second>first) {
					isAsc=true;
				}else {
					isAsc=false;
					break;
				}
				num=num/10;
			}
		}
		return isAsc;
	}

	public static int findEndNum(int n) {
		int endNum=0;
		for(int i=1;i<=n;i++) {
			endNum=endNum*10+9;
		}
		
		return endNum;
	}

}
