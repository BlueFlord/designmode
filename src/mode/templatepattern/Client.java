package templatepattern;

/**
 * Created by schaffer on 15-3-30.
 */
public class Client {

    public static void main(String args[]) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarmFlag(true);
        hummerH1Model.run();
    }
}
