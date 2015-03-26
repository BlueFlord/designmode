package bridgepattern;

//抽象公司
abstract class Corp {

    /**
     * 生成行为
     */
    protected abstract void produce();

    /**
     * 销售行为
     */
    protected abstract void sell();

    public void makeMoney() {
        produce();
        sell();
    }
}

//派生房地产公司
class HouseCorp extends Corp {

    @Override
    protected void produce() {
        System.out.println("房地产公司生产房子");
    }

    @Override
    protected void sell() {
        System.out.println("房地产公司卖房子");
    }

    public void makeMoney() {
        super.makeMoney();
    }

}

//服装公司
class ClothesCorp extends Corp {

    @Override
    protected void produce() {
        System.out.println("服装生产服装");
    }

    @Override
    protected void sell() {
        System.out.println("服装公司卖服装");
    }

    public void makeMoney() {
        super.makeMoney();
    }

}

public class Client {
    public static void main(String args[]){
        System.out.println("看房地产公司怎么赚钱");
        HouseCorp houseCorp=new HouseCorp();
        houseCorp.makeMoney();
        System.out.println("\n");
        System.out.println("看服装公司怎么赚钱");
        ClothesCorp clothesCorp=new ClothesCorp();
        clothesCorp.makeMoney();
    }
}
