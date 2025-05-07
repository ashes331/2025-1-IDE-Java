package proj0507;

public class TimerThread extends Thread {
	
	int n = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
				n++;
				System.out.println(n);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerThread th = new TimerThread();
		th.start();

	}

}
