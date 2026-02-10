package $11FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class $1FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// write a program to demonstrate file handling in java
		// create a file
		// write to a file
		// read from a file
		
	
		
		// Creating a file
		File file = new File("example.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File created: " + file.getName());
			} else {
				System.out.println("File already exists.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while creating the file.");
			e.printStackTrace();
		}
		
		// Writing to a file
		try {
			FileWriter writer = new FileWriter("example.txt");
			writer.write("Hello, this is a file handling example in Java.");
			writer.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file.");
			e.printStackTrace();
		}
		
		// Reading from a file
		try {
			Scanner reader = new Scanner(file);
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("An error occurred while reading the file.");
			e.printStackTrace();
		}
		
		// Deleting the file
		if (file.delete()) {
			System.out.println("Deleted the file: " + file.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
		
		// Checking if the file exists
		if (file.exists()) {
			System.out.println("The file exists.");
		} else {
			System.out.println("The file does not exist.");
		}
		
		// Getting file properties
		System.out.println("File name: " + file.getName());
		System.out.println("Absolute path: " + file.getAbsolutePath());
		System.out.println("Writeable: " + file.canWrite());
		System.out.println("Readable: " + file.canRead());
		System.out.println("File size in bytes: " + file.length());
		
		// Creating a directory
		File directory = new File("exampleDir");
		if (directory.mkdir()) {
			System.out.println("Directory created: " + directory.getName());
		} else {
			System.out.println("Failed to create the directory.");
		}
		
		// Deleting the directory
		if (directory.delete()) {
			System.out.println("Deleted the directory: " + directory.getName());
		} else {
			System.out.println("Failed to delete the directory.");
		}
		
		// Checking if the directory exists
		if (directory.exists()) {
			System.out.println("The directory exists.");
		} else {
			System.out.println("The directory does not exist.");
		}
		
		// Getting directory properties
		System.out.println("Directory name: " + directory.getName());
		System.out.println("Absolute path: " + directory.getAbsolutePath());
		System.out.println("Writeable: " + directory.canWrite());
		System.out.println("Readable: " + directory.canRead());
		System.out.println("Is it a directory? " + directory.isDirectory());
		
		// Listing files in a directory
		File dir = new File(".");
		String[] filesList = dir.list();
		System.out.println("Files in the current directory:");
			for (String fileName : filesList) {
			System.out.println(fileName);
		}
			// Renaming a file
			File oldFile = new File("example.txt");
			File newFile = new File("renamed_example.txt");
			if (oldFile.renameTo(newFile)) {
				System.out.println("File renamed successfully.");
			} else {
				System.out.println("Failed to rename the file.");
			}
			
			// Checking if the renamed file exists
			if (newFile.exists()) {
				System.out.println("The renamed file exists.");
			} else {
				System.out.println("The renamed file does not exist.");
			}
			
			// Deleting the renamed file
			if (newFile.delete()) {
				System.out.println("Deleted the renamed file: " + newFile.getName());
			} else {
				System.out.println("Failed to delete the renamed file.");
			}
			
			// Checking if the renamed file exists after deletion
			if (newFile.exists()) {
				System.out.println("The renamed file still exists.");
			} else {
				System.out.println("The renamed file has been deleted.");
			}
				
			// Creating a new file using FileWriter
			try {
				FileWriter writer = new FileWriter("new_file.txt");
				writer.write("This is a new file created using FileWriter.");
				writer.close();
				System.out.println("Successfully created and wrote to the new file.");
			} catch (IOException e) {
				System.out.println("An error occurred while creating/writing to the new file.");
				e.printStackTrace();
			}
			// Reading from the new file
			try {
				Scanner reader = new Scanner(new File("new_file.txt"));
				while (reader.hasNextLine()) {
					String data = reader.nextLine();
					System.out.println(data);
				}
				reader.close();
			} catch (IOException e) {
				System.out.println("An error occurred while reading the new file.");
				e.printStackTrace();
			}
			
			// Deleting the new file
			File newFileToDelete = new File("new_file.txt");
			if (newFileToDelete.delete()) {
				System.out.println("Deleted the new file: " + newFileToDelete.getName());
			} else {
				System.out.println("Failed to delete the new file.");
			}
			
			// Checking if the new file exists after deletion
			if (newFileToDelete.exists()) {
				System.out.println("The new file still exists.");
			} else {
				System.out.println("The new file has been deleted.");
			}
			// Creating a temporary file
			try {
				File tempFile = File.createTempFile("tempFile", ".txt");
				System.out.println("Temporary file created: " + tempFile.getAbsolutePath());
				// Deleting the temporary file on exit
				tempFile.deleteOnExit();
			} catch (IOException e) {
				System.out.println("An error occurred while creating the temporary file.");
				e.printStackTrace();
			}
			// Creating a file with a specific path
			try {
				File specificFile = new File("C:\\Users\\Public\\specific_file.txt");
				if (specificFile.createNewFile()) {
					System.out.println("Specific file created: " + specificFile.getAbsolutePath());
				} else {
					System.out.println("Specific file already exists.");
				}
			} catch (IOException e) {
				System.out.println("An error occurred while creating the specific file.");
				e.printStackTrace();
			}
			// Deleting the specific file
			File specificFileToDelete = new File("C:\\Users\\Public\\specific_file.txt");
			if (specificFileToDelete.delete()) {
				System.out.println("Deleted the specific file: " + specificFileToDelete.getAbsolutePath());
			} else {
				System.out.println("Failed to delete the specific file.");
			}
				// Checking if the specific file exists after deletion
			if (specificFileToDelete.exists()) {
				System.out.println("The specific file still exists.");
			} else {
				System.out.println("The specific file has been deleted.");
				// Creating a directory with a specific path
				File specificDir = new File("C:\\Users\\Public\\specific_directory");
				if (specificDir.mkdir()) {
					System.out.println("Specific directory created: " + specificDir.getAbsolutePath());
				} else {
					System.out.println("Failed to create the specific directory.");
				}
				// Deleting the specific directory
				if (specificDir.delete()) {
					System.out.println("Deleted the specific directory: " + specificDir.getAbsolutePath());
				} else {
					System.out.println("Failed to delete the specific directory.");
				}
				// Checking if the specific directory exists after deletion
				if (specificDir.exists()) {
					System.out.println("The specific directory still exists.");
				} else {
					System.out.println("The specific directory has been deleted.");
					// Creating a file in a specific directory
					try {
						File fileInDir = new File("C:\\Users\\Public\\specific_directory\\file_in_dir.txt");
						if (fileInDir.createNewFile()) {
							System.out.println("File created in specific directory: " + fileInDir.getAbsolutePath());
						} else {
							System.out.println("File already exists in the specific directory.");
						}
					} catch (IOException e) {
						System.out.println("An error occurred while creating the file in the specific directory.");
						e.printStackTrace();
					}
					// Deleting the file in the specific directory
					File fileInDirToDelete = new File("C:\\Users\\Public\\specific_directory\\file_in_dir.txt");
					if (fileInDirToDelete.delete()) {
						System.out.println("Deleted the file in the specific directory: " + fileInDirToDelete.getAbsolutePath());
					} else {
						System.out.println("Failed to delete the file in the specific directory.");
					}
					// Checking if the file in the specific directory exists after deletion
					if (fileInDirToDelete.exists()) {
						System.out.println("The file in the specific directory still exists.");
					} else {
						System.out.println("The file in the specific directory has been deleted.");
					}
					// Deleting the specific directory after deleting the file inside it
					File specificDirToDelete = new File("C:\\Users\\Public\\specific_directory");
					if (specificDirToDelete.delete()) {
						System.out.println("Deleted the specific directory after deleting the file inside it: " + specificDirToDelete.getAbsolutePath());
					} else {
						System.out.println("Failed to delete the specific directory after deleting the file inside it.");
					}
					// Checking if the specific directory exists after deletion
					if (specificDirToDelete.exists()) {
						System.out.println("The specific directory still exists after deletion.");
					} else {
						System.out.println("The specific directory has been deleted after deleting the file inside it.");
					}
					// Creating a file with special characters in the name
					try {
						File specialCharFile = new File("special_char_file_!@#$%^&*().txt");
						if (specialCharFile.createNewFile()) {
							System.out.println("File with special characters created: " + specialCharFile.getAbsolutePath());
						} else {
							System.out.println("File with special characters already exists.");
						}
					} catch (IOException e) {
						System.out.println("An error occurred while creating the file with special characters.");
						e.printStackTrace();
					}
					// Deleting the file with special characters
					File specialCharFileToDelete = new File("special_char_file_!@#$%^&*().txt");
					if (specialCharFileToDelete.delete()) {
						System.out.println("Deleted the file with special characters: " + specialCharFileToDelete.getAbsolutePath());
					} else {
						System.out.println("Failed to delete the file with special characters.");
					}
					// Checking if the file with special characters exists after deletion
					if (specialCharFileToDelete.exists()) {
						System.out.println("The file with special characters still exists.");
					} else {
						System.out.println("The file with special characters has been deleted.");
					}
			}
		

		
		
	}

}
