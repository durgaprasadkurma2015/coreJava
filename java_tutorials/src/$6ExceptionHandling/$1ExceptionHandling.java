package $6ExceptionHandling;

public class $1ExceptionHandling {
	
	// main method
	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of Exception Handling using try-catch
		try {
			int[] numbers = {1, 2, 3};
			System.out.println(numbers[5]); // This will throw an exception
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught: " + e.getMessage());
		} finally {
			System.out.println("Execution of try-catch block is complete.");
			
			// Example of throwing a custom exception
			try {
				validateAge(15);
			} catch (IllegalArgumentException e) {
				System.out.println("Custom Exception caught: " + e.getMessage());
			}
			
			// Example of using multiple catch blocks
			try {
				String str = null;
				System.out.println(str.length()); // This will throw NullPointerException
			} catch (NullPointerException e) {
				System.out.println("Null Pointer Exception caught: " + e.getMessage());
			} catch (Exception e) {
				System.out.println("General Exception caught: " + e.getMessage());
			}
			
			// Example of try-with-resources
			try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
				System.out.print("Enter a number: ");
				int num = scanner.nextInt();
				System.out.println("You entered: " + num);
			} catch (java.util.InputMismatchException e) {
				System.out.println("Input Mismatch Exception caught: " + e.getMessage());
			}
			
			// End of main method
			
		}
	}

	private static void validateAge(int i) {
		// TODO Auto-generated method stub
		
	}
	
	

}
