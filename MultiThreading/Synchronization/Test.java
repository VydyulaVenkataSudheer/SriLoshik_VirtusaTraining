
public class Test {
	public static void main(String[] args) {
		PrinterThread p1=new PrinterThread("Hello..","There"); 
		Thread t=new Thread(p1);
		t.start();
		StringPrinter p2=new StringPrinter("How are you");
		Thread t1=new Thread(p2);
		t1.start();
		SyncExMain p3=new SyncExMain("Thank you, ","very Much");
		Thread t2=new Thread(p3);
		t2.start();
		
		
		
	}

}
