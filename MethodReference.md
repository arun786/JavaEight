# Method Reference

    /**
     * :: is used for Method reference, the argument type should be same and
     * number of arguments should be same
     */
    public class MethodReference {
    
        public static void main(String[] args) {
    
            interf i = MethodReference::m2; //Method Reference
            i.m1();
    
            interf3 i3 = new MethodReference()::m3;
            String str = i3.m2();
            System.out.println(str);
        }
    
        public static void m2() {
            System.out.println("Method Reference of m2...");
        }
    
        public String m3() {
            System.out.println("Instance Method m3...");
            return "Method Reference returning String";
        }
    }
    
    interface interf {
        void m1();
    }
    
    interface interf3 {
        String m2();
    }
