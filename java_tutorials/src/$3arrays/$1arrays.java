package $3arrays;

public class $1arrays {

	public static void main(String[] args) {
		
		// Single-Dimensional Array
		int[] singleDimArray = {10, 20, 30, 40, 50};
		System.out.println("Single-Dimensional Array:");
		for (int i = 0; i < singleDimArray.length; i++) {
			System.out.println("Element at index " + i + ": " + singleDimArray[i]);
		}

		// Multi-Dimensional Array
		int[][] multiDimArray = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		System.out.println("\nMulti-Dimensional Array:");
		for (int i = 0; i < multiDimArray.length; i++) {
			for (int j = 0; j < multiDimArray[i].length; j++) {
				System.out.print(multiDimArray[i][j] + " ");
			}
			System.out.println();
		}
		// Jagged Array
		int[][] jaggedArray = {
			{1, 2, 3},
			{4, 5},
			{6, 7, 8, 9}
		};
		System.out.println("\nJagged Array:");
		for (int i = 0; i < jaggedArray.length; i++) {
			for (int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}
		// Enhanced For Loop
		System.out.println("\nEnhanced For Loop on Single-Dimensional Array:");
		for (int element : singleDimArray) {
			System.out.println("Element: " + element);
		}
		// Array Length
		System.out.println("\nLength of Single-Dimensional Array: " + singleDimArray.length);
		// Array Copy
		int[] copiedArray = new int[singleDimArray.length];
		System.arraycopy(singleDimArray, 0, copiedArray, 0, singleDimArray.length);
		System.out.println("\nCopied Array:");
		for (int element : copiedArray) {
			System.out.println("Element: " + element);
		}
		// Array Initialization
		int[] initializedArray = new int[5];
		System.out.println("\nInitialized Array:");
		for (int i = 0; i < initializedArray.length; i++) {
			System.out.println("Element at index " + i + ": " + initializedArray[i]);
		}
		// Array of Objects
		String[] stringArray = {"Java", "Python", "C++"};
		System.out.println("\nArray of Objects:");
		for (String str : stringArray) {
			System.out.println("Element: " + str);
		}
			
		// Command-Line Arguments
		System.out.println("\nCommand-Line Arguments:");
		for (String arg : args) {
			System.out.println("Argument: " + arg);
		}
			// Sparse Array
		int[][] sparseArray = new int[5][5];
		sparseArray[0][1] = 10;
		sparseArray[2][3] = 20;
		System.out.println("\nSparse Array:");
		 for (int i = 0; i < sparseArray.length; i++) {
			for (int j = 0; j < sparseArray[i].length; j++) {
				System.out.print(sparseArray[i][j] + " ");
			}
			System.out.println();
		}
		 // Array Sorting
		 java.util.Arrays.sort(singleDimArray);
		 System.out.println("\nSorted Single-Dimensional Array:");
		 for (int element : singleDimArray) {
			 System.out.println("Element: " + element);
			 
			 // Array Searching
			 int index = java.util.Arrays.binarySearch(singleDimArray, 30);
			 System.out.println("\nIndex of element 30 in Single-Dimensional Array: " + index);
			 
			 // Multi-Dimensional Array Traversal
			 System.out.println("\nMulti-Dimensional Array Traversal:");
			 for (int[] row : multiDimArray) {
				 for (int element1 : row) {
					 System.out.print(element1 + " ");
				 }
				 System.out.println();
			 }
			 // Dynamic Array Creation
			 int n = 5;
			 	int[] dynamicArray = new int[n];
			 	for (int i = 0; i < n; i++) {
			 		dynamicArray[i] = i * 10;
			 	}
			 	System.out.println("\nDynamic Array Creation:");
			 	for (int element2 : dynamicArray) {
			 		System.out.println("Element2: " + element2);
			 	}
			 	// Array Cloning
			 	int[] clonedArray = singleDimArray.clone();
			 	System.out.println("\nCloned Array:");
			 	for (int element3 : clonedArray) {
			 		System.out.println("Element3: " + element3);
			 	}
			 	// Array Fill
			 	int[] fillArray = new int[5];
			 	java.util.Arrays.fill(fillArray, 7);
			 	System.out.println("\nArray after Fill:");
			 	for (int element4 : fillArray) {
			 		System.out.println("Element4: " + element4);
			 	}
			 	
			 	// Multi-Dimensional Jagged Array
			 	int[][] multiJaggedArray = new int[3][];
			 	multiJaggedArray[0] = new int[2];
			 	multiJaggedArray[1] = new int[3];
			 	multiJaggedArray[2] = new int[1];
			 	multiJaggedArray[0][0] = 1;
			 	multiJaggedArray[0][1] = 2;
			 	multiJaggedArray[1][0] = 3;
			 	multiJaggedArray[1][1] = 4;
			 	multiJaggedArray[1][2] = 5;
			 	multiJaggedArray[2][0] = 6;
			 	System.out.println("\nMulti-Dimensional Jagged Array:");
			 	for (int i = 0; i < multiJaggedArray.length; i++) {
			 		for (int j = 0; j < multiJaggedArray[i].length; j++) {
			 			System.out.print(multiJaggedArray[i][j] + " ");
			 		}
			 		System.out.println();
			 	}
			 		
			 	// Array Reference
			 	int[] referenceArray = singleDimArray;
			 	System.out.println("\nArray Reference:");
			 	for (int element5 : referenceArray) {
			 		System.out.println("Element5: " + element5);
			 	}
			 		// Array Iteration using java.util.Iterator
			 	System.out.println("\nArray Iteration using java.util.Iterator:");
			 	java.util.List<Integer> arrayList = new java.util.ArrayList<>();
			 	for (int element5 : singleDimArray) {
			 		arrayList.add(element5);
			 	}
			 	java.util.Iterator<Integer> iterator = arrayList.iterator();
			 	while (iterator.hasNext()) {
			 		System.out.println("Element: " + iterator.next());
			 	}
			 	// Array Conversion to String
			 	String arrayString = java.util.Arrays.toString(singleDimArray);
			 	System.out.println("\nArray Conversion to String: " + arrayString);
			 	
			 	// Multi-Dimensional Array Initialization
			 	int[][] initMultiDimArray = new int[][] {
			 		{11, 12, 13},
			 		{14, 15, 16},
			 		{17, 18, 19}
			 	};
			 	System.out.println("\nMulti-Dimensional Array Initialization:");
			 	for (int i = 0; i < initMultiDimArray.length; i++) {
			 		for (int j = 0; j < initMultiDimArray[i].length; j++) {
			 			System.out.print(initMultiDimArray[i][j] + " ");
			 		}
			 		System.out.println();
			 	}
			 	
		 }
	}

}
