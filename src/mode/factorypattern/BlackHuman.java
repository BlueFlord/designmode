package factorypattern;

/**
 * 派生子类
 * Created by schaffer on 15-3-29.
 */
public class BlackHuman implements Human {

    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话");
    }

    public void getSex(){
        System.out.println("我的性别是......");
    }
}
