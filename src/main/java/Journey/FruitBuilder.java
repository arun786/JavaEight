package Journey;

import java.util.ArrayList;
import java.util.List;

public class FruitBuilder {

    private static List<Fruit> lst = new ArrayList<Fruit>();

    public FruitBuilder() {
        Fruit f1 = new Fruit("Apple", "Green", "10");
        Fruit f2 = new Fruit("Apple", "Red", "20");
        Fruit f3 = new Fruit("Orange", "orange", "30");
        lst.add(f1);
        lst.add(f2);
        lst.add(f3);
    }

    public static List<Fruit> generateFruits() {
        return lst;
    }
}
