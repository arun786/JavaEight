# Constructor Reference

    package MethodReference;
    
    public class ConstructorReference {
    
        public static void main(String[] args) {
            /**
             * Using Lambda Reference
             */
            ConstructorRef c = () -> new Sample();
            Sample s = c.get();
            s.LetsGoForAParty();
    
            /**
             * Using Method reference
             */
    
            ConstructorRef c1 = Sample::new;
            Sample s1 = c1.get();
            s1.LetsGoForAParty();
        }
    }
    
    interface ConstructorRef {
        Sample get();
    }
    
    /**
     * Create a class for Constuctor reference
     */
    class Sample {
        public Sample() {
            System.out.println("Sample called");
        }
    
        public void LetsGoForAParty() {
            System.out.println("Lets go for a party....");
        }
    
    }
