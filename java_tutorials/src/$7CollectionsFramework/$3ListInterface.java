package $7CollectionsFramework;

public class $3ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using List interface
		java.util.List<String> list = new java.util.ArrayList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		System.out.println("List: " + list); // output: [Java, Python, C++]
		
		// Accessing elements by index
		System.out.println("Element at index 1: " + list.get(1)); // output: Python
		
		// Iterating through the list
		for (String lang : list) {
			System.out.println("Language: " + lang);// output: Java, Python, C++
		}
		
		// Checking if list contains an element
		System.out.println("Contains C++: " + list.contains("C++")); // output: true
		
		// Removing an element by index
		list.remove(0);
		System.out.println("List after removal: " + list); // output: [Python, C++]
		
		// Size of the list
		System.out.println("Size of list: " + list.size()); // output: 2
		
		// Adding an element at a specific index
		list.add(1, "JavaScript");
		System.out.println("List after adding at index 1: " + list); // output: [Python, JavaScript, C++]
		
		// Updating an element at a specific index
		list.set(0, "Ruby");
		System.out.println("List after updating index 0: " + list); // output: [Ruby, JavaScript, C++]
		
		// Finding the index of an element
		System.out.println("Index of C++: " + list.indexOf("C++")); // output: 2
		
		// Clearing the list
		list.clear();
		System.out.println("List after clearing: " + list); // output: []
		
		// Checking if list is empty
		System.out.println("Is list empty: " + list.isEmpty()); // output: true
		
		// Converting list to array
		list.add("Go");
		list.add("Swift");
		Object[] array = list.toArray();
		System.out.println("Array: " + java.util.Arrays.toString(array)); // output: [Go, Swift]
		
		// Adding all elements from another list
		java.util.List<String> anotherList = new java.util.ArrayList<>();
		anotherList.add("Kotlin");
		anotherList.add("Scala");
		list.addAll(anotherList);
		System.out.println("List after adding another list: " + list); // output: [Go, Swift, Kotlin, Scala]
		
		// Retaining only elements present in another list
		list.retainAll(anotherList);
		System.out.println("List after retaining another list: " + list); // output: [Kotlin, Scala]
		
		// Removing all elements present in another list
		list.removeAll(anotherList);
		System.out.println("List after removing another list: " + list); // output: []
		
		// Checking if list contains all elements of another list
		System.out.println("Contains all from another list: " + list.containsAll(anotherList	)); // output: false
		
		// Creating a new list from another list
		java.util.List<String> newList = new java.util.ArrayList<>(anotherList);
		System.out.println("New List: " + newList); // output: [Kotlin, Scala]
		
		// Iterating using iterator
		java.util.Iterator<String> iterator = newList.iterator();
		while (iterator.hasNext()) {
			System.out.println("Language from iterator: " + iterator.next()); // output: Kotlin, Scala
		}
		
		// Iterating using list iterator
		java.util.ListIterator<String> listIterator = newList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println("Language from list iterator: " + listIterator.next()); // output: Kotlin, Scala
		}
		
		// Iterating in reverse using list iterator
		while (listIterator.hasPrevious()) {
			System.out.println("Language from reverse list iterator: " + listIterator.previous()); // output: Scala, Kotlin
		}
		
		// Sublist from the list
		java.util.List<String> subList = newList.subList(0, 1);
		System.out.println("Sublist: " + subList); // output: [Kotlin]
		
		// Sorting the list
		java.util.Collections.sort(newList);
		System.out.println("Sorted List: " + newList); // output: [Kotlin, Scala]
		 
		// Reversing the list
		java.util.Collections.reverse(newList);
		System.out.println("Reversed List: " + newList); // output: [Scala, Kotlin]
		
		//	 Shuffling the list
		java.util.Collections.shuffle(newList);
		System.out.println("Shuffled List: " + newList); // output: [Kotlin, Scala] or [Scala, Kotlin]
		
		// Finding maximum and minimum elements
		System.out.println("Max element: " + java.util.Collections.max(newList)); // output: Scala
		System.out.println("Min element: " + java.util.Collections.min(newList)); // output: Kotlin
		
		// Frequency of an element
		System.out.println("Frequency of Kotlin: " + java.util.Collections.frequency(newList, "Kotlin"));
		
		// Replacing all occurrences of an element
		java.util.Collections.replaceAll(newList, "Kotlin", "Java"); // 
		System.out.println("List after replacing Kotlin with Java: " + newList); // output: [Java, Scala] or [Scala, Java]
		
		// Swapping elements
		java.util.Collections.swap(newList, 0, 1);
		System.out.println("List after swapping elements: " + newList); // output: [Scala, Java] or [Java, Scala]
		
		// Rotating the list
		java.util.Collections.rotate(newList, 1);
		System.out.println("List after rotating: " + newList); // output: [Java, Scala] or [Scala, Java]
		
		// Filling the list with a specific value
		java.util.Collections.fill(newList, "C#");
		System.out.println("List after filling with C#: " + newList); // output: [C#, C#]
		
		// Copying elements from one list to another
		java.util.List<String> sourceList = new java.util.ArrayList<>();
		sourceList.add("HTML");
		sourceList.add("CSS");
		java.util.Collections.copy(newList, sourceList);
		System.out.println("List after copying from source list: " + newList); // output: [HTML, CSS]
		
		// Checking if two lists are disjoint
		java.util.List<String> disjointList = new java.util.ArrayList<>();
		disjointList.add("JavaScript");
		disjointList.add("TypeScript");
		System.out.println("Are lists disjoint: " + java.util.Collections.disjoint(newList, disjointList)); // output: true
		
		// Creating a synchronized list
		java.util.List<String> synchronizedList = java.util.Collections.synchronizedList(newList);
		System.out.println("Synchronized List: " + synchronizedList); // output: [HTML, CSS]
		
		// Creating an unmodifiable list
		java.util.List<String> unmodifiableList = java.util.Collections.unmodifiableList(newList);
		System.out.println("Unmodifiable List: " + unmodifiableList); // output: [HTML, CSS]
		
		// Note: Attempting to modify unmodifiableList will throw UnsupportedOperationException
		
		// Creating a list using List.of (Java 9+)
		java.util.List<String> fixedList = java.util.List.of("Node.js", "Django", "Flask");
		System.out.println("Fixed List: " + fixedList); // output: [Node.js, Django, Flask]
		
		// Note: fixedList is immutable, attempting to modify it will throw UnsupportedOperationException
		
		// Creating a list using Arrays.asList
		java.util.List<String> arrayList = java.util.Arrays.asList("React", "Angular", "Vue");
		System.out.println("Array List: " + arrayList); // output: [React, Angular, Vue]
		
		// Note: arrayList has fixed size, attempting to add or remove elements will throw UnsupportedOperationException
		
		// End of List interface examples
		
		// End of main method
		
		
		
		
		
		
		
		
	}
}
