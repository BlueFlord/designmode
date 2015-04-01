package buildermodel;

/**
 * Created by schaffer on 15-4-1.
 */
class BenzModel extends CarModel {

    @Override
    protected void start() {
        System.out.println("奔驰车跑起来了");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停止了");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰车响了");
    }

    @Override
    protected void engineBoom() {
        System.out.println("奔驰车引擎");
    }
}
