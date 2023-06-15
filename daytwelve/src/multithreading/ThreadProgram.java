package multithreading;

public class ThreadProgram extends Thread{
	
	public void run() {
		System.out.println("Thread is in running state");
	}

	public static void main(String[] args) {
		//ThreadProgram.run();
		ThreadProgram t = new ThreadProgram();
		t.start();
		//t.start();

	}

}
