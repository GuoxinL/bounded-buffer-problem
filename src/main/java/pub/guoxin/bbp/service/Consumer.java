package pub.guoxin.bbp.service;

import pub.guoxin.bbp.model.Egg;

/**
 * Created by guoxin on 17-10-4.
 */
public class Consumer extends AbstractProducerConsumer implements Runnable {

    public Consumer(String name, EggBasket basket, int interval) {
        super(name, basket, interval);
    }

    public void run() {
        try {
            System.out.println("[" + name + "] 准备消费鸡蛋.");
            Egg egg = null;
            egg = basket.pop();
            System.out.println("[" + name + "] 已经生产鸡蛋" + (egg != null ? egg.toString() : "null") + ".");
            System.out.println("==================================");
            Thread.sleep(interval * ONE_SECOND);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
