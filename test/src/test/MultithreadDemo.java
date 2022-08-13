package test;
class Hi extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hi");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

class Hello extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hello");
		}
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
public class MultithreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hi ob1 = new Hi();
		
		Hello ob2 = new Hello();
		
		ob1.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ob2.start();
		
	}

}
