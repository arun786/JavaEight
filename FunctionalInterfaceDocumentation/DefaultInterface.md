# Default Interface 

        public class DefaultMethodInInterface implements defaultInter, defaultInterOverriden {
        
            public static void main(String[] args) {
                DefaultMethodInInterface ob = new DefaultMethodInInterface();
                ob.m1();
                ob.m2();
            }
        
            @Override
            public void m2() {
                System.out.println("Inside the main class which has been overridden");
            }
        }
        
        interface defaultInter {
            default void m1() {
                System.out.println("Default methods in Interface...");
            }
        }
        
        interface defaultInterOverriden {
            default void m2() {
                System.out.println("Default methods...");
            }
        }

# Issues in Default method for Multiple Inheritance

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
