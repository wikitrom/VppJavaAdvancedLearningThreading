package EvenNumbers;

public class EvenTask implements Runnable {

	private EvenNumberHolder evnh;

	// Constructors
	public EvenTask(EvenNumberHolder evnh) {
		this.evnh = evnh;
	}

	// public methods
	@Override
	public void run() {

		System.out.println("New EvenTask thread started " + Thread.currentThread().getName());
		
//		for (int i = 0; i < 10; i++) {
		while (true) {
			System.out.println(Thread.currentThread().getName() + " has got number " + evnh.getNextEven());
			try {
//				int sleepTime = (int) (Math.random() * 500);
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("EvenTask thread " + Thread.currentThread().getName() + " finished");

	}

}
