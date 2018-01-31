package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BasicsOfStreams {

    public static List<Dish> menu = Arrays.asList(
            new Dish("pork", false, 800, Dish.Type.MEAT),
            new Dish("beef", false, 700, Dish.Type.MEAT),
            new Dish("chicken", false, 400, Dish.Type.MEAT),
            new Dish("french fries", false, 530, Dish.Type.OTHER),
            new Dish("rice", false, 120, Dish.Type.OTHER),
            new Dish("fruit", false, 800, Dish.Type.OTHER),
            new Dish("prawns", false, 800, Dish.Type.FISH)
    );

    public static void main(String[] args) {

        /**
         * List ->  stream and when we collect it , it will return stream of Dish and when
         * we collect it into Collectors.toList(), it is again converted to list.
         */

        List<Dish> streamDish = menu.stream().collect(Collectors.toList());
        System.out.println(streamDish);
        /*output will be as below*/
        /*[Dish{name='pork', vegetarian=false, calories=800, type=MEAT}, Dish{name='beef', vegetarian=false, calories=700, type=MEAT}, Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}, Dish{name='french fries', vegetarian=false, calories=530, type=OTHER}, Dish{name='rice', vegetarian=false, calories=120, type=OTHER}, Dish{name='fruit', vegetarian=false, calories=800, type=OTHER}, Dish{name='prawns', vegetarian=false, calories=800, type=FISH}]*/

        /**
         * When we apply filter, it returns filtered stream, which again is collected inside a list.
         */
        List<Dish> filterDish = menu.stream().filter(dish -> dish.getType().equals(Dish.Type.MEAT)).collect(Collectors.toList());
        System.out.println(filterDish);
        /*output will as below*/
        /*[Dish{name='pork', vegetarian=false, calories=800, type=MEAT}, Dish{name='beef', vegetarian=false, calories=700, type=MEAT}, Dish{name='chicken', vegetarian=false, calories=400, type=MEAT}]*/

        /**
         * use of collectors.toMap
         */
        Map<String, Dish.Type> mapOfNameAndType = menu.stream().collect(Collectors.toMap(x -> x.getName(), x -> x.getType()));
        System.out.println(mapOfNameAndType);
        /*output will as below*/
        /*{chicken=MEAT, fruit=OTHER, beef=MEAT, rice=OTHER, pork=MEAT, prawns=FISH, french fries=OTHER}*/

        /**
         * if you want to filter meat and store the the name and calorie in a map
         */

        Map<String,Integer> meat = menu.stream().filter(dish -> dish.getType().equals(Dish.Type.MEAT)).collect(Collectors.toMap(x -> x.getName(), x->x.getCalories()));
        System.out.println(meat);

        /*output will be */
        /*{chicken=400, beef=700, pork=800}*/
    }
}
