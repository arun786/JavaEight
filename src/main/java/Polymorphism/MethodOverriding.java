package Polymorphism;

public class MethodOverriding {

    public static void main(String[] args) {

        Parent p = new Child();
        p.rule1(10); //Child class rule 1...Method signature should be the same
        p.rule2(10); //Child class rule 2..return type should be same at primitive level
        p.rule3(10); //Child class rule 3...return type is Child class, this is called Covariance
        p.rule5(); //Parent class which is static method, cannot be overridden, this is called method hiding
        // p.rule6(); Not possible to override a private method
        p.rule7(); //Child ...Parent class had default..child class can be either default or public access modifier
        p.rule7("a");//Child ...Parent class had protected..child class can be either protected or public access modifier


    }


    //rule 1 : Method Signature should be same for overridden method and overriding method
    //rule 2 : return type in overridden method and overriding method should be same at Primitive level
    //rule 3 : Covariant return type allowed in Method overriding method and overridden method
    //rule 4 : final methods cannot be overridden
    //rule 5 : static methods are not overridden, it is called method hiding
    //rule 6 : private methods cannot be overridden
    //rule 7 : overriding methods should not have restrictive access modifier
}


class Parent {
    public void rule1(int a) {
        System.out.println("Parent class rule 1....Method signature should be the same");
    }

    public int rule2(int a) {
        System.out.println("Parent class rule 2...return type should be same at primitive level");
        return 10;
    }

    public Shape rule3(int a) {
        System.out.println("Parent class rule 3... return type is Parent class Shape, this is called Covariance");
        return new Shape();
    }

    public static void rule5() {
        System.out.println("Parent class which is static method, cannot be overridden, this is called method hiding");
    }

    private void rule6() {
        System.out.println("Parent class has a private method, which cannot be overridden");
    }

    void rule7() {
        System.out.println("Parent class had default..child class can be either default or public access modifier");
    }

    protected void rule7(String a) {
        System.out.println("Parent class had protected..child class can be either protected or public access modifier");
    }
}


class Child extends Parent {
    public void rule1(int a) {
        System.out.println("Child class rule 1...Method signature should be the same");
    }

    public int rule2(int a) {
        System.out.println("Child class rule 2..return type should be same at primitive level");
        return 10;
    }

    public Color rule3(int a) {
        System.out.println("Child class rule 3...return type is Child class, this is called Covariance");
        return new Color();
    }

    public static void rule5() {
        System.out.println("Child class which is static method, cannot be overridden, this is called method hiding");
    }

    private void rule6() {
        System.out.println("Parent class has a private method, which cannot be overridden");
    }

    public void rule7() {
        System.out.println("Child ...Parent class had default..child class can be either default or public access modifier");
    }

    protected void rule7(String a) {
        System.out.println("Child ...Parent class had protected..child class can be either protected or public access modifier");
    }
}


class Shape {
}

class Color extends Shape {
}
