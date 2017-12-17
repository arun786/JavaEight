package Journey;

import java.util.ArrayList;
import java.util.List;

public class Journey {

    /**
     * @return
     */
    public List<Fruit> filterGreenApples() {
        List<Fruit> lstFruit = FruitBuilder.generateFruits();
        List<Fruit> greenColor = new ArrayList<Fruit>();
        for (Fruit fruit : lstFruit) {
            if ("green".equals(fruit.getColor())) greenColor.add(fruit);
        }
        return greenColor;
    }
}
