package EvenNumbers;

public class Generator {

	public static void main(String[] args) {
		int numberOfThreads = 15;
		Thread[] myThreads = new Thread[numberOfThreads];
		EvenNumberHolder evnh = new EvenNumberHolder();		
		EvenTask task = new EvenTask(evnh);

		System.out.println("Starting (Main) - using " + numberOfThreads + " threads");

		// create 5 threads in a loop
		for (int i = 0; i < numberOfThreads; i++) {
			myThreads[i] = new Thread(task);
			myThreads[i].start();
		}
		System.out.println("Finished (Main)");

	}

}
