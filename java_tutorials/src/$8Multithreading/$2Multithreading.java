package $8Multithreading;

public class $2Multithreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Muthreading in java
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
		// Starting the second thread
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
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
			// Creating multiple threads to increment the counter using synchronized block
			SynchronizedBlockExample syncBlockCounter = new SynchronizedBlockExample();
			Thread t3 = new Thread(() -> {
				for (int i = 0; i < 1000; i++) {
					syncBlockCounter.increment();
				}
			});
			Thread t4 = new Thread(() -> {
				for (int i = 0; i < 1000; i++) {
					syncBlockCounter.increment();
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
			
			System.out.println("Final count using synchronized block: " + syncBlockCounter.getCount());
				
			// Thread life cycle in java.
			 // Thread states: New, Runnable, Blocked, Waiting, Timed Waiting, Terminated
			 // Thread priorities: MIN_PRIORITY, NORM_PRIORITY, MAX_PRIORITY
			 // Thread scheduling: Preemptive, Time-slicing
			 // Thread synchronization: synchronized methods, synchronized blocks, locks, semaphores
			 // Thread communication: wait(), notify(), notifyAll()
			 // Thread groups: ThreadGroup class to group threads together
			 // Thread safety: Ensuring that shared resources are accessed by only one thread at a time to prevent data corruption
			 // Thread pools: Executor framework to manage a pool of threads for executing tasks
			 // Thread interruption: interrupting a thread to signal it to stop or perform some action
			 // Thread local variables: ThreadLocal class to create variables that are local to each thread
			 // Thread dump: A snapshot of all threads and their states for debugging purposes
			// End of main method
			
			// How to create a thread in java:
			// 1. Extending the Thread class
			// 2. Implementing the Runnable interface
			// 3. Using lambda expressions (Java 8 and above)
			// Example of creating a thread by extending the Thread class
			// class MyThread extends Thread {
			// 	@Override
			// 	public void run() {
			// 		System.out.println("Thread " + Thread.currentThread().getName() + " is running.");
			// 	}
			// }
				// Creating threads using the MyThread class
				// MyThread thread1 = new MyThread();
				// MyThread thread2 = new MyThread();
				// thread1.start();
				// thread2.start();
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
				
				// Thread scheduling in java:
				// 1. Preemptive scheduling: The thread with the highest priority is selected to run next.
				// 2. Time-slicing: Each thread is given a fixed time slice to run, and then the next thread is selected to run.
				// Thread priorities in java:
				// 1. MIN_PRIORITY: The lowest priority (value 1)
				// 2. NORM_PRIORITY: The default priority (value 5)/
				// 3. MAX_PRIORITY: The highest priority (value 10)
				// Example of setting thread priorities
				Thread thread5 = new Thread(new MyRunnable());
				Thread thread6 = new Thread(new MyRunnable());
				thread5.setPriority(Thread.MIN_PRIORITY);
				thread6.setPriority(Thread.MAX_PRIORITY);
				thread5.start();
				thread6.start();
				
				// Thread synchronization in java:
				
			
			
			

	}

}
