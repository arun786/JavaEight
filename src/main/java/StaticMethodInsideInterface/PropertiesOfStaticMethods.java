package StaticMethodInsideInterface;

/**
 * We cannot override a static method of an Interface
 */
public class PropertiesOfStaticMethods implements color {
    public static void main(String[] args) {
        /**
         * We can directly call static method red of interface by
         * using interfaceName.staticMethod
         */
        color.red();
        /**
         * This will call red of main class
         */
        red();
    }

    /**
     * This is not overriding, this is a seperate method and has no relation
     * with interface method, we can have different access modifier too.
     * we can have a signature of the method without static
     */
    public static void red() {
        System.out.println("This is red of parent class");
    }
}

interface color {
    /**
     * Static method inside an interface
     */
    public static void red() {
        System.out.println("This is red of an Interface...");
    }
}
