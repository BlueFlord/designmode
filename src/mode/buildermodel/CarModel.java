package buildermodel;

import java.util.ArrayList;

/**
 * 车类的抽象模型
 * Created by schaffer on 15-4-1.
 */
abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();   //车辆启动顺序控制

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = sequence.get(i);
            if (actionName.equalsIgnoreCase("start"))
                this.start();
            else if (actionName.equalsIgnoreCase("stop"))
                this.stop();
            else if (actionName.equalsIgnoreCase("alarm"))
                this.alarm();
            else if (actionName.equalsIgnoreCase("engine boom"))
                this.engineBoom();
        }
    }

    final public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

}
