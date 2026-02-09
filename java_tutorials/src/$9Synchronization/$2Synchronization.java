package $9Synchronization;

public class $2Synchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Synchronization in java
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
			System.out.println("Final count with synchronized block: " + syncBlockCounter.getCount());
			
			// static synchronized method example
			class StaticSynchronizedExample {
				private static int count = 0;
				
				public static synchronized void increment() {
					count++;
				}
				
				public static int getCount() {
					return count;
				}
			}
			Thread t5 = new Thread(() -> {
				for (int i = 0; i < 1000; i++) {
					StaticSynchronizedExample.increment();
				}
			});
			Thread t6 = new Thread(() -> {
				for (int i = 0; i < 1000; i++) {
					StaticSynchronizedExample.increment();
				}
			});
			t5.start();
			t6.start();
			try {
				t5.join();
				t6.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Final count with static synchronized method: " + StaticSynchronizedExample.getCount());
			
			// deadlock example
			class DeadlockExample {
				private final Object lock1 = new Object();
				private final Object lock2 = new Object();
				
				public void method1() {
					synchronized (lock1) {
						System.out.println("Thread 1: Holding lock 1...");
						try { Thread.sleep(100); } catch (InterruptedException e) {}
						System.out.println("Thread 1: Waiting for lock 2...");
						synchronized (lock2) {
							System.out.println("Thread 1: Holding lock 1 and lock 2...");
						}
					}
				}
				
				public void method2() {
					synchronized (lock2) {
						System.out.println("Thread 2: Holding lock 2...");
						try { Thread.sleep(100); } catch (InterruptedException e) {}
						System.out.println("Thread 2: Waiting for lock 1...");
						synchronized (lock1) {
							System.out.println("Thread 2: Holding lock 2 and lock 1...");
						}
					}
				}
			}
			DeadlockExample deadlockExample = new DeadlockExample();
			Thread t7 = new Thread(() -> {
				deadlockExample.method1();
			});
			Thread t8 = new Thread(() -> {
				deadlockExample.method2();
			});
			t7.start();
			t8.start();
			
			// inter-thread communication example
			class InterThreadCommunicationExample {
				private final Object lock = new Object();
				private boolean isProduced = false;
				
				public void produce() {
					synchronized (lock) {
						while (isProduced) {
							try { lock.wait(); } catch (InterruptedException e) {}
						}
						System.out.println("Produced an item.");
						isProduced = true;
						lock.notify();
					}
				}
				
				public void consume() {
					synchronized (lock) {
						while (!isProduced) {
							try { lock.wait(); } catch (InterruptedException e) {}
						}
						System.out.println("Consumed an item.");
						isProduced = false;
						lock.notify();
					}
				}
			}
			InterThreadCommunicationExample itcExample = new InterThreadCommunicationExample();
			Thread producer = new Thread(() -> {
				for (int i = 0; i < 5; i++) {
					itcExample.produce();
				}
			});
			Thread consumer = new Thread(() -> {
				for (int i = 0; i < 5; i++) {
					itcExample.consume();
				}
			});
			producer.start();
			consumer.start();
			
			// interrupting a thread example
			Thread interruptExample = new Thread(() -> {
				try {
					while (!Thread.currentThread().isInterrupted()) {
						System.out.println("Running...");
						Thread.sleep(500);
					}
				} catch (InterruptedException e) {
					System.out.println("Thread was interrupted.");
				}
			});
			interruptExample.start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			interruptExample.interrupt();
			
			//reentrant monitor example
			class ReentrantMonitorExample {
				public synchronized void methodA() {
					System.out.println("Inside method A");
					methodB();
				}
				
			 public synchronized void methodB() {
					System.out.println("Inside method B");
				}
			}
			ReentrantMonitorExample reentrantExample = new ReentrantMonitorExample();
			Thread t9 = new Thread(() -> {
				reentrantExample.methodA();
			});
			t9.start();
			
			// volatile keyword example
			class VolatileExample {
				private volatile boolean flag = false;
				
				public void setFlag() {
					flag = true;
				}
				
				public boolean getFlag() {
					return flag;
				}
			}
			VolatileExample volatileExample = new VolatileExample();
			Thread t10 = new Thread(() -> {
				while (!volatileExample.getFlag()) {
					// waiting for flag to be set
				}
				System.out.println("Flag is set!");
			});
			t10.start();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			volatileExample.setFlag();
		

	}

}
