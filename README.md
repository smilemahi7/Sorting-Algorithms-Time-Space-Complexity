# Sorting-Algorithms-Time-Space-Complexity

**Sorting Algorithms:**
	
	Sorting is arranging the elements in a specific order. This order can be increasing or decreasing. It makes searching of elements in easy and quick.

	The efficiency and performance of Sorting algorithm depends on 2 parameters:

		1. Time Complexity:
		
			The amount of time an algorithm takes to run as a function of length of input.
			
			"Time complexity" is typically expressed using "Big-O" notation because it describes the upper bound of an algorithm's runtime, which is the most commonly used metric for comparing algorithm efficiency, whereas Omega notation represents the lower bound and Theta notation represents the exact bound. 
			
			Key points about "Big-O" notation:
				Big-O notation usually focuses on the worst-case scenario, meaning it tells you how long an algorithm could potentially take to run for a given input size.
				Developers are often most concerned with the potential worst-case performance of an algorithm, Big-O notation provides a valuable tool for comparing and analyzing different algorithms.
				
			Types of Time Complexity:
				1. Constant Time: - O(1)
					The execution time is constant and does not change with the size of the input.
					Example - Accessing an array element.
				2. Logarithmic Time: - O(log n)
					The execution time grows logarithmically as the input size increases.
					Example - Binary search.
				3. Linear Time: - O(n)
					The execution time grows linearly with the input size. 
					Example - Finding max in an array.
				4. Linearithmic Time: - O(n log n)
					Common in efficient sorting algorithms like mergesort and heapsort. 
					Example - Merge sort.
				5. Quadratic Time: - O(n^2)
					The execution time grows quadratically with the input size, common in algorithms with nested loops. 
					Example - Bubble sort.
				6. Exponential Time: - O(2^n)
					The execution time doubles with each additional element in the input, typical of certain recursive algorithms.
					Example - Recursive Fibonacci.
				7. Factorial Time: - O(n!)
					It complexity grows extremely fast with the increase in input size and is generally unsustainable even for relatively small n.
					Example - Generating permutations.
			
		2. Space Complexity:
		
			The amount of memory an algorithm takes to execute completely.
			
			Space complexity is composed of two main components: fixed part and variable part.

				1. Fixed Part: - O(1)
					This includes the space required for constants, simple variables, fixed-size data structures, and the code itself. It is the memory that does not change regardless of the input size.
					Examples:
						Space needed for storing constants like numbers or fixed-size arrays.
						Memory used by the program code and instructions.

				2. Variable Part: - O(n)
					This includes the space required for dynamic memory allocation, recursive stack space, and temporary variables whose size depends on the input size.
					Examples:
						Space needed for dynamic data structures like linked lists, trees, or graphs, which grow with the input size.
						Memory used for the recursion stack during recursive function calls.
						Temporary variables and data structures used during the execution of the algorithm.
						
			Types of Space Complexity:
				1. Constant Space: - O(1)
					The execution space is constant and does not change with the size of the input.
					Example - Finding max in an array.
				2. Logarithmic Space: - O(log n)
					The execution space grows logarithmically as the input size increases.
					Example - Binary search recursion depth.
				3. Linear Space: - O(n)
					The execution space grows linearly with the input size. 
					Example - Storing a list of n elements.
				4. Linearithmic Space: - O(n log n)
					Common in efficient sorting algorithms like mergesort and heapsort. 
					Example - Merge sort.
				5. Quadratic Space: - O(n^2)
					The execution space grows quadratically with the input size, common in algorithms with nested loops. 
					Example - 2D matrix operations.
				6. Exponential Space: - O(2^n)
					The execution space doubles with each additional element in the input, typical of certain recursive algorithms.
					Example - Subset sum problem using recursion.
				7. Factorial Space: - O(n!)
					It complexity grows extremely fast with the increase in input size and is generally unsustainable even for relatively small n.
					Example - Generating all permutations of a string.
     

