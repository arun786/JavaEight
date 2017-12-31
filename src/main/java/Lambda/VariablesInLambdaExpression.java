package Lambda;

public class VariablesInLambdaExpression {
    int x = 20; //Class level variables can be changed in the lambda Expression

    public void m2() {
        int y = 10; //Local variables are final and cannot be changed
        interf i = () -> {
            x = 30;
            System.out.println(x);
            System.out.println(y);
        };
        i.m1();
    }

    public static void main(String[] args) {
        VariablesInLambdaExpression v = new VariablesInLambdaExpression();
        v.m2();
    }
}
interface interf {
    public void m1();
}
