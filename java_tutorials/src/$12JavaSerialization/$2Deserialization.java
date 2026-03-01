package $12JavaSerialization;

public class $2Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of Java Deserialization
		try (java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("object.ser"))) {
			Object deserializedObject = ois.readObject();
			System.out.println("Object deserialized successfully: " + deserializedObject);
		} catch (java.io.IOException | ClassNotFoundException e) {
			System.out.println("Exception during deserialization: " + e.getMessage());
		}
		
		// End of main method

	}

}
