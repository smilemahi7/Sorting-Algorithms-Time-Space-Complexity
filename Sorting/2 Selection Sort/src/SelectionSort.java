
public class SelectionSort {

    public static void main(String[] args) {
		int arr[] = {64, 34, 25, 12, 22, 11, 90};

		for (int i = 0; i < arr.length - 1; i++) {
			int min_idx = i;        // the minimum element
			for (int j = i + 1; j < arr.length; j++) {      // to find the actual minimum
				if (arr[j] < arr[min_idx]) {
					min_idx = j;        // Update min_idx if a smaller element is found
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_idx];
			arr[min_idx] = temp;
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}       
    }
}
