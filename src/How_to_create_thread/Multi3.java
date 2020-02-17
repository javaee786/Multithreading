package How_to_create_thread;

public class Multi3 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running...from Runnable interface");
	}

	public static void main(String[] args) {
		Multi3 m1 = new Multi3();
		Thread t1 = new Thread(m1);
		t1.start();
	}// main()
}// class
