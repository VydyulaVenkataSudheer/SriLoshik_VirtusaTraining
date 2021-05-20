public class ThreadEx extends Thread {
	public void run()
	{
		System.out.println( "priority of thread is"+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName() + "is running");
		for(int i=0;i<5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
