总结：
1：对于map/set的选择使用
HashMap
TreeMap
LinkedHashMap

并发低点
Hashtable
Collections.sychronizedXXX

并发高
ConcurrentHashMap      
ConcurrentSkipListMap  排序

2：队列
ArrayList
LinkedList
Collections.synchronizedXXX
CopyOnWriteList
Queue
	CocurrentLinkedQueue //为什么没有 concurrentArrayQueue  并发加锁
	 /*阻塞式的容器*/
	BlockingQueue
		LinkedBQ  
		ArrayBQ    有界队列。。。。
		TransferQueue
		SynchronusQueue
	DelayQueue执行定时任务
		
	