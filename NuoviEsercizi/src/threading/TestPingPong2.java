package threading;

public class TestPingPong2 {

	public static void main(String[] args) {
		
		PingPong2 ping = new PingPong2("Ping", 5000);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PingPong2 pong = new PingPong2("Pong", 5000);


	}

}
