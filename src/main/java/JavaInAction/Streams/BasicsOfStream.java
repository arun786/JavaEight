package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * This is an immutable class
 */
class Dish {
    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;

    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dish{");
        sb.append("name='").append(name).append('\'');
        sb.append(", vegetarian=").append(vegetarian);
        sb.append(", calories=").append(calories);
        sb.append(", type=").append(type);
        sb.append('}');
        return sb.toString();
    }

    public enum Type {
        MEAT, FISH, OTHER
    }
}

public class BasicsOfStream {

    public static void main(String[] args) {

        List<Dish> dishes = getTheDishObjectForDishesWhereCalorieIsLessThan300();
        dishes.forEach(dish -> {
            System.out.println(dish);
        });


    }

    public static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", false, 530, Dish.Type.OTHER),
            new Dish("rice", false, 120, Dish.Type.OTHER),
            new Dish("fruit", false, 800, Dish.Type.OTHER),
            new Dish("prawns", false, 800, Dish.Type.FISH)
    );

    public static List<Dish> getTheDishObjectForDishesWhereCalorieIsLessThan300() {
        return menu.stream().filter(d -> d.getCalories() < 300).collect(Collectors.toList());
    }
}
