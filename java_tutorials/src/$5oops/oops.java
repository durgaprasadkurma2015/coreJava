package $5oops;

public class oops {

	public static void main(String[] args) {
		// object oriented programming system
		// Example of a simple class
		class Car {
			// Attributes
			String color;
			String model;

			// Constructor
			public Car(String color, String model) {
				this.color = color;
				this.model = model;
			}

			// Method
			public void displayDetails() {
				System.out.println("Car Model: " + model + ", Color: " + color);
			}
		}
		  // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota");
        // Calling a method on the object
        myCar.displayDetails();
		
// Encapsulation
		class Person {
			// Private attributes
			private String name;
			private int age;

			// Public getter and setter methods
			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				if (age > 0) { // Simple validation
					this.age = age;
				}
			}
		}

		// Creating an object of the Person class
		Person person = new Person();
		person.setName("Alice");
		person.setAge(30);
		System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());
		
		// Inheritance
		class Animal {
			void sound() {
				System.out.println("Animal makes a sound");
			}
		}
		class Dog extends Animal {
			void sound() {
				System.out.println("Dog barks");
			}
		}
		// Creating an object of the Dog class
		Dog dog = new Dog();
		dog.sound(); // Calls the overridden method
		
		// Polymorphism
		Animal myAnimal = new Dog(); // Upcasting
		myAnimal.sound(); // Calls the Dog's sound method
		
		// Abstraction
		abstract class Shape {
			abstract void draw();
		}
		
		// Subclass of Shape
		class Circle extends Shape {
			void draw() {
				System.out.println("Drawing a Circle");
			}
		}	
		// Creating an object of the Circle class
		Shape shape = new Circle();
		shape.draw(); // Calls the draw method of Circle
	
		// Method Overloading
				class MathOperations {
					// Overloaded method for addition of two integers
					int add(int a, int b) {
						return a + b;
					}

					// Overloaded method for addition of three integers
					int add(int a, int b, int c) {
						return a + b + c;
					}

					// Overloaded method for addition of two doubles
					double add(double a, double b) {
						return a + b;
					}
				}
				MathOperations mathOps = new MathOperations();
				System.out.println("Sum of two integers: " + mathOps.add(5, 10));
				System.out.println("Sum of three integers: " + mathOps.add(5, 10, 15));
				System.out.println("Sum of two doubles: " + mathOps.add(5.5, 10.5));
			
				
				
	}

}
