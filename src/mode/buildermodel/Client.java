package buildermodel;

/**
 * Created by schaffer on 15-4-1.
 */
public class Client {
    public static void main(String args[]) {
        Director director = new Director();   //导演类控制构建模型
        director.getBenzModel().run();

    }
}
