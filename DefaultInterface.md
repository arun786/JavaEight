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
