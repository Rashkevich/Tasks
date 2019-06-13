package by.tasks.algorithmization.array.sort;

//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента i i+1 a и a . Если +1  i i a a , то продвигаются
//на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class Task61 {

	public static void main(String a[])  
    {  
        //Numbers which are to be sorted  
        int n[] = {88,33,77,55,99,22,11,66,44};  
        //Displays the numbers before sorting  
        System.out.print("Before sorting, numbers are ");  
        for(int i = 0; i < n.length; i++)  
          {  
            System.out.print(n[i]+" ");  
          }  
        System.out.println();  
        //Sorting in ascending order using Shell Sort  
        initializemergeSort(n);  
        //Displaying the numbers after sorting  
        System.out.print("After sorting, numbers are ");  
        for(int i = 0; i < n.length; i++)  
          {  
            System.out.print(n[i]+" ");  
          }  
    }  
    public static void initializemergeSort(int n[])   
    {  
        int i1,i,j,increment,temp, no_of_elem=n.length;  
        /* Shell Sort Program */  
        for (increment=no_of_elem/2;increment>0;increment/=2)  
        {  
            for(i=increment;i<no_of_elem;i++)  
            {  
                temp=n[i];  
                for(j=i;j>=increment;j-=increment)   
                {  
                    if(temp<n[j-increment])  
                    {  
                        n[j]=n[j-increment];  
                    }  
                    else   
                    {  
                        break;  
                    }  
                }  
                n[j] = temp;  
            }  
        }  
    } 

}
