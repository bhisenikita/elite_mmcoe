package threaddd;

public class SyncDemo implements Runnable {
	@Override
	public void run() {
		String tname = Thread.currentThread().getName();
		print(tname);
		
	}
	
	private void print(String name) {
		try {
			System.out.println("[");
			Thread.sleep(1000);
			System.out.println(name);
			Thread.sleep(1000);
			System.out.println("]");
			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SyncDemo sd = new SyncDemo();
		
		Thread t1 = new Thread(sd, "Alpha");
		Thread t2 = new Thread(sd, "Beta");
		Thread t3 = new Thread(sd, "Gama");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
