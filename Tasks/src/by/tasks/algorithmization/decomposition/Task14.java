package by.tasks.algorithmization.decomposition;

	
//	14. Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр,
//	возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. Для решения задачи
//	использовать декомпозицию.
	
public class Task14 {
	
	public static void main(String...ey) {
		int k=10000;
		isArmsrong(k);
	}
	
	public static void prnt(int a[]) {
		for (int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void isArmsrong(int k) {
		for (int i=0;i<=k;i++) {
				int a[]=summingNumber(i);
				//prnt(a);
				double pow=numberPow(a);
				if (pow==i) {
					System.out.println("Число "+i+" является числом Армстронга");
				}
		}
	}

    private static double numberPow(int[] a) {
    	double pow=0;
    	for (int i=0;i<a.length;i++) {
    		pow=pow+Math.pow(a[i], a.length);
    		//System.out.print(a[i]+" ");
    	}
    	//System.out.println();
		return pow;
	}


	public static int[] summingNumber(int j) {
	   int sum=0;
	   int count=0;
	   int num=j;
	   while(num!=0) {
		  sum=sum+num%10;
		  num=num/10;
		  count++;
	   }
	   int a[]=new int[count];
	   count=0;
	   num=j;
	   sum=0;
	   while(num!=0) {
			  a[count]=num%10;
			  num=num/10;
			  count++;
		   }
	return a;
    }
}
