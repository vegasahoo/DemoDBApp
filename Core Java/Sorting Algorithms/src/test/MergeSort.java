package test;

public class MergeSort {
	
	public void sort(int[] arr, int l, int r) {
		if(l<r) {
			int mid = l+(r-l)/2;
			sort(arr, l, mid);
			sort(arr,mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	public void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid-l+1;
		int n2 = r-mid;
		
		int[] L = new int[n1];
		int[] R  = new int[n2];
		
		
		for(int i =0; i<n1;i++) {
			L[i] = arr[l+i];
		}
		
		for(int i = 0; i<n2; i++) {
			R[i] = arr[mid+1+i];
		}
		
		int i = 0, j  = 0;
		int k = l;
		
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = L[i];
			k++;
			i++;
		}
		while(j<n2) {
			arr[k] = R[j];
			k++;
			j++;
		}
	}
	
	public static void main(String[] args) {
		
		MergeSort ms = new MergeSort();
		int[] a = {4,3,2,10,12,1,5,6};
		ms.sort(a,0,a.length-1);
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
