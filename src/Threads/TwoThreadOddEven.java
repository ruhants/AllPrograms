package Threads;

public class TwoThreadOddEven {

	public static void main(String[] args) {

		Thread oddThread = new Thread(() -> {
			for (int i = 1; i < 10; i += 2) {
				System.out.println("OddThread : " + i);
			}
		});

		Thread evenThread = new Thread(() -> {
			for (int i = 2; i < 10; i += 2) {
				System.out.println("EvenThread : " + i);
			}
		});

		oddThread.start();
		evenThread.start();
	}
}
