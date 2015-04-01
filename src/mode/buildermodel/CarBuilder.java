package buildermodel;

import java.util.ArrayList;

/**
 * Created by schaffer on 15-4-1.
 */
abstract class CarBuilder {

    /**
     * 建造者设置启动顺序
     *
     * @param sequence
     */
    public abstract void setSequence(ArrayList<String> sequence);

    /**
     * 得到设置启动顺序的车模型
     *
     * @return
     */
    public abstract CarModel getCarModel();

}
