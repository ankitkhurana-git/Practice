import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Just implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "ankit";
	}

}

public class Main {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(4);
		Future<String> f = executorService.submit(new Just());
		System.out.println(f.isDone());
		try {
			System.out.println(f.get());
			System.out.println(f.isDone());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}