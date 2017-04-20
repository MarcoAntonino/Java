package threading;

public class TestPingPong {

	public static void main(String[] args) {
		
		PingPong ping = new PingPong("ping",5000);
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PingPong pong = new PingPong("pong",5000);

	}

}
