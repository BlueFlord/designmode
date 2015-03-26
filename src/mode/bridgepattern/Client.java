package bridgepattern;

/*
//抽象公司
abstract class Corp {

    //生成行为
    protected abstract void produce();

    //销售行为
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
*/

interface Product {

    //生成行为
    public void beProducted();

    //销售行为
    public void beSelled();

}

//生产房子
class House implements Product {

    @Override
    public void beProducted() {
        System.out.println("房子被生产出来");
    }

    @Override
    public void beSelled() {
        System.out.println("房子被销售");
    }
}

//生产Ipod
class IPod implements Product {

    @Override
    public void beProducted() {
        System.out.println("IPod被生产出来");
    }

    @Override
    public void beSelled() {
        System.out.println("IPod被销售");
    }
}

//公司类,公司生产产品
abstract class Corp {
    private Product product;

    //聚合关系
    public Corp(Product product) {
        this.product = product;
    }

    //赚钱
    public void makeMoney() {
        product.beProducted();
        product.beSelled();
    }
}

//派生房地产公司
class HouseCorp extends Corp {

    public HouseCorp(Product product) {
        super(product);
    }
}

//派生服装公司
class ClothesCorp extends Corp {

    public ClothesCorp(Product product) {
        super(product);
    }
}

public class Client {
    public static void main(String args[]) {
        //房地产公司盖房子
        House house = new House();
        HouseCorp houseCorp = new HouseCorp(house);
        houseCorp.makeMoney();

        //服装公司生产ipod
        IPod iPod = new IPod();
        ClothesCorp clothesCorp = new ClothesCorp(iPod);
        clothesCorp.makeMoney();
    }
}