package pub.guoxin.bbp.service;

import pub.guoxin.bbp.model.Egg;
import pub.guoxin.bbp.utils.RandomUtil;

/**
 * 生产者（鸡）
 * <p>
 * Created by guoxin on 17-10-4.
 */
public class Producer extends AbstractProducerConsumer implements Runnable {

    public Producer(String name, EggBasket basket, int interval) {
        super(name, basket, interval);
    }

    public void run() {
        while (true) {
            try {
                Egg egg = new Egg(RandomUtil.randomInt());
                System.out.println("[" + name + "] 准备生产鸡蛋" + egg.toString() + ".");
                try {
                    basket.push(egg);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("[" + name + "] 已经生产鸡蛋" + egg.toString() + ".");
                System.out.println("==================================");
                Thread.sleep(interval * ONE_SECOND);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
