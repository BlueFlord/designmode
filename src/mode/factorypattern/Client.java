package factorypattern;

/**
 * Created by schaffer on 15-3-29.
 */
public class Client {
    public static void main(String args[]) {
        HumanFactory factory1 = new YellowHumanProduct();
        HumanFactory factory2 = new BlackHumanProduct();
        Human yelloHuman = factory1.product();
        Human blackHuman = factory2.product();
    }
}