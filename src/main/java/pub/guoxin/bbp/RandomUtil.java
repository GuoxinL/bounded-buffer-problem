package pub.guoxin.bbp;

/**
 * Created by guoxin on 17-10-4.
 */
public class RandomUtil {

    public static int randomInt(){
        int i = (int) (Math.random() * 1000);
        return i;
    }

    public static void main(String[] args) {
        int random = randomInt();
        System.out.println(random);
    }
}
