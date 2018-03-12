
public class NumbersTask implements Runnable {

	@Override
	public void run() {

		System.out.println("New NumbersTask thread started " + Thread.currentThread().getName());
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				int sleepTime = (int) (Math.random() * 500);
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("NumbersTask thread " + Thread.currentThread().getName() + " finished");
	}

}
