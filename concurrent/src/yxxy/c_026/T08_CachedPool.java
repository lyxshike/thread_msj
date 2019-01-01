package yxxy.c_026;
// cachedThreadPool,  刚开始线程中没有线程， 来了一个任务才启的，  最多不封顶， 取决于自己的系统
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class T08_CachedPool {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool();// 线程超过60S之后， 就会自己shutdown
		System.out.println(service);
		for (int i = 0; i < 2; i++) {
			service.execute(() -> {
				try {
					TimeUnit.MILLISECONDS.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			});
		}
		System.out.println(service);
		TimeUnit.SECONDS.sleep(5);
		System.out.println(service);
		TimeUnit.SECONDS.sleep(80);
		
		System.out.println(service);
		
		
	}
}
