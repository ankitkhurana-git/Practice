package proj;

public class Test {
public static void main(String[] args) {
	new NewThread();
}
}


class NewThread implements Runnable{
	Thread t1, t2;
	 NewThread() {
		t1 = new Thread(this, "Thread_1");
		t2= new Thread(this, "Thread_2");
		t1.start();
		t2.start();
	}
	public void run() {
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.equals(t2));
	}
}