# Lambda Expressions in Java

Lambda expressions are anonymous functions, basically methods declared without names but can be passed
as arguments to a method.

What is Lambda Expression

1. It is an Anonymous function
2. It is a function which means it is not associated to a class and can be passed around 
3. It acts like a normal method, which means it has got a
    1. Body 
    2. Return type
    3. list of parameters.
    4. list of exceptions.
    
Lambda expression is composed of 
    parameters, an arrow and a body.
    
    
    Basic Syntax is 
    {parameters} -> { statements }
    
Example : Fruit class which will have name, color and weight

Requirement is to filter green fruits.

public class Fruit {
    
    private String name;
    private String color;
    private String weight;

    public Fruit(String name, String color, String weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

Second Step is to create a builder which will build a list of fruit.

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

Step 3 : we require only green fruits. Possible solution before Java 8
was as below.

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

Step 4 : Test Class

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class JourneyTest {

    @Test
    public void filterGreenApples() {
        Journey j = new Journey();
        List<Fruit> lstFruit = j.filterGreenApples();
        lstFruit.forEach(fruit -> {
            assertEquals(fruit.getColor(), "green");
        });
    }
}

Clients requirement changes and now we need 
1. green fruit
2. fruit whose weight is less than 20.

The below changes needs to be done in Java8.


    import java.util.ArrayList;

    import java.util.List;

    public class SecondAttempt {

    public List<Fruit> GetFruitsWhichAreGreen() {

        List<Fruit> lstFruits = FruitBuilder.generateFruits();
        List<Fruit> resultOfGreenFruit = filter(lstFruits, new FruitPredicateWithGreenColor());
        return resultOfGreenFruit;
    }

    public List<Fruit> getFruitsGreaterThan10(){

        List<Fruit> lstFruits = FruitBuilder.generateFruits();
        List<Fruit> resultOfFruitGreaterThan10 = filter(lstFruits, new FruitPredicateWhereWeightIsGreaterThan10());
        return resultOfFruitGreaterThan10;
    }

    public static List<Fruit> filter(List<Fruit> lstFruits, FruitPredicate p) {

        List<Fruit> result = new ArrayList<>();
        lstFruits.forEach((f) -> {
            if (p.test(f)) {
                result.add(f);
            }
        });
        return result;
    }
}


    interface FruitPredicate {
        boolean test(Fruit fruit);
    }
    
    /**
     * this will filter out fruits where color is green
     */
    class FruitPredicateWithGreenColor implements FruitPredicate {
        @Override
        public boolean test(Fruit fruit) {
            return fruit.getColor().equals("green");
        }
    }
    
    /**
     * This will filter fruits whose weight is greater than 10
     */
    class FruitPredicateWhereWeightIsGreaterThan10 implements FruitPredicate {
    
        @Override
        public boolean test(Fruit fruit) {
            return fruit.getWeight() > 10;
        }
    }

# Third Attempt

Using Anonymous class
    
    import java.util.ArrayList;
    import java.util.List;
    
    public class ThirdAttempt {
    
        public List<Fruit> getGreenFruits() {
    
            List<Fruit> lstFruits = FruitBuilder.generateFruits();
            List<Fruit> result = filter(lstFruits, new Predicate() {
                @Override
                public boolean test(Fruit fruit) {
                    return "green".equals(fruit.getColor());
                }
            });
            return result;
        }
    
        public List<Fruit> getFruitsGreaterThan10() {
    
            List<Fruit> lstFruits = FruitBuilder.generateFruits();
            List<Fruit> response = filter(lstFruits, new Predicate(){
                @Override
                public boolean test(Fruit fruit) {
                    return fruit.getWeight() > 10;
                }
            });
            return response;
        }
    
        public static List<Fruit> filter(List<Fruit> lstFruits, Predicate p) {
            List<Fruit> result = new ArrayList<>();
            lstFruits.forEach(fruit -> {
                if (p.test(fruit)) {
                    result.add(fruit);
                }
            });
            return result;
        }
    }
    
    interface Predicate {
        boolean test(Fruit fruit);
    }

    import org.junit.Before;
    import org.junit.Test;
    
    import static junit.framework.TestCase.assertTrue;
    import static org.junit.Assert.assertEquals;
    
    public class ThirdAttemptTest {
    
        private ThirdAttempt ta;
    
        @Before
        public void setup() {
            ta = new ThirdAttempt();
        }
    
        @Test
        public void getGreenFruits() {
            ta.getGreenFruits().forEach(fruit -> {
                assertEquals(fruit.getColor(), "green");
            });
        }
    
        @Test
        public void getFruitsGreaterThan10() {
            ta.getFruitsGreaterThan10().forEach(fruit -> {
                assertTrue(fruit.getWeight() > 10);
            });
        }
    }


# Fourth Attempt

using Lambda Expressions

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

   Test class

    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    
    import static org.junit.Assert.assertEquals;
    import static org.junit.Assert.assertTrue;
    
    @RunWith(JUnit4.class)
    public class FourthAttemptTest {
        private FourthAttempt fa;
    
        @Before
        public void setUp() {
            fa = new FourthAttempt();
        }
    
        @Test
        public void getGreenFruits() {
            fa.getGreenFruit().forEach(fruit -> {
                assertEquals(fruit.getColor(), "green");
            });
        }
    
        public void getFruitsGreaterThan10() {
            fa.getFruitGreaterThan10().forEach(fruit -> {
                assertTrue(fruit.getWeight() > 10);
            });
        }
    }





