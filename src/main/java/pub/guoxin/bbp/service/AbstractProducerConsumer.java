package pub.guoxin.bbp.service;

import com.sun.istack.internal.NotNull;

/**
 * 生产者/消费者抽象类
 * <p>
 * Created by guoxin on 17-10-4.
 */
public abstract class AbstractProducerConsumer {

    protected static final int ONE_SECOND = 1000;

    protected String    name;           // 生产者/消费者姓名
    protected EggBasket basket;         // 消费队列，在当前场景下比喻装/取鸡蛋的篮子
    protected int       interval = 2;   // 生产者/消费者时间间隔，在当前场景下比喻鸡下蛋速度各不相同，单位：秒

    public AbstractProducerConsumer(@NotNull String name, @NotNull EggBasket basket, @NotNull int interval) {
        this.name       = name;
        this.basket     = basket;
        this.interval   = interval;
    }

}