**There are many sorting algorithms in Java. Here, we are doing only commonly used "6 types of Sorting" algorithms:**

		1. Bubble Sort:
			This algorithm is the simplest sorting algorithm in which we compare the adjacent elements and swap them if they are not in the correct order. This algorithm is suitable only for small data sets. It is a stable sorting algorithm.
			Comparing both the loops and move the largest values in the last place and move on to smallest values in the first place.
			
			Program:					

				int arr[] = {64, 34, 25, 12, 22, 11, 90};

				for (int i = 0; i < arr.length - 1; i++) {
					for (int j = 0; j < arr.length - i - 1; j++) {
						if (arr[j] > arr[j + 1]) {
							int temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}
				for (int val : arr) {
					System.out.print(val + " ");
				}
						
			Time Complexity:
				Best - O(n)				
				Average	- O(n2)
				Worst - O(n2) - (Means "n square")
			Space Complexity: O(1)
			Stability: Yes			
		
		
		2. Selection Sort:
			This algorithm, first we find the smallest element and swap it with the first element. This way we get the smallest element at its correct position. Then we find the smallest among remaining elements (or second smallest) and swap it with the second element. We keep doing this until we get all elements moved to correct position.
			It is a comparison-based sorting algorithm. It sorts an array by repeatedly selecting the smallest (or largest) element from the unsorted portion and swapping it with the first unsorted element. This process continues until the entire array is sorted.
			
			Program:
				
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
			
			Time Complexity:
				Best - O(n2)				
				Average	- O(n2)
				Worst - O(n2)
			Space Complexity: O(1)
			Stability: No
			
			
		3. Insertion Sort:
			This algorithm divides an array into two subarrays: sorted and unsorted. However, in this case, the sorted subarray initially contains the first element. The algorithm iterates over the unsorted subarray and puts the elements at the correct position in the sorted part.
			It is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
			We start with second element of the array as first element in the array is assumed to be sorted.
			Compare second element with the first element and check if the second element is smaller then swap them.
			Move to the third element and compare it with the first two elements and put at its correct position
			Repeat until the entire array is sorted.
			
			Program:
				
				int arr[] = {23, 1, 10, 5, 2};

				for (int i = 1; i < arr.length; i++) {
					int key = arr[i];
					int j = i - 1;

					/* Move elements of arr[0..i-1], that are
					   greater than key, to one position ahead
					   of their current position */
					while (j >= 0 && arr[j] > key) {
						arr[j + 1] = arr[j];
						j = j - 1;
					}
					arr[j + 1] = key;
				}
				for (int i : arr) {
					System.out.print(i + " ");
				}
			
			Time Complexity:
				Best - O(n)				
				Average	- O(n2)
				Worst - O(n2)
			Space Complexity: O(1)
			Stability: Yes
			
			
		4. Merge Sort:
			This algorithm is one of the most efficient sorting algorithms that follows the divide-and-conquer strategy. This technique divides the original array into ‘n’ subarrays, each of one size sorted trivially. These subarrays are then repeatedly merged to form the sorted array.
			The process of merge sort is to divide the array into two halves, sort each half, and then merge the sorted halves back together. This process is repeated until the entire array is sorted.
			
			Step-By-Step explanation of how merge sort works:
				Divide: Divide the list or array recursively into two halves until it can no more be divided.
				Conquer: Each subarray is sorted individually using the merge sort algorithm.
				Merge: The sorted subarrays are merged back together in sorted order. The process continues until all elements from both subarrays have been merged.
				
			Example: Let’s sort the array or list [38, 27, 43, 10] using Merge Sort.
				Divide:
					[38, 27, 43, 10]  is divided into  [38, 27] and  [43, 10]. 
					[38, 27]  is divided into  [38]  and  [27]. 
					[43, 10]  is divided into  [43]  and  [10]. 
				Conquer:
					[38]  is already sorted. 
					[27]  is already sorted. 
					[43]  is already sorted. 
					[10]  is already sorted. 
				Merge:
					Merge  [38]  and  [27]  to get  [27, 38]. 
					Merge  [43]  and  [10]  to get  [10,43]. 
					Merge  [27, 38]  and  [10,43]  to get the final sorted list  [10, 27, 38, 43] 
				
				Therefore, the sorted list is  [10, 27, 38, 43]. 
			
			Program:
			
				public static void main(String[] args) {
					int arr[] = {12, 11, 13, 5, 6, 7};
					sort(arr, 0, arr.length - 1);
					System.out.println("Sorted array is:");
					printArray(arr);
				}
				static void sort(int arr[], int l, int r)
				{
					if (l < r) {
						// Find the middle point
						int m = l + (r - l) / 2;
						// Sort first and second halves
						sort(arr, l, m);
						sort(arr, m + 1, r);
						// Merge the sorted halves
						merge(arr, l, m, r);
					}
				}
				static void merge(int arr[], int l, int m, int r)
				{
					// Find sizes of two subarrays to be merged
					int n1 = m - l + 1;
					int n2 = r - m;
					// Create temp arrays
					int L[] = new int[n1];
					int R[] = new int[n2];
					// Copy data to temp arrays
					for (int i = 0; i < n1; ++i)
						L[i] = arr[l + i];
					for (int j = 0; j < n2; ++j)
						R[j] = arr[m + 1 + j];
					// Merge the temp arrays
					// Initial indices of first and second subarrays
					int i = 0, j = 0;
					// Initial index of merged subarray array
					int k = l;
					while (i < n1 && j < n2) {
						if (L[i] <= R[j]) {
							arr[k] = L[i];
							i++;
						}
						else {
							arr[k] = R[j];
							j++;
						}
						k++;
					}
					// Copy remaining elements of L[] if any
					while (i < n1) {
						arr[k] = L[i];
						i++;
						k++;
					}
					// Copy remaining elements of R[] if any
					while (j < n2) {
						arr[k] = R[j];
						j++;
						k++;
					}
				}
				static void printArray(int arr[])
				{
					for (int i = 0; i < arr.length; ++i)
						System.out.print(arr[i] + " ");
					System.out.println();
				}					
			
			Time Complexity:
				Best - O(n log n)				
				Average	- O(n log n)
				Worst - O(n log n)
			Space Complexity: O(n)
			Stability: Yes
			
			
		5. Quick Sort:
			This algorithm is a quite complex sorting technique; it follows a divide-and-conquer strategy similar to merge sort. It chooses an element as a pivot and partitions the array around it. All the elements less than the pivot are moved to the left side and the greater elements to the right side. Then, recursive sorting of these subarrays takes place until the entire array is sorted.
			
			QuickSort works on the principle of divide and conquer, breaking down the problem into smaller sub-problems.
			There are mainly 3 steps in the algorithm:
				1. Choose a Pivot: Select an element from the array as the pivot. The choice of pivot can vary (e.g., first element, last element, random element, or median).
				2. Partition the Array: Rearrange the array around the pivot. After partitioning, all elements smaller than the pivot will be on its left, and all elements greater than the pivot will be on its right. The pivot is then in its correct position, and we obtain the index of the pivot.
				3. Recursively Call: Recursively apply the same process to the two partitioned sub-arrays (left and right of the pivot).
				Base Case: The recursion stops when there is only one element left in the sub-array, as a single element is already sorted.
			
			Program:
			
				public static void main(String[] args) {

					int[] arr = {10, 7, 8, 9, 1, 5};
					quickSort(arr, 0, arr.length - 1);
					for (int val : arr) {
						System.out.print(val + " ");
					}
				}
				// The QuickSort function implementation
				static void quickSort(int[] arr, int low, int high) {
					if (low < high) {
						// pi is the partition return index of pivot
						int pi = partition(arr, low, high);
						// Recursion calls for smaller elements
						// and greater or equals elements
						quickSort(arr, low, pi - 1);
						quickSort(arr, pi + 1, high);
					}
				}
				static int partition(int[] arr, int low, int high) {
					// Choose the pivot
					int pivot = arr[high];
					// Index of smaller element and indicates
					// the right position of pivot found so far
					int i = low - 1;
					// Traverse arr[low..high] and move all smaller
					// elements to the left side. Elements from low to
					// i are smaller after every iteration
					for (int j = low; j <= high - 1; j++) {
						if (arr[j] < pivot) {
							i++;
							swap(arr, i, j);
						}
					}
					// Move pivot after smaller elements and
					// return its position
					swap(arr, i + 1, high);
					return i + 1;
				}
				// Swap function
				static void swap(int[] arr, int i, int j) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}					
			
			Time Complexity:
				Best - O(n log n)				
				Average	- O(n log n)
				Worst - O(n2)
			Space Complexity: O(n log n)
			Stability: No
			
			
		6. Heap Sort:
			This algorithm converts the original array either into a min-heap or a max-heap. Then it repeatedly extracts the minimum or maximum elements from the heap and places them accordingly.
			Where we first find the max (or min) element and swap it with the last (or first). We repeat the same process for the remaining elements.
			
			Heap Sort Algorithm:
				First convert the array into a max heap using heapify, Please note that this happens in-place. The array elements are re-arranged to follow heap properties. Then one by one delete the root node of the Max-heap and replace it with the last node and heapify. Repeat this process while size of heap is greater than 1.

				1. Rearrange array elements so that they form a Max Heap.
				2. Repeat the following steps until the heap contains only one element:
					a. Swap the root element of the heap (which is the largest element in current heap) with the last element of the heap.
					b. Remove the last element of the heap (which is now in the correct position). We mainly reduce heap size and do not remove element from the actual array.
					c. Heapify the remaining elements of the heap.
				3. Finally we get sorted array.
			
			Detailed Working of Heap Sort:
				Step 1: Treat the Array as a Complete Binary Tree
				We first need to visualize the array as a complete binary tree. For an array of size n, the root is at index 0, the left child of an element at index i is at 2i + 1, and the right child is at 2i + 2.
				Step 2: Build a Max Heap.
				Step 3: Sort the array by placing largest element at end of unsorted array.
			
			Program:
				
				public static void main(String[] args) {

					int arr[] = {9, 4, 3, 8, 10, 2, 5};
					heapSort(arr);
					System.out.println("Sorted array is: ");
					printArray(arr);
				}
				// Main function to do heap sort
				static void heapSort(int arr[]) {
					int n = arr.length;
					// Build heap (rearrange array)
					for (int i = n / 2 - 1; i >= 0; i--) {
						heapify(arr, n, i);
					}
					// One by one extract an element from heap
					for (int i = n - 1; i > 0; i--) {
						// Move current root to end
						int temp = arr[0];
						arr[0] = arr[i];
						arr[i] = temp;
						// Call max heapify on the reduced heap
						heapify(arr, i, 0);
					}
				}
				// To heapify a subtree rooted with node i
				// which is an index in arr[].
				static void heapify(int arr[], int n, int i) {
					// Initialize largest as root
					int largest = i;
					// left index = 2*i + 1
					int l = 2 * i + 1;
					// right index = 2*i + 2
					int r = 2 * i + 2;
					// If left child is larger than root
					if (l < n && arr[l] > arr[largest]) {
						largest = l;
					}
					// If right child is larger than largest so far
					if (r < n && arr[r] > arr[largest]) {
						largest = r;
					}
					// If largest is not root
					if (largest != i) {
						int temp = arr[i];
						arr[i] = arr[largest];
						arr[largest] = temp;
						// Recursively heapify the affected sub-tree
						heapify(arr, n, largest);
					}
				}
				// A utility function to print array of size n
				static void printArray(int arr[]) {
					for (int i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();
				}
			
			Time Complexity:
				Best - O(n log n)				
				Average	- O(n log n)
				Worst - O(n log n)
			Space Complexity: O(1)
			Stability: No
