package pub.guoxin.bbp;

import pub.guoxin.bbp.service.Consumer;
import pub.guoxin.bbp.service.EggBasket;
import pub.guoxin.bbp.service.Producer;

/**
 * Created by guoxin on 17-10-4.
 */
public class Application {

    public static void main(String[] args) {

        EggBasket basket = new EggBasket(10);

        Producer chicken1 = new Producer("chicken1", basket, 3);
        Producer chicken2 = new Producer("chicken2", basket, 5);

        Consumer consumer1 = new Consumer("consumer1",basket,3);
        Consumer consumer2 = new Consumer("consumer2",basket,5);

        new Thread(chicken1).start();
        new Thread(chicken2).start();

        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
