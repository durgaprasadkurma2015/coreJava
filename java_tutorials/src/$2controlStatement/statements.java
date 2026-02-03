package $2controlStatement;

public class statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// If-Else Statement
		int number = 10;
		// Check if the number is even or odd
		if (number % 2 == 0) {
			System.out.println(number + " is even.");
			
			// Nested If Statement
			if (number % 3 == 0) {
				System.out.println(number + " is also divisible by 3.");
			}
			else if (number % 4 == 0) {
				System.out.println(number + " is also divisible by 4.");
			}
		} else {
			System.out.println(number + " is odd.");
		}

		// Switch Statement
		int day = 3;
		String dayName;
		switch (day) {
			case 1:
				dayName = "Monday";
				break;
			case 2:
				dayName = "Tuesday";
				break;
			case 3:
				dayName = "Wednesday";
				break;
			case 4:
				dayName = "Thursday";
				break;
			case 5:
				dayName = "Friday";
				break;
			case 6:
				dayName = "Saturday";
				break;
			case 7:
				dayName = "Sunday";
				break;
			default:
				dayName = "Invalid day";
		}
		System.out.println("Day " + day + " is " + dayName);
		
// Looping Statements
		// while loop
	        while (number < 3) {
	            System.out.println("Count: " + number);
	            number++;       
	}
	  
	 // do-while loop
	        int j = 0;
	        do {
	            System.out.println("j: " + j);
	            j++;
	        } while (j < 3);
	        	
	 // for loop	  
	        for (int i = 0; i < 3; i++) {
	            System.out.println("i: " + i);
	        }
	      
	  // for-each loop
	        int[] numbers = {1, 2, 3, 4, 5};
	        for (int num : numbers) {
	            System.out.println("Number: " + num);
	        }	
	        
	    // break and continue
	        for (int i = 0; i < 10; i++) {
	            if (i == 5) {
	                System.out.println("Breaking the loop at i = " + i);
	                break;
	            }
	            if (i % 2 == 0) {
	                System.out.println("Skipping even number: " + i);
	                continue;
	            }
	            System.out.println("Current value of i: " + i);
	        }
	        
	   // return statement
	        System.out.println("Return Statement Example:");
	        int result = sum(5, 10);        
	        System.out.println("Sum: " + result);        

	}
	private static int sum(int i, int j) {
		return i + j;
	}
	
	}
