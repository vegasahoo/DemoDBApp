package test;

public class BubbleSort {
	
	public void sort(int[] arr) {
		for(int i =1;i<arr.length;i++) {
			for(int j = 0; j<i;j++) {
				if(arr[j]>arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] =temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int[] a = {4,3,2,10,12,1,5,6};
		bs.sort(a);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
