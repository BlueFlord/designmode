package buildermodel;

import java.util.ArrayList;

/**
 * Created by schaffer on 15-4-1.
 */
class Director {

    private ArrayList<String> sequence = new ArrayList<String>();

    private BenzBuilder benzBuilder = new BenzBuilder();

    public BenzModel getBenzModel() {
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequence(sequence);

        return (BenzModel) this.benzBuilder.getCarModel();
    }
}
