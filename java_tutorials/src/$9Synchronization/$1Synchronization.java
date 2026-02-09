package $9Synchronization;

public class $1Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
			// Starting the threads
			t3.start();
			t4.start();
			try {
				t3.join();
				t4.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Final count with synchronized block: " + syncBlockCounter.getCount());
			// End of main method
	}

}
