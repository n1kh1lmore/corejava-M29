package multithreading;

public class MyRunnableThread implements Runnable{


	@Override
	public void run() {
		System.out.println("Thread is in running state");
		
	}
	
	public static void main(String[] args) {
		
		MyRunnableThread t = new MyRunnableThread();
		t.run(
				);

	}

}