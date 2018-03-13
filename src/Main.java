
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Thread[] myThreads = new Thread[10];
		NumbersTask nTask = new NumbersTask();

		System.out.println("Starting (Main)");
		myThreads[0] = new Thread(nTask);
		myThreads[0].start();

		// create 4 more threads in a loop
		for (int i = 1; i < 5; i++) {
			myThreads[i] = new Thread(nTask);
			myThreads[i].start();
		}

		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			myThreads[i].interrupt();

		}

		System.out.println("Finished (Main)");
	}

}
