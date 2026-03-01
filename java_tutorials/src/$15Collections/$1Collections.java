package $15Collections;

public class $1Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using java.util.Collections
		java.util.List<String> list = new java.util.ArrayList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Cherry");
		System.out.println("Original List: " + list); // output: [Banana, Apple, Cherry]
		
		// Sorting the list
		java.util.Collections.sort(list);
		System.out.println("Sorted List: " + list); // output: [Apple, Banana, Cherry]
		
		// Shuffling the list
		java.util.Collections.reverse(list);
		System.out.println("Reversed List: " + list); // output: [Cherry, Banana, Apple]
		
		// Finding the maximum element
		String max = java.util.Collections.max(list);
		System.out.println("Max element: " + max); // output: Cherry
		
		// Finding the minimum element
		String min = java.util.Collections.min(list);
		System.out.println("Min element: " + min); // output: Apple
		
		// Swapping elements in the list
		java.util.Collections.swap(list, 0, 1);
		System.out.println("List after swapping: " + list); // output: [Banana, Cherry, Apple]
		
		// Reversing the list
		java.util.Collections.reverse(list);
		System.out.println("List after reversing: " + list); // output: [Apple, Cherry, Banana]
		
		// Filling the list with a specific value
		java.util.Collections.fill(list, "Grape");
		System.out.println("List after filling with Grape: " + list); // output: [Grape, Grape, Grape]
		
		// Frequency of an element
		int frequency = java.util.Collections.frequency(list, "Grape");
		System.out.println("Frequency of Grape: " + frequency); // output: 3
		
		// Replacing all occurrences of an element
		java.util.Collections.replaceAll(list, "Grape", "Orange");
		System.out.println("List after replacing Grape with Orange: " + list); // output: [Orange, Orange, Orange]
		
		// Rotating the list
		java.util.Collections.rotate(list, 1);
		System.out.println("List after rotating: " + list); // output: [Orange, Orange, Orange]
		
		// Copying elements from one list to another
		java.util.List<String> sourceList = new java.util.ArrayList<>();
		sourceList.add("Pineapple");
		sourceList.add("Mango");
		java.util.List<String> destList = new java.util.ArrayList<>();
		destList.addAll(sourceList);
		System.out.println("Destination List after copying: " + destList); // output: [Pineapple, Mango]
		
		// Disjoint check between two collections
		boolean disjoint = java.util.Collections.disjoint(list, destList);
		System.out.println("Are the two lists disjoint? " + disjoint); // output: true
		
		// Finding the index of an element in the list
		int index = java.util.Collections.indexOfSubList(list, destList);
		System.out.println("Index of sublist in the list: " + index); // output: -1 (since destList is not a sublist of list)
		
		// Finding the last index of an element in the list
		int lastIndex = java.util.Collections.lastIndexOfSubList(list, destList);
		System.out.println("Last index of sublist in the list: " + lastIndex); // output: -1 (since destList is not a sublist of list)
		
		// Finding the frequency of an element in the list
		int frequencyOfOrange = java.util.Collections.frequency(list, "Orange");
		System.out.println("Frequency of Orange: " + frequencyOfOrange); // output: 3
		
		// Creating a synchronized list
		java.util.List<String> synchronizedList = java.util.Collections.synchronizedList(list);
		System.out.println("Synchronized List: " + synchronizedList); // output: [Orange, Orange, Orange]
		
		// Creating an unmodifiable list
		java.util.List<String> unmodifiableList = java.util.Collections.unmodifiableList(list);
		System.out.println("Unmodifiable List: " + unmodifiableList); // output: [Orange, Orange, Orange]
		
		// Creating a singleton list
		java.util.List<String> singletonList = java.util.Collections.singletonList("Singleton");
		System.out.println("Singleton List: " + singletonList); // output: [Singleton]	
		
		// Creating a synchronized map
		java.util.Map<String, Integer> synchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap<>());
		synchronizedMap.put("One", 1);
		synchronizedMap.put("Two", 2);
		System.out.println("Synchronized Map: " + synchronizedMap); // output: {One=1, Two=2}
		
		// Creating an unmodifiable map
		java.util.Map<String, Integer> unmodifiableMap = java.util.Collections.unmodifiableMap(synchronizedMap);
		System.out.println("Unmodifiable Map: " + unmodifiableMap); // output: {One=1, Two=2}	
		
		// Creating a singleton map
		java.util.Map<String, Integer> singletonMap = java.util.Collections.singletonMap("Key", 100);
		System.out.println("Singleton Map: " + singletonMap); // output: {Key=100}
		
		// Creating a synchronized set
		java.util.Set<String> synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet<>());
		synchronizedSet.add("Red");
		synchronizedSet.add("Green");
		System.out.println("Synchronized Set: " + synchronizedSet); // output: [Red, Green]
		
		// Creating an unmodifiable set
		java.util.Set<String> unmodifiableSet = java.util.Collections.unmodifiableSet(synchronizedSet);
		System.out.println("Unmodifiable Set: " + unmodifiableSet); // output: [Red, Green]
		
		// Creating a singleton set
		java.util.Set<String> singletonSet = java.util.Collections.singleton("Singleton");
		System.out.println("Singleton Set: " + singletonSet); // output: [Singleton]
		
		// Creating a synchronized list from an array
		String[] array = {"A", "B", "C"};
		java.util.List<String> synchronizedListFromArray = java.util.Collections.synchronizedList(java.util.Arrays.asList(array));
		System.out.println("Synchronized List from Array: " + synchronizedListFromArray); // output: [A, B, C]
		
		// Creating an unmodifiable list from an array
		java.util.List<String> unmodifiableListFromArray = java.util.Collections.unmodifiableList(java.util.Arrays.asList(array));
		System.out.println("Unmodifiable List from Array: " + unmodifiableListFromArray); // output: [A, B, C]
		
		// Creating a synchronized set from an array
		java.util.Set<String> synchronizedSetFromArray = java.util.Collections.synchronizedSet(new java.util.HashSet<>(java.util.Arrays.asList(array)));
		System.out.println("Synchronized Set from Array: " + synchronizedSetFromArray); // output: [A, B, C]
		
		// Creating an unmodifiable set from an array
		java.util.Set<String> unmodifiableSetFromArray = java.util.Collections.unmodifiableSet(new java.util.HashSet<>(java.util.Arrays.asList(array)));
		System.out.println("Unmodifiable Set from Array: " + unmodifiableSetFromArray); // output: [A, B, C]
		
		// Creating a synchronized map from an array
		java.util.Map<String, Integer> synchronizedMapFromArray = java.util.Collections.synchronizedMap(new java.util.HashMap<>());
		for (int i = 0; i < array.length; i++) {
			synchronizedMapFromArray.put(array[i], i);
		}
		System.out.println("Synchronized Map from Array: " + synchronizedMapFromArray); // output: {A=0, B=1, C=2}
		
		// Creating an unmodifiable map from an array
		java.util.Map<String, Integer> unmodifiableMapFromArray = java.util.Collections.unmodifiableMap(synchronizedMapFromArray);
		System.out.println("Unmodifiable Map from Array: " + unmodifiableMapFromArray); // output: {A=0, B=1, C=2}
		
		// End of main method
		// End of Collections class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
