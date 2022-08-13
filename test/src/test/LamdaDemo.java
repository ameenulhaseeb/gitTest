package test;

public class LamdaDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(()-> {
			for (int i=1;i<=5;i++) {
				System.out.println("First");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		t1.start();
		Thread.sleep(10);
	
		Thread t2 = new Thread(()-> {
			for (int i=1;i<=5;i++) {
				System.out.println("Second");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t2.start();
		

	}

}
