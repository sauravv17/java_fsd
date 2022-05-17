package multithreading;

public class create_thread {
	public static void main(String[] args) {
		Task task =new Task();
		Thread thread =new Thread(task);
		thread.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		someFuncCalled();
		System.out.println("inside main....");
	}

	private static void someFuncCalled() {
		System.out.println("called function.....");
	}
}
class Task implements Runnable{
	@Override
	public void run() {
		System.out.println("Inside run in Task...");
	}
}