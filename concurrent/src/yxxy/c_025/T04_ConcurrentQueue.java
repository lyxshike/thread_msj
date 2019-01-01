package yxxy.c_025;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class T04_ConcurrentQueue {
	public static void main(String[] args) {
		Queue<String> strs = new ConcurrentLinkedQueue<>();
		
		for(int i=0; i<10; i++) {
			strs.offer("a" + i);  //add
		}
		
		System.out.println(strs);
		
		System.out.println(strs.size());
		
		System.out.println(strs.poll()); //拿出来，并且从queue中删除
		System.out.println(strs.size());
		
		System.out.println(strs.peek()); // 拿出来， 不删除。。。
		System.out.println(strs.size());
		
		//双端队列Deque
	}
}
