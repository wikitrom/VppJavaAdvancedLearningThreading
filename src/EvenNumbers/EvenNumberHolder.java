package EvenNumbers;

public class EvenNumberHolder {
	private static int currentEven = 0;

	public int getNextEven() {

		// not an atomic operation, thread could swap out after first increment
		// currentEven++;
		// currentEven++;

		// this is not an atomic operation either
		currentEven += 2;

		// solution: synchronization should be used		
		
		return currentEven;
	}

}
