
public class ThreadExMain {

	public static void main(String[] args) {
		ThreadEx th=new ThreadEx();
Thread t=new Thread(th);
t.setPriority(5);
t.setName("Thread");
t.start();

	}

}
