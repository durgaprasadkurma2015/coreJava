package $12JavaSerialization;

public class $1Serialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of Java Serialization
		java.io.Serializable serializable = new java.io.Serializable() {
			private static final long serialVersionUID = 1L;
			String name = "John Doe";
			int age = 30;
		};
		
		// Serialize the object
		try (java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(new java.io.FileOutputStream("object.ser"))) {
			oos.writeObject(serializable);
			System.out.println("Object serialized successfully.");
		} catch (java.io.IOException e) {
			System.out.println("IOException during serialization: " + e.getMessage());
		}
		
		// Deserialize the object
		try (java.io.ObjectInputStream ois = new java.io.ObjectInputStream(new java.io.FileInputStream("object.ser"))) {
			Object deserializedObject = ois.readObject();
			System.out.println("Object deserialized successfully: " + deserializedObject);
		} catch (java.io.IOException | ClassNotFoundException e) {
			System.out.println("Exception during deserialization: " + e.getMessage());
		}
		
		// End of main method
		

	}

}
