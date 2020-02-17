package How_to_create_thread;
public class Multi extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		System.out.println("Thread is running...from Thread class");
	}
	
	public static void main(String[] args) {
		Multi t1=new Multi();
		t1.start();
	}//main()
}// class
