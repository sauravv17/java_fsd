package multithreading;

public class priority_tut {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		Thread t1= new Thread(new adCampaign());
		Thread t2= new Thread(new pollResearch());
		
		t1.setName("adCampaign");
		t2.setName("pollResearch");
		
		t1.start();
		t2.start();
		
		System.out.println("inside main......");

	}
}

class adCampaign implements Runnable{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}

class pollResearch implements Runnable{
	@Override
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
