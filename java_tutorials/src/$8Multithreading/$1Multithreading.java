package $8Multithreading;

public class $1Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Example of creating a thread by extending Thread class
		class MyThread extends Thread {
			@Override
			public void run() {
				System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
			}
		}
		MyThread thread1 = new MyThread();
		MyThread thread2 = new MyThread();
		thread1.start();
		thread2.start();
		
		// Example of creating a thread by implementing Runnable interface
		class MyRunnable implements Runnable {
			@Override
			public void run() {
				System.out.println("Runnable Thread " + Thread.currentThread().getName() + " is running.");
			}
		}
		
		// Creating threads using Runnable interface
		Thread thread3 = new Thread(new MyRunnable());
		Thread thread4 = new Thread(new MyRunnable());
		thread3.start();
		thread4.start();
		
		// Example of using synchronized method
		class Counter {
			private int count = 0;
			
			public synchronized void increment() {
				count++;
			}
			
			public int getCount() {
				return count;
			}
		}
		
		// Creating multiple threads to increment the counter
		Counter counter = new Counter();
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});
		
		// Creating another thread to increment the counter
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				counter.increment();
			}
		});
		
		// Starting the threads
		t1.start();
		t2.start();
		
		// Waiting for threads to finish
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// Printing the final count
		System.out.println("Final count: " + counter.getCount());
		
		// Example of using synchronized block
		class SynchronizedBlockExample {
			private int count = 0;
			
			public void increment() {
				synchronized (this) {
					count++;
				}
			}
			
			public int getCount() {
				return count;
			}
		}
		SynchronizedBlockExample syncBlockExample = new SynchronizedBlockExample();
		Thread t3 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				syncBlockExample.increment();
			}
		});
		Thread t4 = new Thread(() -> {
			for (int i = 0; i < 1000; i++) {
				syncBlockExample.increment();
			}
		});
		t3.start();
		t4.start();
		try {
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Final count with synchronized block: " + syncBlockExample.getCount());
		// End of main method
	}

}
