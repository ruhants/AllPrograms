package Threads;

public class ThreadSkip10andPrint {
	public static void main(String[] args) throws InterruptedException {

		Thread thread1 = new Thread(() -> {
			for (int i = 1; i <= 10; i++) {
				if (i == 10) {
					continue;
				}
				System.out.println("Thread 1 printing: " + i);
			}
		});

		Thread thread2 = new Thread(() -> {
			System.out.println("Thread 2 printing: 10");
		});

		thread1.start();

		thread1.join();

		thread2.start();
	}
}
