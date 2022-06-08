package Threads;

public class ThreadTwo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println("Process two");
		}
	}
}
