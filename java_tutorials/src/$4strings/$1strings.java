package $4strings;

public class $1strings {

	public static void main(String[] args) {

		// Creating strings
		String str1 = "Hello, World!";
		System.out.println("String 1: " + str1);
		String str2 = new String("Java Programming");
		System.out.println("String 2: " + str2);
		
		
		// String methods
		int length = str1.length();
		System.out.println("Length of String 1: " + length);
		
		// Accessing characters
		char ch = str1.charAt(7);
		System.out.println("Character at index 7 of String 1: " + ch);
		
		// Substring
		String substr = str2.substring(5, 16);
		System.out.println("Substring of String 2 (5 to 16): " + substr);
		
		// Comparison
		boolean isEqual = str1.equals("Hello, World!");
		System.out.println("String 1 equals 'Hello, World!': " + isEqual);
		
		// or using equalsIgnoreCase
		boolean isEqualIgnoreCase = str1.equalsIgnoreCase("hello, world!");
		System.out.println("String 1 equalsIgnoreCase 'hello, world!': " + isEqualIgnoreCase);
		
		// or using compareTo
		int comparison = str1.compareTo("Hello, World!");
		System.out.println("String 1 compareTo 'Hello, World!': " + comparison);
		
		// or using compareToIgnoreCase
		int comparisonIgnoreCase = str1.compareToIgnoreCase("hello, world!");
		System.out.println("String 1 compareToIgnoreCase 'hello, world!': " + comparisonIgnoreCase);
		
		// or using regionMatches
		boolean regionMatch = str1.regionMatches(7, "World", 0, 5);
		System.out.println("String 1 regionMatches 'World': " + regionMatch);
		
		// or using startsWith
		boolean startsWith = str1.startsWith("Hello");
		System.out.println("String 1 startsWith 'Hello': " + startsWith);
		
		// or using endsWith
		boolean endsWith = str1.endsWith("World!");
		System.out.println("String 1 endsWith 'World!': " + endsWith);
		
		// or using contentEquals
		boolean contentEquals = str1.contentEquals("Hello, World!");
		System.out.println("String 1 contentEquals 'Hello, World!': " + contentEquals);
		
		// or using matches
		boolean matches = str1.matches("Hello, World!");
		System.out.println("String 1 matches 'Hello, World!': " + matches);
		
		// or using hashCode
		int hashCode = str1.hashCode();
		System.out.println("String 1 hashCode: " + hashCode);
		
		// or using intern
		String internedStr = str1.intern();
		System.out.println("String 1 interned: " + internedStr);
		
		// or using toCharArray
		char[] charArray = str1.toCharArray();
		System.out.print("String 1 toCharArray: ");
		for (char c : charArray) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		// or using getBytes
		byte[] byteArray = str1.getBytes();
		System.out.print("String 1 getBytes: ");
		for (byte b : byteArray) {
			System.out.print(b + " ");
		}
		System.out.println();
		
		// or using format
		String formattedStr = String.format("Formatted String: %s", str1);
		System.out.println
		("String 1 formatted: " + formattedStr);
		
			// or using valueOf
		String valueOfStr = String.valueOf(12345);
		System.out.println("String valueOf 12345: " + valueOfStr);
		
		// or using join
		String joinedStr = String.join("-", "Java", "Programming", "Language");
		System.out.println("Joined String: " + joinedStr);
		
		// or using repeat
		String repeatedStr = "Ha".repeat(3);
		System.out.println("Repeated String: " + repeatedStr);
		
		// or using strip
		String strWithSpaces = "   Hello, World!   ";
		String strippedStr = strWithSpaces.strip();
		System.out.println("Stripped String: '" + strippedStr + "'");
		
		// or using stripLeading
		String leadingStrippedStr = strWithSpaces.stripLeading();
		System.out.println("Leading Stripped String: '" + leadingStrippedStr + "'");
		
		// or using stripTrailing
		String trailingStrippedStr = strWithSpaces.stripTrailing();
		System.out.println("Trailing Stripped String: '" + trailingStrippedStr + "'");
		
		// or using indent
		String indentedStr = "Hello,\nWorld!".indent(4);
		System.out.println("Indented String:\n" + indentedStr);
		
		// or using translateEscapes
		String escapedStr = "Hello,\\nWorld!".translateEscapes();
		System.out.println("Translated Escapes String:\n" + escapedStr);
		
		// or using describeConstable
		java.util.Optional<String> constableStr = str1.describeConstable();
		System.out.println("Describe Constable String: " + constableStr);
		
		// or using resolveConstantDesc
		String resolvedStr = constableStr.orElse("Default String");
		System.out.println("Resolved Constant Description String: " + resolvedStr);
		
		// Searching
		int index = str2.indexOf("Programming");
		System.out.println("Index of 'Programming' in String 2: " + index);
		int lastIndex = str2.lastIndexOf("a");
		System.out.println("Last Index of 'a' in String 2: " + lastIndex);
		
		// Case conversion
		String upperStr = str1.toUpperCase();
		System.out.println("String 1 in uppercase: " + upperStr);
		String lowerStr = str1.toLowerCase();
		System.out.println("String 1 in lowercase: " + lowerStr);
		
		
		// Replacement
		String replacedStr = str2.replace("Java", "Python");
		System.out.println("String 2 after replacement: " + replacedStr);
		
		// Concatenation
		String concatenatedStr = str1 + " " + str2;
		System.out.println("Concatenated String: " + concatenatedStr);
		
		// or using concat() method
		String concatenatedStr2 = str1.concat(" ").concat(str2);
		System.out.println("Concatenated String using concat(): " + concatenatedStr2);
		
		// or using StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.append(" ");
		sb.append(str2);
		String concatenatedStr3 = sb.toString();
		System.out.println("Concatenated String using StringBuilder: " + concatenatedStr3);
		
		// or using String.format()
		String concatenatedStr4 = String.format("%s %s", str1, str2);
		System.out.println("Concatenated String using String.format(): " + concatenatedStr4);
		
		// or using String.join()
		String concatenatedStr5 = String.join(" ", str1, str2);
		System.out.println("Concatenated String using String.join(): " + concatenatedStr5);
		
		// or using StringBuffer
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(str1);
		stringBuffer.append(" ");
		stringBuffer.append(str2);
		String concatenatedStr6 = stringBuffer.toString();
		System.out.println("Concatenated String using StringBuffer: " + concatenatedStr6);
		
		// or using + operator in a loop (not recommended for large concatenations)
		String concatenatedStr7 = "";
		 for (String s : new String[]{str1, str2}) {
		    concatenatedStr7 += s + " ";
		    }
		 
		// Trim the last space
		 concatenatedStr7 = concatenatedStr7.trim();
		 // Printing concatenated strings
		 System.out.println("Concatenated String using + operator: " + concatenatedStr7);
		 
		 // Immutability demonstration
		 String originalStr = "Immutable";
		 String modifiedStr = originalStr.replace("Immutable", "Mutable");
		 System.out.println("Original String: " + originalStr);
		 System.out.println("Modified String: " + modifiedStr);
		 
		 // StringBuilder for mutable strings
		 StringBuilder mutableStr = new StringBuilder("Mutable");
		 mutableStr.append(" String");
		 System.out.println("Mutable String using StringBuilder: " + mutableStr.toString());
		 
		 // StringBuffer for thread-safe mutable strings
		 StringBuffer threadSafeStr = new StringBuffer("Thread-Safe");
		 threadSafeStr.append(" StringBuffer");
		 System.out.println("Thread-Safe String using StringBuffer: " + threadSafeStr.toString());
		 
		 // String Pool demonstration
		 String poolStr1 = "String Pool";
		 String poolStr2 = "String Pool";
		 System.out.println("poolStr1 == poolStr2: " + (poolStr1 == poolStr2)); // true
		 String poolStr3 = new String("String Pool");
		 System.out.println("poolStr1 == poolStr3: " + (poolStr1 == poolStr3)); // false
		 String poolStr4 = poolStr3.intern();
		 System.out.println("poolStr1 == poolStr4: " + (poolStr1 == poolStr4)); // true
		 
		 // String formatting
		 String name = "John";
		 int age = 25;
		 String formattedString = String.format("Name: %s, Age: %d", name, age);
		 System.out.println("Formatted String: " + formattedString);
		 
		 // Multiline strings (Text Blocks)
		 String textBlock = """
				 This is a multiline
				 string using
				 text blocks.
				 """;
		 System.out.println("Text Block:\n" + textBlock);
		 	
		 // Escape sequences
		 String escapeStr = "Hello,\nWorld!\tThis is a tabbed line.\nHe said, \"Java is fun!\"";
		 System.out.println("String with Escape Sequences:\n" + escapeStr);
		 
		 // Raw string literals (Java 21+)
		 String rawStr = String.raw`C:\Users\JohnDoe\Documents\JavaProjects`;
		 System.out.println("Raw String Literal:\n" + rawStr);
		 	
		 
	
	
	}

}
