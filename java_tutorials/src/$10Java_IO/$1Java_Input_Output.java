package $10Java_IO;

import java.io.StringReader;
import java.util.StringTokenizer;

public class $1Java_Input_Output {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		
		// Java Input and Output (I/O) example
		// Using System.out for output
		System.out.println("Hello, World!"); // Print a line of text
		
		// Using System.in for input
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine(); // Read a line of input from the user
		System.out.println("Hello, " + name + "!"); // Greet the user
		
		// Closing the scanner
		scanner.close();
		
		// Example of using File I/O to write to a file
		try (java.io.FileWriter writer = new java.io.FileWriter("output.txt")) {
			writer.write("This is an example of writing to a file using Java I/O."); 
			System.out.println("Data written to output.txt successfully."); // Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) { 
			System.out.println("An error occurred while writing to the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using File I/O to read from a file
		try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader("output.txt"))) {
			String line;
			System.out.println("Contents of output.txt:"); // Print a message indicating that the contents of the file will be displayed
			while ((line = reader.readLine()) != null) {
				System.out.println(line); // Print each line read from the file
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Byte Streams to write to a file
		try (java.io.FileOutputStream outputStream = new java.io.FileOutputStream("output_bytes.txt")) {
			String data = "This is an example of writing bytes to a file using Java I/O.";
			outputStream.write(data.getBytes()); // Write bytes to the file
			System.out.println("Data written to output_bytes.txt successfully."); // Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing bytes to the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Byte Streams to read from a file
		try (java.io.FileInputStream inputStream = new java.io.FileInputStream("output_bytes.txt")) {
			int byteData;
			System.out.println("Contents of output_bytes.txt:"); // Print a message indicating that the contents of the file will be displayed
			while ((byteData = inputStream.read()) != -1) {
				System.out.print((char) byteData); // Print each byte read from the file as a character
			}
			System.out.println(); // Print a new line after reading the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading bytes from the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Object Streams to write an object to a file
		try (java.io.ObjectOutputStream objectOutputStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("object_output.dat"))) {
			java.util.Date date = new java.util.Date(); // Create a Date object
			objectOutputStream.writeObject(date); // Write the object to the file
			System.out.println("Object written to object_output.dat successfully.");// Print a message indicating that the object was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing an object to the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Object Streams to read an object from a file
		try (java.io.ObjectInputStream objectInputStream = new java.io.ObjectInputStream(new java.io.FileInputStream("object_output.dat"))) {
			java.util.Date date = (java.util.Date) objectInputStream.readObject(); // Read the object from the file
			System.out.println("Object read from object_output.dat: " + date.toString()); // Print the object read from the file
		} catch (java.io.IOException | ClassNotFoundException e) {
			System.out.println("An error occurred while reading an object from the file: " + e.getMessage());// Print an error message if an IOException or ClassNotFoundException occurs
		}
		
		// Example of using Buffered Streams to write to a file
		try (java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter("buffered_output.txt"))) {
			bufferedWriter.write("This is an example of using BufferedWriter to write to a file.");
			System.out.println("Data written to buffered_output.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using BufferedWriter: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Buffered Streams to read from a file
		try (java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.FileReader("buffered_output.txt"))) {
			String line;
			System.out.println("Contents of buffered_output.txt:");// Print a message indicating that the contents of the file will be displayed
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line); // Print each line read from the file
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file using BufferedReader: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using PrintWriter to write to a file
		try (java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.FileWriter("print_writer_output.txt"))) {
			printWriter.println("This is an example of using PrintWriter to write to a file.");
			System.out.println("Data written to print_writer_output.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using PrintWriter: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using PrintWriter to read from a file
		try (java.io.BufferedReader printWriterReader = new java.io.BufferedReader(new java.io.FileReader("print_writer_output.txt"))) {
			String line;
			System.out.println("Contents of print_writer_output.txt:"); // Print a message indicating that the contents of the file will be displayed
			while ((line = printWriterReader.readLine()) != null) {
				System.out.println(line); // Print each line read from the file
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file using PrintWriter: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Data Streams to write primitive data types to a file
		try (java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(new java.io.FileOutputStream("data_output.dat"))) {
			dataOutputStream.writeInt(42); // Write an integer to the file
			dataOutputStream.writeDouble(3.14); // Write a double to the file
			System.out.println("Primitive data types written to data_output.dat successfully."); // Print a message indicating that the primitive data types were written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing primitive data types to the file: " + e.getMessage()); // Print an error message if an IOException occurs
		}
		
		// Example of using Data Streams to read primitive data types from a file
		try (java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream("data_output.dat"))) {
			int intValue = dataInputStream.readInt(); // Read an integer from the file
			double doubleValue = dataInputStream.readDouble(); // Read a double from the file
			System.out.println("Primitive data types read from data_output.dat: Integer = " + intValue + ", Double = " + doubleValue);// Print the primitive data types read from the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading primitive data types from the file: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using RandomAccessFile to read and write to a file
		try (java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile("random_access.dat", "rw")) {
			randomAccessFile.writeUTF("Hello, Random Access File!"); // Write a string to the file
			randomAccessFile.seek(0); // Move the file pointer back to the beginning of the file
			String message = randomAccessFile.readUTF(); // Read the string from the file
			System.out.println("Message read from random_access.dat: " + message);// Print the message read from the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while using RandomAccessFile: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using BufferedInputStream and BufferedOutputStream to read and write bytes to a file
		try (java.io.BufferedOutputStream bufferedOutputStream = new java.io.BufferedOutputStream(new java.io.FileOutputStream("buffered_bytes.dat"))) {
			String data = "This is an example of using BufferedOutputStream to write bytes to a file.";
			bufferedOutputStream.write(data.getBytes()); // Write bytes to the file
			System.out.println("Bytes written to buffered_bytes.dat successfully.");
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing bytes to the file using BufferedOutputStream: " + e.getMessage());
		}
		
		// Example of using BufferedInputStream to read bytes from a file
		try (java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream("buffered_bytes.dat"))) {
			int byteData;
			System.out.println("Contents of buffered_bytes.dat:");// Print a message indicating that the contents of the file will be displayed
			while ((byteData = bufferedInputStream.read()) != -1) {
				System.out.print((char) byteData); // Print each byte read from the file as a character
			}
			System.out.println(); // Print a new line after reading the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading bytes from the file using BufferedInputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using PrintStream to write to a file
		try (java.io.PrintStream printStream = new java.io.PrintStream(new java.io.FileOutputStream("print_stream_output.txt"))) {
			printStream.println("This is an example of using PrintStream to write to a file.");
			System.out.println("Data written to print_stream_output.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using PrintStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using PrintStream to read from a file
		try (java.io.BufferedReader printStreamReader = new java.io.BufferedReader(new java.io.FileReader("print_stream_output.txt"))) {
			String line;
			System.out.println("Contents of print_stream_output.txt:");// Print a message indicating that the contents of the file will be displayed
			while ((line = printStreamReader.readLine()) != null) {
				System.out.println(line); // Print each line read from the file
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file using PrintStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Console class for input and output
		java.io.Console console = System.console();
		if (console != null) {
			String userInput = console.readLine("Enter some input: "); // Read input from the console
			console.printf("You entered: %s%n", userInput); // Print output to the console
		} else {
			System.out.println("No console available. Please run the program in a console environment.");// Print a message if no console is available
		}
		
		// Example of using Scanner class to read different types of input
		try (java.util.Scanner scanner2 = new java.util.Scanner(System.in)) {
			System.out.print("Enter an integer: ");
			int intValue = scanner2.nextInt(); // Read an integer from the user
			System.out.print("Enter a double: ");
			double doubleValue = scanner2.nextDouble(); // Read a double from the user
			scanner2.nextLine(); // Consume the newline character
			System.out.print("Enter a string: ");
			String stringValue = scanner2.nextLine(); // Read a string from the user
			System.out.println("You entered: Integer = " + intValue + ", Double = " + doubleValue + ", String = " + stringValue);// Print the values entered by the user
		} catch (java.util.InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");// Print an error message if the user enters an invalid input
		}
		
		// Example of using Formatter class to format output
		try (java.util.Formatter formatter = new java.util.Formatter(new java.io.FileOutputStream("formatted_output.txt"))) {
			formatter.format("This is an example of using Formatter to format output to a file.%n");
			formatter.format("Integer: %d, Double: %.2f, String: %s%n", 42, 3.14, "Hello, Formatter!");
			System.out.println("Formatted data written to formatted_output.txt successfully.");
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing formatted output to the file: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Formatter to format output to the console
		try (java.util.Formatter consoleFormatter = new java.util.Formatter(System.out)) {
			consoleFormatter.format("This is an example of using Formatter to format output to the console.%n");
			consoleFormatter.format("Integer: %d, Double: %.2f, String: %s%n", 42, 3.14, "Hello, Console Formatter!");
		}
		
		// Example of using Scanner class to read input from a file
		try (java.util.Scanner fileScanner = new java.util.Scanner(new java.io.File("formatted_output.txt"))) {
			System.out.println("Contents of formatted_output.txt read using Scanner:");
			while (fileScanner.hasNextLine()) {
				String line = fileScanner.nextLine(); // Read a line from the file
				System.out.println(line); // Print the line read from the file
			}
		} catch (java.io.FileNotFoundException e) {
			System.out.println("The file formatted_output.txt was not found: " + e.getMessage());// Print an error message if the file is not found
		}
		
		// Example of using Scanner class to read input from a string
		String inputString = "This is an example of using Scanner to read input from a string.";
		try (java.util.Scanner stringScanner = new java.util.Scanner(inputString)) {
			System.out.println("Contents of input string read using Scanner:");
			while (stringScanner.hasNext()) {
				String word = stringScanner.next(); // Read a word from the string
				System.out.println(word); // Print the word read from the string
			}
		}
		
		// Example of using Scanner class to read input from a byte array
		byte[] byteArray = "This is an example of using Scanner to read input from a byte array.".getBytes();
		try (java.util.Scanner byteArrayScanner = new java.util.Scanner(new java.io.ByteArrayInputStream(byteArray))) {
			System.out.println("Contents of byte array read using Scanner:");
			while (byteArrayScanner.hasNext()) {
				String word = byteArrayScanner.next(); // Read a word from the byte array
				System.out.println(word); // Print the word read from the byte array
			}
		}
		
		// Example of using Scanner class to read input from a URL
		try (java.util.Scanner urlScanner = new java.util.Scanner(new java.net.URL("https://www.google.com").openStream())) {
			System.out.println("Contents of URL read using Scanner:");
			while (urlScanner.hasNextLine()) {
				String line = urlScanner.nextLine(); // Read a line from the URL
				System.out.println(line); // Print the line read from the URL
			}
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the URL: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Scanner class to read input from a StringReader
		StringReader stringReader = new StringReader("This is an example of using Scanner to read input from a StringReader.");
		try (java.util.Scanner stringReaderScanner = new java.util.Scanner(stringReader)) {
			System.out.println("Contents of StringReader read using Scanner:");
			while (stringReaderScanner.hasNext()) {
				String word = stringReaderScanner.next(); // Read a word from the StringReader
				System.out.println(word); // Print the word read from the StringReader
			}
		}
		
		// Example of using Scanner class to read input from a FileInputStream
		try (java.util.Scanner fileInputStreamScanner = new java.util.Scanner(new java.io.FileInputStream("formatted_output.txt"))) {
			System.out.println("Contents of formatted_output.txt read using Scanner with FileInputStream:");
			while (fileInputStreamScanner.hasNextLine()) {
				String line = fileInputStreamScanner.nextLine(); // Read a line from the file
				System.out.println(line); // Print the line read from the file
			}
		} catch (java.io.FileNotFoundException e) {
			System.out.println("The file formatted_output.txt was not found: " + e.getMessage());// Print an error message if the file is not found
		}
		
		// Example of using Scanner class to read input from a ByteArrayInputStream
		byte[] byteArray2 = "This is an example of using Scanner to read input from a ByteArrayInputStream.".getBytes();
		try (java.util.Scanner byteArrayInputStreamScanner = new java.util.Scanner(new java.io.ByteArrayInputStream(byteArray2))) {
			System.out.println("Contents of ByteArrayInputStream read using Scanner:");
			while (byteArrayInputStreamScanner.hasNext()) {
				String word = byteArrayInputStreamScanner.next(); // Read a word from the ByteArrayInputStream
				System.out.println(word); // Print the word read from the ByteArrayInputStream
			}
		}
		
		// Example of using Scanner class to read input from a StringBuffer
		StringBuffer stringBuffer = new StringBuffer("This is an example of using Scanner to read input from a StringBuffer.");
		try (java.util.Scanner stringBufferScanner = new java.util.Scanner(stringBuffer.toString())) {
			System.out.println("Contents of StringBuffer read using Scanner:");
			while (stringBufferScanner.hasNext()) {
				String word = stringBufferScanner.next(); // Read a word from the StringBuffer
				System.out.println(word); // Print the word read from the StringBuffer
			}
		}
		
		// Example of using Scanner class to read input from a StringBuilder
		StringBuilder stringBuilder = new StringBuilder("This is an example of using Scanner to read input from a StringBuilder.");
		try (java.util.Scanner stringBuilderScanner = new java.util.Scanner(stringBuilder.toString())) {
			System.out.println("Contents of StringBuilder read using Scanner:");
			while (stringBuilderScanner.hasNext()) {
				String word = stringBuilderScanner.next(); // Read a word from the StringBuilder
				System.out.println(word); // Print the word read from the StringBuilder
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer
		StringTokenizer stringTokenizer = new StringTokenizer("This is an example of using Scanner to read input from a StringTokenizer.");
		try (java.util.Scanner stringTokenizerScanner = new java.util.Scanner(stringTokenizer.nextToken())) {
			System.out.println("Contents of StringTokenizer read using Scanner:");
			while (stringTokenizerScanner.hasNext()) {
				String word = stringTokenizerScanner.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple tokens
		StringTokenizer stringTokenizer2 = new StringTokenizer("This is an example of using Scanner to read input from a StringTokenizer with multiple tokens.", " ");
		try (java.util.Scanner stringTokenizerScanner2 = new java.util.Scanner(stringTokenizer2.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple tokens read using Scanner:");
			while (stringTokenizerScanner2.hasNext()) {
				String word = stringTokenizerScanner2.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with custom delimiters
		StringTokenizer stringTokenizer3 = new StringTokenizer("This,is,an,example,of,using,Scanner,to,read,input,from,a,StringTokenizer,with,custom,delimiters.", ",");
		try (java.util.Scanner stringTokenizerScanner3 = new java.util.Scanner(stringTokenizer3.nextToken())) {
			System.out.println("Contents of StringTokenizer with custom delimiters read using Scanner:");
			while (stringTokenizerScanner3.hasNext()) {
				String word = stringTokenizerScanner3.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters
		StringTokenizer stringTokenizer4 = new StringTokenizer("This,is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters.", ",;: ");
		try (java.util.Scanner stringTokenizerScanner4 = new java.util.Scanner(stringTokenizer4.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple custom delimiters read using Scanner:");
			while (stringTokenizerScanner4.hasNext()) {
				String word = stringTokenizerScanner4.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters and ignoring empty tokens
		StringTokenizer stringTokenizer5 = new StringTokenizer("This,is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters and ignoring empty tokens.", ",;: ", false);
		try (java.util.Scanner stringTokenizerScanner5 = new java.util.Scanner(stringTokenizer5.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple custom delimiters and ignoring empty tokens read using Scanner:");
			while (stringTokenizerScanner5.hasNext()) {
				String word = stringTokenizerScanner5.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters and including empty tokens
		StringTokenizer stringTokenizer6 = new StringTokenizer("This,is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters and including empty tokens.", ",;: ", true);
		try (java.util.Scanner stringTokenizerScanner6 = new java.util.Scanner(stringTokenizer6.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple custom delimiters and including empty tokens read using Scanner:");
			while (stringTokenizerScanner6.hasNext()) {
				String word = stringTokenizerScanner6.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters
		// Note: StringTokenizer does not have an option to ignore delimiters, so we will just read the tokens as they are
		StringTokenizer stringTokenizer7 = new StringTokenizer("This,is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters.", ",;: ", true);
		try (java.util.Scanner stringTokenizerScanner7 = new java.util.Scanner(stringTokenizer7.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters read using Scanner:");
			while (stringTokenizerScanner7.hasNext()) {
				String word = stringTokenizerScanner7.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
		}
		
		// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens
		StringTokenizer stringTokenizer8 = new StringTokenizer("This"
				+ ",is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens.", ",;: ", true);
		try (java.util.Scanner stringTokenizerScanner8 = new java.util.Scanner(stringTokenizer8.nextToken())) {
			System.out.println("Contents of StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens read using Scanner:");
			while (stringTokenizerScanner8.hasNext()) {
				String word = stringTokenizerScanner8.next(); // Read a word from the StringTokenizer
				System.out.println(word); // Print the word read from the StringTokenizer
			}
			
			// Example of using Scanner class to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens and ignoring delimiters and ignoring empty tokens
			StringTokenizer stringTokenizer9 = new StringTokenizer("This"
					+ ",is;an:example of using Scanner to read input from a StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens and ignoring delimiters and ignoring empty tokens.", ",;: ", true);
			try (java.util.Scanner stringTokenizerScanner9 = new java.util.Scanner(stringTokenizer9.nextToken())) {
				System.out.println("Contents of StringTokenizer with multiple custom delimiters and including empty tokens and ignoring delimiters and ignoring empty tokens and ignoring delimiters and ignoring empty tokens read using Scanner:");
				while (stringTokenizerScanner9.hasNext()) {
					String word = stringTokenizerScanner9.next(); // Read a word from the StringTokenizer
					System.out.println(word); // Print the word read from the StringTokenizer
				}
				// Note: The above example is just to demonstrate the use of Scanner with StringTokenizer and does not actually ignore delimiters or empty tokens, as StringTokenizer does not have that functionality.
					// In a real application, you would need to implement your own logic to ignore delimiters and empty tokens if needed.
				// End of the example
				// End of the main method
			}
		}
		// sequenceInputStream example
		try (java.io.SequenceInputStream sequenceInputStream = new java.io.SequenceInputStream(
				new java.io.ByteArrayInputStream("This is the first input stream. ".getBytes()),
				new java.io.ByteArrayInputStream("This is the second input stream.".getBytes()))) {
			int byteData;
			System.out.println("Contents of SequenceInputStream:"); // Print a message indicating that the contents of the SequenceInputStream will be displayed
			while ((byteData = sequenceInputStream.read()) != -1) {
				System.out.print((char) byteData); // Print each byte read from the SequenceInputStream as a character
			}
			System.out.println(); // Print a new line after reading the SequenceInputStream
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while using SequenceInputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		
		// Example of using FilterInputStream to read from a file
		try (java.io.FilterInputStream filterInputStream = new java.io.FilterInputStream(new java.io.FileInputStream("filtered_output.txt"))) {
			int byteData;
			System.out.println("Contents of filtered_output.txt read using FilterInputStream:");// Print a message indicating that the contents of the file will be displayed
			while ((byteData = filterInputStream.read()) != -1) {
				System.out.print((char) byteData); // Print each byte read from the file as a character
			}
			System.out.println(); // Print a new line after reading the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file using FilterInputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using FilterOutputStream to read from a file
		try (java.io.FilterOutputStream filterOutputStream2 = new java.io.FilterOutputStream(new java.io.FileOutputStream("filtered_output2.txt"))) {
			String data = "This is another example of using FilterOutputStream to write to a file.";
			filterOutputStream2.write(data.getBytes()); // Write bytes to the file
			System.out.println("Data written to filtered_output2.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using FilterOutputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// pushbackInputStream example
		try (java.io.PushbackInputStream pushbackInputStream = new java.io.PushbackInputStream(new java.io.ByteArrayInputStream("This is an example of using PushbackInputStream.".getBytes()))) {
			int byteData;
			System.out.println("Contents of PushbackInputStream:");// Print a message indicating that the contents of the PushbackInputStream will be displayed
			while ((byteData = pushbackInputStream.read()) != -1) {
				System.out.print((char) byteData); // Print each byte read from the PushbackInputStream as a character
				if (byteData == 'a') { // If the byte read is 'a', push it back to the stream
					pushbackInputStream.unread(byteData); // Push the byte back to the stream
				}
			}
			System.out.println(); // Print a new line after reading the PushbackInputStream
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while using PushbackInputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using PushbackOutputStream to write to a file
		try (java.io.PushbackOutputStream pushbackOutputStream = new java.io.PushbackOutputStream(new java.io.FileOutputStream("pushback_output.txt"))) {
			String data = "This is an example of using PushbackOutputStream to write to a file.";
			pushbackOutputStream.write(data.getBytes()); // Write bytes to the file
			System.out.println("Data written to pushback_output.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using PushbackOutputStream: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// pushback reader example
		try (java.io.PushbackReader pushbackReader = new java.io.PushbackReader(new java.io.StringReader("This is an example of using PushbackReader."))) {
			int charData;
			System.out.println("Contents of PushbackReader:");// Print a message indicating that the contents of the PushbackReader will be displayed
			while ((charData = pushbackReader.read()) != -1) {
				System.out.print((char) charData); // Print each character read from the PushbackReader
				if (charData == 'a') { // If the character read is 'a', push it back to the reader
					pushbackReader.unread(charData); // Push the character back to the reader
				}
			}
			System.out.println(); // Print a new line after reading the PushbackReader
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while using PushbackReader: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Piped writer to write to a file
		try (java.io.PipedWriter pipedWriter = new java.io.PipedWriter(new java.io.FileWriter("piped_output.txt"))) {
			String data = "This is an example of using PipedWriter to write to a file.";
			pipedWriter.write(data); // Write data to the file
			System.out.println("Data written to piped_output.txt successfully.");// Print a message indicating that the data was written successfully
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while writing to the file using PipedWriter: " + e.getMessage());// Print an error message if an IOException occurs
		}
		
		// Example of using Piped reader to read from a file
		try (java.io.PipedReader pipedReader = new java.io.PipedReader(new java.io.FileReader("piped_output.txt"))) {
			int charData;
			System.out.println("Contents of piped_output.txt read using PipedReader:");// Print a message indicating that the contents of the file will be displayed
			while ((charData = pipedReader.read()) != -1) {
				System.out.print((char) charData); // Print each character read from the file
			}
			System.out.println(); // Print a new line after reading the file
		} catch (java.io.IOException e) {
			System.out.println("An error occurred while reading from the file using PipedReader: " + e.getMessage());// Print an error message if an IOException occurs
		}
	
	}

}
