package singlepattern;

/**
 * Created by schaffer on 15-3-28.
 */
public class Client {
    public static void main(String args[]) {
        /*Emperor emperor = Emperor.getEmperor();
        emperor.responsePrint();*/
        for (int i = 0; i < 10; i++) {
            EmperorExpand emperorExpand = EmperorExpand.getEmperor();
            emperorExpand.say();
        }
    }

}