package $7CollectionsFramework;

public class $2CollectionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using Collection interface
		java.util.Collection<String> collection = new java.util.ArrayList<>();
		collection.add("Java");
		collection.add("Python");
		collection.add("C++");
		System.out.println("Collection: " + collection); // output: [Java, Python, C++]
		
		// Iterating through the collection
		for (String lang : collection) {
			System.out.println("Language: " + lang);
		}
		
		// Checking if collection contains an element
		System.out.println("Contains Python: " + collection.contains("Python")); // output: true
		
		// Removing an element
		collection.remove("C++");
		System.out.println("Collection after removal: " + collection); // output: [Java, Python]
		
		// Size of the collection
		System.out.println("Size of collection: " + collection.size()); // output: 2
		
		// Clearing the collection
		collection.clear();
		System.out.println("Collection after clearing: " + collection); // output: []
		
		// Checking if collection is empty
		System.out.println("Is collection empty: " + collection.isEmpty()); // output: true
		
		// Converting collection to array
		collection.add("JavaScript");
		collection.add("Ruby");
		Object[] array = collection.toArray();
		System.out.println("Array: " + java.util.Arrays.toString(array)); // output: [JavaScript, Ruby]
		
		// Adding all elements from another collection
		java.util.Collection<String> anotherCollection = new java.util.ArrayList<>();
		anotherCollection.add("Go");
		anotherCollection.add("Swift");
		collection.addAll(anotherCollection);
		System.out.println("Collection after adding another collection: " + collection); // output: [JavaScript, Ruby, Go, Swift]
		
		// Retaining only elements present in another collection	
		collection.retainAll(anotherCollection);
		System.out.println("Collection after retaining another collection: " + collection); // output: [Go, Swift]
		
		// Removing all elements present in another collection
		collection.removeAll(anotherCollection);
		System.out.println("Collection after removing another collection: " + collection); // output: []
		
		// Checking if collection contains all elements of another collection
		System.out.println("Contains all from another collection: " + collection.containsAll(anotherCollection)); // output: false
		
		// Creating a new collection from another collection
		java.util.Collection<String> newCollection = new java.util.ArrayList<>(anotherCollection);
		System.out.println("New Collection: " + newCollection); // output: [Go, Swift]
		
		// Iterating using iterator
		java.util.Iterator<String> iterator = newCollection.iterator();
		while (iterator.hasNext()) {
			System.out.println("Iterator Language: " + iterator.next());
		}
		
		// Using forEach method
		newCollection.forEach(lang -> System.out.println("forEach Language: " + lang)); // output: Go Swift
		
		// End of main method
		

	}

}
