package singlepattern;

/**
 * Created by schaffer on 15-3-28.
 */
class Emperor {

    //生成emperor对象
    private static Emperor emperor = new Emperor();

    /**
     * 私有化,禁止创建对象
     */
    private Emperor() {
    }

    public static Emperor getEmperor() {
        return emperor;
    }

    public void responsePrint() {
        System.out.println("生成对象了");
    }
}

