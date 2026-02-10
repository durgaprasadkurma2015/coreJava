package $5oops;

public class oops1 {

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
		
		// inheritance
		class Animal {
			public void eat() {
				System.out.println("This animal eats food.");
			}
		}
		
		class Dog extends Animal {
			public void bark() {
				System.out.println("The dog barks.");
			}
		}
		
		// Creating an object of the Dog class
		Dog dog = new Dog();
		dog.eat(); // Inherited method
		dog.bark(); // Dog's own method
		
		// Polymorphism
		class Shape {
			public void draw() {
				System.out.println("Drawing a shape.");
			}
		}
		
		class Circle extends Shape {
			@Override
			public void draw() {
				System.out.println("Drawing a circle.");
			}
		}
		
		class Square extends Shape {
			@Override
			public void draw() {
				System.out.println("Drawing a square.");
			}
		}
		
		// Creating objects of Circle and Square
		Shape shape1 = new Circle();
		Shape shape2 = new Square();
		shape1.draw(); // Calls Circle's draw method
		shape2.draw(); // Calls Square's draw method
		
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
		Circle circle = new Circle();
		circle.draw(); // Calls the draw method of Circle
		
		// Creating an anonymous subclass of Shape
		Shape shape = new Shape() {
			void draw() {
				System.out.println("Drawing an anonymous shape.");
			}
		};
		shape.draw(); // Calls the draw method of the anonymous subclass
			
		// Example of using an interface
		interface Drawable {
			void draw();
		}
		
		class Rectangle implements Drawable {
			public void draw() {
				System.out.println("Drawing a rectangle.");
			}
		}
		
		// Creating an object of the Rectangle class
		Drawable drawable = new Rectangle();
		drawable.draw(); // Calls the draw method of Rectangle
		
		// Method Overloading
			// Example of method overloading
		class MathUtils {
			public int add(int a, int b) {
				return a + b;
			}

			public double add(double a, double b) {
				return a + b;
			}
				
			public int add(int a, int b, int c) {
				return a + b + c;
					
				// Main method to test the overloaded methods
				// Creating an object of MathUtils
				MathUtils mathUtils = new MathUtils();
				// Testing the overloaded add methods
				System.out.println("Sum of 2 integers: " + mathUtils.add(5, 10));
				System.out.println("Sum of 2 doubles: " + mathUtils.add(5.5, 10.5));
				System.out.println("Sum of 3 integers: " + mathUtils.add(5, 10, 15));
				
				// Method Overriding
				class Parent {
					void display() {
						System.out.println("This is the parent class.");
					}
				}
				class Child extends Parent {
					@Override
					void display() {
						System.out.println("This is the child class.");
					}
				}
				// Creating an object of the Child class
				Child child = new Child();
				child.display(); // Calls the overridden method in Child
				// Polymorphism with method overriding
				Parent parent = new Child(); // Upcasting
				parent.display(); // Calls the overridden method in Child
				
				// Example of using 'this' keyword
				class Person {
					String name;
					int age;

					Person(String name, int age) {
						this.name = name; // 'this' refers to the current object's name
						this.age = age;   // 'this' refers to the current object's age
					}

					void display() {
						System.out.println("Name: " + this.name + ", Age: " + this.age);
					}
				}
				// Creating an object of the Person class
				Person person1 = new Person("Bob", 25);
				person1.display(); // Calls the display method of Person
				
				// Example of using 'super' keyword
				class Parent {
					void display() {
						System.out.println("This is the parent class.");
					}
				}
				class Child extends Parent {
					@Override
					void display() {
						super.display(); // Calls the display method of the parent class
						System.out.println("This is the child class.");
					}
				}
				// Creating an object of the Child class
				Child child1 = new Child();
				child1.display(); // Calls the display method of Child, which also calls the parent's display method
				
				// Example of using static members
				class MathUtils {
					static int add(int a, int b) {
						return a + b;
					}
				}
				// Calling the static method without creating an object
				int result = MathUtils.add(10, 20);
				System.out.println("Result of static add method: " + result);
				
				// Example of using final keyword
				final class FinalClass {
					void
					 display() {
						System.out.println("This is a final class.");
					}
					
					// Final method
					final void finalMethod() {
						System.out.println("This is a final method.");
					}
					
					// Final variable
					final int finalVariable = 100;
					
					// Main method to test final class, method, and variable
					public static void main(String[] args) {
						FinalClass finalClass = new FinalClass();
						finalClass.display();
						finalClass.finalMethod();
						System.out.println("Final variable value: " + finalClass.finalVariable);
					}

	}

}
