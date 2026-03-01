package $15Collections;

public class $2ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using ArrayList
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println("ArrayList: " + list); // output: [Apple, Banana, Cherry]
		
		// Accessing elements by index
		System.out.println("Element at index 1: " + list.get(1)); // output: Banana
		
		// Iterating through the ArrayList
		for (String fruit : list) {
			System.out.println("Fruit: " + fruit); // output: Apple, Banana, Cherry
		}
		
		// Removing an element by index
		list.remove(0);
		System.out.println("ArrayList after removal: " + list); // output: [Banana, Cherry]
		
		// Size of the ArrayList
		System.out.println("Size of ArrayList: " + list.size()); // output: 2
		
		// Adding an element at a specific index
		list.add(1, "Date");
		System.out.println("ArrayList after adding at index 1: " + list); // output: [Banana, Date, Cherry]
		
		// Updating an element at a specific index
		list.set(0, "Blueberry");
		System.out.println("ArrayList after updating index 0: " + list); // output: [Blueberry, Date, Cherry]
		
		// Finding the index of an element
		System.out.println("Index of Cherry: " + list.indexOf("Cherry")); // output: 2
		// Clearing the ArrayList
		list.clear();
		System.out.println("ArrayList after clearing: " + list); // output: []
		
		// Checking if ArrayList is empty
		System.out.println("Is ArrayList empty: " + list.isEmpty()); // output: true
		// Converting ArrayList to array
		list.add("Elderberry");
		list.add("Fig");
		Object[] array = list.toArray();
		System.out.println("Array: " + java.util.Arrays.toString(array)); // output: [Elderberry, Fig]
		// Adding all elements from another ArrayList
		java.util.ArrayList<String> anotherList = new java.util.ArrayList<>();
		anotherList.add("Grape");
		anotherList.add("Honeydew");
		list.addAll(anotherList);
		System.out.println("ArrayList after adding another ArrayList: " + list); // output: [Elderberry, Fig, Grape, Honeydew]
		// Sorting the ArrayList
		java.util.Collections.sort(list);
		System.out.println("Sorted ArrayList: " + list); // output: [Elderberry, Fig, Grape, Honeydew]
		
		// Removing all elements present in another ArrayList
		list.removeAll(anotherList);
		System.out.println("ArrayList after removing another ArrayList: " + list); // output: [Elderberry, Fig]
		
		// Checking if ArrayList contains all elements of another ArrayList
		System.out.println("Contains all from another ArrayList: " + list.containsAll(anotherList)); // output: false
		
		// Creating a new ArrayList from another ArrayList
		java.util.ArrayList<String> newList = new java.util.ArrayList<>(anotherList);
		System.out.println("New ArrayList: " + newList); // output: [Grape, Honeydew]
		
		// Iterating using iterator
		java.util.Iterator<String> iterator = newList.iterator();
		while (iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println("Fruit from iterator: " + fruit); // output: Grape, Honeydew
		}
		
		// Using lambda expression to iterate
		newList.forEach(fruit -> System.out.println("Fruit from lambda: " + fruit)); // output: Grape, Honeydew
		
		// Using method reference to iterate
		newList.forEach(System.out::println); // output: Grape, Honeydew
		// Checking if ArrayList contains an element
		System.out.println("Contains Fig: " + list.contains("Fig")); // output: true
		// Size of the new ArrayList
		System.out.println("Size of new ArrayList: " + newList.size()); // output: 2
		// Clearing the new ArrayList
		newList.clear();
		System.out.println("New ArrayList after clearing: " + newList); // output: []
			
		// Checking if new ArrayList is empty
		System.out.println("Is new ArrayList empty: " + newList.isEmpty()); // output: true
		
		// Converting new ArrayList to array
		newList.add("Kiwi");
		newList.add("Lemon");
		Object[] newArray = newList.toArray();
		// Displaying the new array
		System.out.println("New Array: " + java.util.Arrays.toString(newArray)); // output: [Kiwi, Lemon
		
		// Iterating using forEach method
		newList.forEach(fruit -> System.out.println("Fruit from forEach: " + fruit)); // output: Kiwi, Lemon
		
		// Sorting the new ArrayList
		java.util.Collections.sort(newList);
		System.out.println("Sorted new ArrayList: " + newList); // output: [Kiwi, Lemon]
		
		// Reversing the new ArrayList
		java.util.Collections.reverse(newList);
		System.out.println("Reversed new ArrayList: " + newList); // output: [Lemon, Kiwi]
		
		// Shuffling the new ArrayList
		java.util.Collections.shuffle(newList);
		System.out.println("Shuffled new ArrayList: " + newList); // output: [Kiwi, Lemon] or [Lemon, Kiwi]
			// Finding the maximum element in the new ArrayList
		String max = java.util.Collections.max(newList);
		System.out.println("Max element in new ArrayList: " + max); // output: Lemon
		
		// Finding the minimum element in the new ArrayList
		String min = java.util.Collections.min(newList);
		System.out.println("Min element in new ArrayList: " + min); // output: Kiwi
		
		// Swapping elements in the new ArrayList
		java.util.Collections.swap(newList, 0, 1);
		System.out.println("New ArrayList after swapping: " + newList); // output: [Lemon, Kiwi] or [Kiwi, Lemon]
		
		// Rotating the new ArrayList
		java.util.Collections.rotate(newList, 1);
		System.out.println("New ArrayList after rotating: " + newList); // output: [Kiwi, Lemon] or [Lemon, Kiwi]
		
		// Replacing all occurrences of an element in the new ArrayList
		java.util.Collections.replaceAll(newList, "Kiwi", "Mango");
		System.out.println("New ArrayList after replacing Kiwi with Mango: " + newList); // output: [Mango, Lemon] or [Lemon, Mango]
		
		// Frequency of an element in the new ArrayList
		int frequency = java.util.Collections.frequency(newList, "Mango");
		System.out.println("Frequency of Mango in new ArrayList: " + frequency); // output: 1
		
		// Copying elements from one ArrayList to another
		java.util.ArrayList<String> sourceList = new java.util.ArrayList<>();
		sourceList.add("Pineapple");
		sourceList.add("Mango");
		java.util.ArrayList<String> destList = new java.util.ArrayList<>();
		destList.addAll(sourceList);
		System.out.println("Destination ArrayList after copying: " + destList); // output: [Pineapple, Mango]
		
		// Clearing the destination ArrayList
		destList.clear();
		System.out.println("Destination ArrayList after clearing: " + destList); // output: []
		
		// Checking if destination ArrayList is empty
		System.out.println("Is destination ArrayList empty: " + destList.isEmpty()); // output: true
		
		// Converting destination ArrayList to array
		destList.add("Strawberry");
		destList.add("Watermelon");
		Object[] destArray = destList.toArray();
		System.out.println("Destination Array: " + java.util.Arrays.toString(destArray)); // output: [Strawberry, Watermelon]
		
		// Iterating using forEach method on destination ArrayList
		destList.forEach(fruit -> System.out.println("Fruit from destination ArrayList: " + fruit)); // output: Strawberry, Watermelon
		
		// Sorting the destination ArrayList
		java.util.Collections.sort(destList);
		System.out.println("Sorted destination ArrayList: " + destList); // output: [Strawberry, Watermelon]
		
		// Reversing the destination ArrayList
		java.util.Collections.reverse(destList);
		System.out.println("Reversed destination ArrayList: " + destList); // output: [Watermelon, Strawberry]
	
		// Shuffling the destination ArrayList
		java.util.Collections.shuffle(destList);
		System.out.println("Shuffled destination ArrayList: " + destList); // output: [Strawberry, Watermelon] or [Watermelon, Strawberry]
		
		// Finding the maximum element in the destination ArrayList
		String destMax = java.util.Collections.max(destList);
		System.out.println("Max element in destination ArrayList: " + destMax); // output: Watermelon
		
		// Finding the minimum element in the destination ArrayList
		String destMin = java.util.Collections.min(destList);
		System.out.println("Min element in destination ArrayList: " + destMin); // output: Strawberry
		
		// Swapping elements in the destination ArrayList
		java.util.Collections.swap(destList, 0, 1);
		System.out.println("Destination ArrayList after swapping: " + destList); // output: [Watermelon, Strawberry] or [Strawberry, Watermelon]
		
		// Rotating the destination ArrayList
		java.util.Collections.rotate(destList, 1);
		System.out.println("Destination ArrayList after rotating: " + destList); // output: [Strawberry, Watermelon] or [Watermelon, Strawberry]
		
		// Replacing all occurrences of an element in the destination ArrayList
		java.util.Collections.replaceAll(destList, "Strawberry", "Blueberry");
		System.out.println("Destination ArrayList after replacing Strawberry with Blueberry: " + destList); // output: [Blueberry, Watermelon] or [Watermelon, Blueberry]
		
		// Frequency of an element in the destination ArrayList
		int destFrequency = java.util.Collections.frequency(destList, "Blueberry");
		System.out.println("Frequency of Blueberry in destination ArrayList: " + destFrequency); // output: 1
		
		// Copying elements from one ArrayList to another using Collections.copy
		java.util.ArrayList<String> copyDestList = new java.util.ArrayList<>();
		copyDestList.addAll(sourceList);
		java.util.Collections.copy(copyDestList, sourceList);
		System.out.println("Copy destination ArrayList after copying: " + copyDestList); // output: [Pineapple, Mango]
		
		// Clearing the copy destination ArrayList
		copyDestList.clear();
		System.out.println("Copy destination ArrayList after clearing: " + copyDestList); // output: []
		
		// Checking if copy destination ArrayList is empty
		System.out.println("Is copy destination ArrayList empty: " + copyDestList.isEmpty()); // output: true
		
		// Converting copy destination ArrayList to array
		copyDestList.add("Papaya");
		copyDestList.add("Guava");
		Object[] copyDestArray = copyDestList.toArray();
		System.out.println("Copy destination Array: " + java.util.Arrays.toString(copyDestArray)); // output: [Papaya, Guava]
		
		// Iterating using forEach method on copy destination ArrayList
		copyDestList.forEach(fruit -> System.out.println("Fruit from copy destination ArrayList: " + fruit)); // output: Papaya, Guava
		
		// Sorting the copy destination ArrayList
		java.util.Collections.sort(copyDestList);
		System.out.println("Sorted copy destination ArrayList: " + copyDestList); // output: [Guava, Papaya]
		
		// Reversing the copy destination ArrayList
		java.util.Collections.reverse(copyDestList);
		System.out.println("Reversed copy destination ArrayList: " + copyDestList); // output: [Papaya, Guava]
		
		// Shuffling the copy destination ArrayList
		java.util.Collections.shuffle(copyDestList);
		System.out.println("Shuffled copy destination ArrayList: " + copyDestList); // output: [Guava, Papaya] or [Papaya, Guava]
		
		
	}

}
