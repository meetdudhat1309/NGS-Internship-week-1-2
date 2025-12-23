package collection.queue;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.*;

public class QueuesDemo {
    public static void main(String[] args) {
//        PriorityQueue(default min-heap: head = smallest ele): not thread-safe, ordered based on priority
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Arrays.asList(5,2,7,3,3,6,8,9,1,2,5,8,3));
        System.out.println(priorityQueue);
//        System.out.println(priorityQueue.poll());

//        Iterator<Integer> iterator = priorityQueue.iterator(); // iteration order = insertion order
//        while (iterator.hasNext()){
//            System.out.print(iterator.next()+" ");
//        }


//        ArrayDeque: array based queue - acts as Stack and Queue
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

//        ConcurrentLinkedQueue: thread-safe FIFO queue
        ConcurrentLinkedQueue<Integer> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();

//        ConcurrentLinkedDeque: thread-safe double ended deque
        ConcurrentLinkedDeque<Integer> concurrentLinkedDeque = new ConcurrentLinkedDeque<>();

//        ArrayBlockingQueue: bounded - fixed size, thread-safe, put() method block if queue is full and take() method block if it is empty
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(5);

//        LinkedBlockingQueue: thread-safe blocking, bounded size(optional)
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>();

//        PriorityBlockingQueue: thread-safe, priority based blocking queue, unbounded, take() method block if queue is empty, ordering by priority
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

//        DelayQueue: queue of elements that become available after delay, its elements must implement Delayed interface
        DelayQueue<DelayedTask> delayQueue = new DelayQueue<>();

//        SynchronousQueue: no capacity queue (size=0), each put() waits for take() and vice versa.
        SynchronousQueue<Integer> synchronousQueue = new SynchronousQueue<>();

//        LinkedTransferQueue: thread-safe, unbounded queue
        LinkedTransferQueue<Integer> linkedTransferQueue = new LinkedTransferQueue<>();
//        linkedTransferQueue.transfer(4); // transfer element(4) to the consumer if there is no consumer waiting then add element to the end of the queue
//        linkedTransferQueue.tryTransfer(4); // transfer element(4) to the consumer immediately(for specified waiting time) if consumer available otherwise returning false without adding element to the queue.





    }
}

class DelayedTask implements Delayed{

    long time;

    public DelayedTask(long delay) { // delay: time to delay the task
        this.time = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(time-System.currentTimeMillis(), TimeUnit.MILLISECONDS); // convert delay time from given time unit to milliseconds
    }

    @Override
    public int compareTo(Delayed d) {
        return Long.compare(this.time, ((DelayedTask)d).time); // compare time of current object to provided object d(which can be Delayed task or any other class which implements Delayed class)
    }
}