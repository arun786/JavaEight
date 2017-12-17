package Journey;

import java.util.ArrayList;
import java.util.List;

public class FourthAttempt {

    public List<Fruit> getGreenFruit() {
        List<Fruit> greenFruit = FruitBuilder.generateFruits();
        return filter(greenFruit, (Fruit fruit) -> "green".equals(fruit.getColor()));
    }

    public List<Fruit> getFruitGreaterThan10() {
        List<Fruit> fruits = FruitBuilder.generateFruits();
        return filter(fruits, (Fruit fruit) -> fruit.getWeight() > 10);
    }

    public static List<Fruit> filter(List<Fruit> fruits, predicate p) {
        List<Fruit> response = new ArrayList<>();
        fruits.forEach(fruit -> {
            if (p.test(fruit)) {
                response.add(fruit);
            }
        });
        return response;
    }
}

interface predicate {
    boolean test(Fruit fruit);
}


