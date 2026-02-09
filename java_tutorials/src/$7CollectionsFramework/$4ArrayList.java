package $7CollectionsFramework;

public class $4ArrayList {

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
			System.out.println("Fruit from iterator: " + iterator.next()); // output: Grape, Honeydew
		}
		
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
		System.out.println("New Array: " + java.util.Arrays.toString(newArray)); // output: [Kiwi, Lemon]
		
		// Iterating using forEach method
		newList.forEach(fruit -> System.out.println("Fruit from forEach: " + fruit)); // output: Kiwi, Lemon
		
		// End of main method
		

	}

}
