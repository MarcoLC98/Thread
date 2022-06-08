package Threads;

public class Launch {
	public static void main(String[] args) {

		ThreadOne threadOne = new ThreadOne();

		Thread threadTwo = new Thread(new ThreadTwo());

		threadOne.start();
		threadTwo.start();
	}
}