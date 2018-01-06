# Anonymous Inner Class Property

Variables defined inside an inner class are instance variables for the inner class
which can be accessed using this.<variableName>.

Below example will give an idea of Instance Variables.

        public class VariablesInAnonymousClass {
            int x = 20;
        
            public static void main(String[] args) {
                VariablesInAnonymousClass test = new VariablesInAnonymousClass();
                test.m2();
            }
        
            void m2() {
                interf i = new interf() {
                    int x = 30;
        
                    @Override
                    public void m1() {
                        System.out.println(this.x); //o/p will be 30
                        System.out.println(VariablesInAnonymousClass.this.x); //O/p will be 20
                    }
                };
                i.m1();
            }
        }
        
        interface interf {
            void m1();
        }


