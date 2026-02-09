package $5oops;

public class oops1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// use all oops concepts in a single program
		
		// Example of Encapsulation
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
		
		
		// Example of Inheritance
		class Animal {
			public void sound() {
				System.out.println("Animal makes a sound");
			}
		}
		
		// Dog class inherits from Animal class
		class Dog extends Animal {
			@Override
			public void sound() {
				System.out.println("Dog barks");
			}
		}
		
		// Creating an object of Dog class
		Dog dog = new Dog();
		dog.sound(); // Output: Dog barks
		
		// Example of Polymorphism
		Animal myAnimal = new Dog(); // Upcasting
		myAnimal.sound(); // Output: Dog barks
		
		// Example of Abstraction
		abstract class Shape {
			abstract void draw();
		}
		
		// Circle class extends Shape
		class Circle extends Shape {
			@Override
			void draw() {
				System.out.println("Drawing a Circle");
			}
		}
		
		// Creating an object of Circle class
		Shape shape = new Circle();
		shape.draw(); // Output: Drawing a Circle
		
		// End of main method
		

	}

}
