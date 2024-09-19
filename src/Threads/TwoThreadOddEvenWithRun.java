package Threads;

public class TwoThreadOddEvenWithRun implements Runnable {

	private int max = 10;
	private int number = 1;

	public TwoThreadOddEvenWithRun(int max, int number) {
		super();
		this.max = max;
		this.number = number;
	}

	@Override
	public void run() {

		while (number < max) {
			if ((number % 2 == 0 && Thread.currentThread().getName().equals("eventhread"))
					|| (number % 2 != 0 && Thread.currentThread().getName().equals("oddnumber"))) {

				System.out.println(Thread.currentThread().getName() + " " + number);

				number++;
				
			}

		}
	}

	public static void main(String[] args) {
		TwoThreadOddEvenWithRun oddEvenWithRun = new TwoThreadOddEvenWithRun(10, 1);
		Thread oddthread = new Thread(oddEvenWithRun, "oddnumber");
		Thread eveThread = new Thread(oddEvenWithRun, "eventhread");
		oddthread.start();
		eveThread.start();
	}
}