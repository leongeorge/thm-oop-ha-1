import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
		int [] arr = {3, 5,  1};
		sort(arr, 1, 2);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static int partition(int arr[], int l, int r) {
		int pivot = arr[r];				// Pivot-Element
		int m = arr[0];					   // erstes Element im Array
		
		for(int i = l; i < r; i++) {
			if (arr[i] <= pivot) {
				int value = arr[i];
				arr[m] = arr[i];
				arr[i] = value;
				m++;
			}
		}
		int value = arr[m+1];
		arr[m+1] = arr[r];
		arr[r] = value;
		return m+1;
	}
	
	public static void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = partition(arr, l, r);
			sort(arr, l, m-1);
			sort(arr, m+1, r);
		}
	}
}
