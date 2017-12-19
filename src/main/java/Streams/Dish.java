package Streams;

public class Dish {
    private String name;
    private Integer calorie;

    public Dish(String name, Integer calorie) {
        this.name = name;
        this.calorie = calorie;
    }

    public String getName() {
        return name;
    }

    public Integer getCalorie() {
        return calorie;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                '}';
    }
}
