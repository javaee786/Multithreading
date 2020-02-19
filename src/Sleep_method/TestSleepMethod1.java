package Sleep_method;

public class TestSleepMethod1 extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();

		t1.start();
		t2.start();
	}
}//class

/*
 * 1.As you know well that at a time only one thread is executed. 
 * 2.If you sleep a thread for the specified time,
 * the thread shedular picks up another thread and so on.
 */
