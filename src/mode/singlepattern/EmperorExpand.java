package singlepattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 产生固定个数的实例
 *
 * @author schaffer
 * @date 2015.3.28
 */
public class EmperorExpand {
    private String name;

    private static final int NUMOFEMPEROR = 3;
    private static List<EmperorExpand> emperorExpandList = new ArrayList<EmperorExpand>();
    private static int numberofEmperor = 0;

    /**
     * 只实例化一次,静态代码块创建对象
     */
    static {
        for (int i = 0; i < NUMOFEMPEROR; i++) {
            emperorExpandList.add(new EmperorExpand(i + "皇帝"));
        }
    }

    private EmperorExpand() {
    }

    /**
     * 为对象创建姓名
     *
     * @param name
     */
    private EmperorExpand(String name) {
        this.name = name;
    }

    /**
     * 获取对象
     */
    public static EmperorExpand getEmperor() {
        Random random = new Random();
        numberofEmperor = random.nextInt(NUMOFEMPEROR);
        return emperorExpandList.get(numberofEmperor);
    }

    /**
     * 打印对象信息
     */
    public void say() {
        System.out.println("我的姓名是" + this.name);
    }
}
