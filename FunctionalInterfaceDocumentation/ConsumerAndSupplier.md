# Consumer Interface 

    /**
     * Consumer function will have one input type and no return type
     */
    Consumer<String> c = s -> System.out.println(s);
    c.accept("arun");
    
# Supplier Interface

    Supplier<String> s = () -> {
        String array[] = {"arun", "Adwiti", "pushpa", "sachin"};
        int number = (int) (Math.random() * 3 + 1);
        return array[number];
    };
    System.out.println(s.get());