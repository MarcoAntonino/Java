package threading;

public class TestCountDown {

	public static void main(String[] args) {
		CountDown c = new CountDown();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
