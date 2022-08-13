package test;
class A implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hi");
		}
		try {
			Thread.sleep(5000000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class B implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hello");
		}
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		A obj1 = new A();
		B obj2 = new B();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		

	}

}
