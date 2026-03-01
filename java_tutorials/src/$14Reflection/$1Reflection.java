package $14Reflection;

public class $1Reflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of Java Reflection
		try {
			// Load the class at runtime
			Class<?> clazz = Class.forName("java.util.ArrayList");
			
			// Get the methods of the class
			java.lang.reflect.Method[] methods = clazz.getDeclaredMethods();
			
			System.out.println("Methods of java.util.ArrayList:");
			for (java.lang.reflect.Method method : methods) {
				System.out.println(method.getName());
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found: " + e.getMessage());
		}
		
		// End of main method
		
	}
}
