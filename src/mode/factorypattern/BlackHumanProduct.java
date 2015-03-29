package factorypattern;

/**
 * Created by schaffer on 15-3-29.
 */
public class BlackHumanProduct implements HumanFactory {
    @Override
    public Human product() {
        return new BlackHuman();
    }
}
