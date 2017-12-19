package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUse {

    public List<Dish> getDishWhoseCalorieIsLessThan100() {
        List<Dish> lstDish = dishBuilder();
        return lstDish.stream().filter(d -> d.getCalorie() < 100).collect(Collectors.toList());
    }

    public List<Dish> getDishCalorieGreaterThan100InSortedOrder() {
        List<Dish> lstDish = dishBuilder();
        return lstDish.stream()
                .filter(d -> d.getCalorie() > 100)  //Select Dishes which are greater than 100
                .sorted(Comparator.comparing(Dish::getCalorie)) //Sort it using a comparator
                .collect(Collectors.toList()); //Collect in a list
    }

    public List<String> getDishNameCalorieGreaterThan100InSortedOrder() {
        List<Dish> lstDish = dishBuilder();
        return lstDish.stream()
                .filter(d -> d.getCalorie() > 100)
                .sorted(Comparator.comparing(Dish::getCalorie))
                .map(Dish::getName)
                .collect(Collectors.toList());
    }


    public List<Dish> dishBuilder() {
        List<Dish> lstDish = new ArrayList<>();
        lstDish.add(new Dish("Dosa", 300));
        lstDish.add(new Dish("Pizza", 500));
        lstDish.add(new Dish("Burger", 50));
        lstDish.add(new Dish("Roti", 40));

        return lstDish;
    }
}
