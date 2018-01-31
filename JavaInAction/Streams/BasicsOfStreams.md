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

   ## Filter 
   
   Filter takes a lambda to exclude certain number of elements from the list.
    
   ## use of Map in Streams
   
   Map takes a lambda to transform an element into another one or to extract an information.
   
        /**
        * @return list -> stream -> filter -> map to names -> collect to a list
        */
        public static List<String> getNamesOfDishesWhereCalorieMoreThan300() {
           return menu.stream().filter(dish -> dish.getCalories() > 300).map(dish -> dish.getName()).collect(Collectors.toList());
        }
        
   ## use of Limit in streams
   
   Limit truncates a stream to contain no more element than the one specified in the limit.
   
     
        /**
        * @return list -> streams -> filter -> map -> limit -> collect to a list
        */
        public static List<String> get3DishesWhereCalorieMoreThan300() {
           return menu.stream().filter(dish -> dish.getCalories() > 300).map(dish -> dish.getName()).limit(3)
                   .collect(Collectors.toList());
        }
   ## Collect
   
   It converts a stream into another form, in the above case it is list.