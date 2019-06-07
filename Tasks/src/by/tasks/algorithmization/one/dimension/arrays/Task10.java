package by.tasks.algorithmization.one.dimension.arrays;


//10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9};
		for (int i=0;i<a.length;i++) {
			if((i+1)%2==0) {
				a[i]=0;
			}
		}
		
		for (int i=0;i<a.length;i++) {
			for (int j=i+2;j<a.length;j++) {
				a[j-1]=a[j];
				a[j]=0;
			}
		}
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
	}
}
