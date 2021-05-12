package test;

public class SelectionSort {
	
	public void sort(int[] arr) {
		
		for(int i =0 ;i< arr.length;i++) {
			int min = i;
			for(int j=i;j<arr.length;j++){
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int  temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort s = new SelectionSort();
		int[] a = {64,25,12,22,11};
		
		s.sort(a);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	

}
