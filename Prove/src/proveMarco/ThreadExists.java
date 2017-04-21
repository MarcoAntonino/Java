package proveMarco;

public class ThreadExists {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		t.setName("Il primo thread di Marco");
		t.setPriority(10);
		System.out.println("Thread in esecuzione: "+t);
		for (int n = 5; n>0; n--)
		{
			System.out.println(""+n);
			try {
				t.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
