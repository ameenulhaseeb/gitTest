package test;
class A implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
		System.out.println("Hi");
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
