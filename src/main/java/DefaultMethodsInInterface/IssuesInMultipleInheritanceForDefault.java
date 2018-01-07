package DefaultMethodsInInterface;

public class IssuesInMultipleInheritanceForDefault implements Right, Left {

    @Override
    public void m1() {
        System.out.println("Main Implementation");
        Right.super.m1(); //this will call the Right Interface default m1
        Left.super.m1(); //this will call the Left Interface default m1
    }

    public static void main(String[] args) {
        IssuesInMultipleInheritanceForDefault ob = new IssuesInMultipleInheritanceForDefault();
        ob.m1();
    }
}

interface Right {
    default void m1() {
        System.out.println("Right interface...");
    }
}

interface Left {
    default void m1() {
        System.out.println("Left interface...");
    }
}
