package templatepattern;

/**
 * 汽车模型
 * Created by schaffer on 15-3-30.
 */
public abstract class HummerModle {

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected boolean isAlarm() {
        return true;
    }

    /**
     * 定义逻辑
     */
    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
}
