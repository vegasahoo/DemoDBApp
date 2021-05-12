package test;

public class InsertionSort {
	
	public void sort(int[] arr) {
		for(int i =1; i<arr.length;i++) {
			int j = i-1;
			int key = arr[i];
			while(j>=0 && arr[j]>key ) {
				arr[j+1] = arr[j];
				j--;	
			}
			arr[j+1] =key;			
		}
	}
	
	public static void main(String[] args) {
		InsertionSort iso = new InsertionSort();
		int[] a = {4,3,2,10,12,1,5,6};
		
		iso.sort(a);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
