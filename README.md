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

Example

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

Step 3 : we require only green fruits. 

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


Below is an example where we code using before java 8.


