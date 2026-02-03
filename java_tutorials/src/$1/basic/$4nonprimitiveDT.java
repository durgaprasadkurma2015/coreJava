package $1.basic;


public class $4nonprimitiveDT {
	public static void main(String[] args) {
		// interface
		 Dog dog = new Dog();
	        dog.sound();
		// enum
	        Day day = Day.MONDAY;
	       System.out.println("Day: " + day);
	       // annotation
	       System.out.println("Annotation Example"); 
	        //  String
		  String stringValue = "Hello, Java!";
	        System.out.println("String Value: " + stringValue);
	        // array
	        int[] arrayValue = {1, 2, 3, 4, 5};
	        System.out.print("Array Values: ");
	        for (int i : arrayValue) {
	            System.out.print(i + " ");
	        }
	        System.out.println();
	        // class
	        Person person = new Person("John", 30);
	        System.out.println("Person Name: " + person.getName());
	        System.out.println("Person Age: " + person.getAge());
	    }
	}

// annotated
@MyAnnotation(value = "Example")
 
// class
	class Person {
	    private String name;
	    private int age;

	    Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	}

}
	// interface
	interface Animal {
	    void sound();
	}

	class Dog implements Animal {
	    public void sound() {
	        System.out.println("Barks");    
	    }
	}
	enum Day {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}
	
	// annotation
	@interface MyAnnotation {
	    String value();
	}


	