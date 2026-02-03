package $7CollectionsFramework;

public class $1CollectionsFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of using ArrayList
		java.util.ArrayList<String> list = new java.util.ArrayList<>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		System.out.println("ArrayList: " + list); // output: [Apple, Banana, Cherry]
		
		// Example of using HashMap	
		java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);
		System.out.println("HashMap: " + map); // output: {One=1, Two=2, Three=3}
		
		// Example of using HashSet
		java.util.HashSet<String> set = new java.util.HashSet<>();
		set.add("Red");
		set.add("Green");
		set.add("Blue");
		System.out.println("HashSet: " + set); // output: [Red, Green, Blue]
		
		// Example of using LinkedList
		java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
		linkedList.add("Monday");
		linkedList.add("Tuesday");
		linkedList.add("Wednesday");
		System.out.println("LinkedList: " + linkedList); // output: [Monday, Tuesday, Wednesday]
		
		// Example of using Stack
		java.util.Stack<Integer> stack = new java.util.Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack: " + stack); // output: [10, 20, 30]
		
		// Example of using Queue
		java.util.Queue<String> queue = new java.util.LinkedList<>();
		queue.add("First");
		queue.add("Second");
		queue.add("Third");
		System.out.println("Queue: " + queue); // output: [First, Second, Third]
		
		// Example of using PriorityQueue
		java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(20);
		System.out.println("PriorityQueue: " + priorityQueue); // output: [10, 30, 20]
		
		// Example of using TreeMap
		java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>();
		treeMap.put("C", 3);
		treeMap.put("A", 1);
		treeMap.put("B", 2);
		System.out.println("TreeMap: " + treeMap); // output: {A=1, B=2, C=3}
		
		// Example of using TreeSet
		java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();
		treeSet.add("Banana");
		treeSet.add("Apple");
		treeSet.add("Cherry");
		System.out.println("TreeSet: " + treeSet); // output: [Apple, Banana, Cherry]
		
		// End of main method
		

	}

}
