package by.tasks.simple.classes.task3;

public class StudentStorage {

	
	public void pritnMarkBetween(int i, int j, Student...st) {
		for (int b=0;b<st.length;b++) {
			boolean hasMark=true;
			int arr[]=new int[5];
			arr=st[b].getProgress();
			for (int k=0;k<arr.length;k++) {
				if ((arr[k]<i)||(arr[k]>j)){
					hasMark=false;
				}
			}
			if (hasMark) {
				System.out.println("Name:"+st[b].getName()+" group:"+st[b].getGroup()+" has marks:"+i+"-"+j);
			}
		}
	}
}
