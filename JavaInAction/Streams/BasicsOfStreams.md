# Basic Of Streams

    public static List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french fries", false, 530, Dish.Type.OTHER),
                new Dish("rice", false, 120, Dish.Type.OTHER),
                new Dish("fruit", false, 800, Dish.Type.OTHER),
                new Dish("prawns", false, 800, Dish.Type.FISH)
        );
    
        /**
         *
         * @return
         *
         * list -> stream -> filter -> collect to a List
         */
        public static List<Dish> getTheDishObjectForDishesWhereCalorieIsLessThan300() {
            return menu.stream().filter(d -> d.getCalories() < 300).collect(Collectors.toList());
        }

