package pub.guoxin.bbp;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 装鸡蛋的篮子
 * <p>
 * Created by guoxin on 17-10-4.
 */
public class EggBasket {

    private int capacity = 10; // 容器大小

    private BlockingQueue<Egg> eggs = new LinkedBlockingQueue<Egg>(capacity); // 阻塞队列

    public EggBasket(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 把product加到BlockingQueue里,如果BlockQueue没有空间,则调用此方法的线程被阻断直到BlockingQueue里面有空间再继续.
     *
     * @param egg
     * @throws InterruptedException
     */
    public void push(Egg egg) throws InterruptedException {
        eggs.put(egg);
    }

    public Egg pop() throws InterruptedException {
        return eggs.take();
    }

}
