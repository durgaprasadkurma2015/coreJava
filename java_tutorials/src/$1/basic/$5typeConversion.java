package $1.basic;

public class $5typeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Implicit Type Conversion (Widening)
		   int intVal1 = 180;
	        long longVal = intVal1;  // Implicit conversion from int to long
	        float floatVal = longVal; // Implicit conversion from long to float

	        System.out.println("Integer value: " + intVal1);
	        System.out.println("Long value: " + longVal);
	        System.out.println("Float value: " + floatVal);
	        
	        // Explicit Type Conversion (Narrowing)
	        
	        double doubleVal = 9.78;
	        int intVal2 = (int) doubleVal;  // Explicit conversion from double to int
	        
	        System.out.println("Double value: " + doubleVal);
	        System.out.println("Integer value after conversion: " + intVal2);	
	        
	        // Example of narrowing conversion leading to data loss
	        int intVal = 130;
	        byte byteVal = (byte) intVal;  // Narrowing conversion from int to byte

	        System.out.println("Original integer value: " + intVal);
	        System.out.println("Byte value after conversion: " + byteVal);  
	}

}
