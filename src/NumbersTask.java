
public class NumbersTask implements Runnable {

	private void longRunningMethod() throws InterruptedException {

		Double j = 1.01;

		System.out.println("Starting: longRunningMethod");
		for (long t = 1; t < 1000000000000000l; t++) {
			j += 1.01;
			if (Thread.interrupted()) {
				throw new InterruptedException();
			}
		}
		System.out.println("Ending: longRunningMethod");
	}

	@Override
	public void run() {

		System.out.println("New NumbersTask thread started " + Thread.currentThread().getName());
		for (int i = 1; i <= 1000000000; i++) {
			System.out.println("task number" + Thread.currentThread().getName() + " is outputting number " + i);
			try {
				longRunningMethod();
			} catch (InterruptedException e) {
//				break;
				Thread.currentThread().interrupt();
			}

			if (Thread.interrupted()) {
				break;
			}
		}
		System.out.println("NumbersTask thread " + Thread.currentThread().getName() + " finished");
	}

}
