package $1.basic;

public class $6operator {

	public static void main(String[] args) {

		// Arithmetic Operators
		int a = 10, b = 5;
		System.out.println("Addition: " + (a + b)); // 15
		System.out.println("Subtraction: " + (a - b)); // 5
		System.out.println("Multiplication: " + (a * b)); // 50
		System.out.println("Division: " + (a / b)); // 2
		System.out.println("Modulus: " + (a % b)); // 0

		// Relational Operators
		System.out.println("a > b: " + (a > b)); // true
		System.out.println("a < b: " + (a < b)); // false
		System.out.println("a == b: " + (a == b)); // false
		System.out.println("a != b: " + (a != b)); // true
		System.out.println("a >= b: " + (a >= b)); // true
		System.out.println("a <= b: " + (a <= b)); // false
		
		
		// Logical Operators
		boolean x = true, y = false;
		System.out.println("x && y: " + (x && y)); // false
		System.out.println("x || y: " + (x || y)); // true
		System.out.println("!x: " + (!x)); // false
		System.out.println("!y: " + (!y)); // true
		
		
		// Assignment Operators
		int c = 20;
		c += 5; // c = c + 5
		System.out.println("c after += 5: " + c); // 25
		
		c -= 3; // c = c - 3
		System.out.println("c after -= 3: " + c); // 22
		
		// unary Operators
		int d = 10;
		System.out.println("d: " + d); // 10
		System.out.println("++d: " + ++d); // 11
		System.out.println("d++: " + d++); // 11
		System.out.println("d after d++: " + d); // 12
		System.out.println("--d: " + --d); // 11
		System.out.println("d--: " + d--); // 11
		System.out.println("d after d--: " + d); // 10
		
		// Ternary Operator
		int age = 20;
		String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
		System.out.println("Voting Eligibility: " + eligibility); // Eligible to vote
		
		// Bitwise Operators
		int p = 5; // 0101
		int q = 3; // 0011
		System.out.println("p & q: " + (p & q)); // 1 (0001)
		System.out.println("p | q: " + (p | q)); // 7 (0111)
		System.out.println("p ^ q: " + (p ^ q)); // 6 (0110)
		System.out.println("~p: " + (~p)); // -6 (inverts bits)
		
		// Shift Operators
		int r = 8; // 1000
		System.out.println("r << 2: " + (r << 2)); // 32 (100000)
		System.out.println("r >> 2: " + (r >> 2)); // 2 (0010)
		System.out.println("r >>> 2: " + (r >>> 2)); // 2 (0010)
		
		// instanceof Operator
		String str = "Hello, World!";
		boolean isString = str instanceof String;
		System.out.println("str is an instance of String: " + isString); // true
		
		// Type Comparison Operator
		Integer num = 10;
		boolean isInteger = num instanceof Integer;
		System.out.println("num is an instance of Integer: " + isInteger); // true
		
		

	}

}
