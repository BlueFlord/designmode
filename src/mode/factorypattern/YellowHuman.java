package factorypattern;

/**
 * 派生子类
 * Created by schaffer on 15-3-29.
 */
public class YellowHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黄色人种");
    }

    @Override
    public void talk() {
        System.out.println("黄色人种说话");
    }
}
