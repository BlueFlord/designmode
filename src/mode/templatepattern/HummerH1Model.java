package templatepattern;

/**
 * Created by schaffer on 15-3-30.
 */
public class HummerH1Model extends HummerModle {
    private boolean alarmFlag = false;

    @Override
    protected void start() {
        System.out.println("悍马1启动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马1停止");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马1鸣");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马1引擎启动");
    }

    @Override
    public boolean isAlarm() {
        return this.alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }


}
